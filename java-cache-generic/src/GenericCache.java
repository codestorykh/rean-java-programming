import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;


public class GenericCache {

    private HashMap<String, CacheItem<?>> myCache = new HashMap<>();
    private static GenericCache genericCache;
    private final static Integer DEFAULT_EXPIRE_DURATION_MIN = 1;

    private GenericCache() {
    }

    public static GenericCache getInstance() {
        if (genericCache == null) genericCache = new GenericCache();
        return genericCache;
    }

    public <T> T getCacheItem(String key) throws CacheItemNotFound {
        CacheItem<T> cacheItem = (CacheItem<T>) myCache.get(key);
        if (cacheItem == null) throw new CacheItemNotFound();
        System.out.println(cacheItem.getExpireDateTime());
        if (cacheItem.isEvicted() || cacheItem.getExpireDateTime().compareTo(new Date()) < 0) {
            myCache.remove(key);
            return null;
        }
        return cacheItem.getCacheContent();
    }

    public <T> void addCacheItem(String key, CacheFunctionalInterface<T> function) {
        this.addCacheItem(key, function, Calendar.MINUTE, DEFAULT_EXPIRE_DURATION_MIN);
    }

    public <T> void addCacheItem(String key, CacheFunctionalInterface<T> function, Integer field, Integer amount) {
        Calendar expireDateTimeCalendar = Calendar.getInstance();
        expireDateTimeCalendar.add(field, amount);
        this.addCacheItem(key, function, expireDateTimeCalendar.getTime());
    }

    public <T> void addCacheItem(String key, CacheFunctionalInterface<T> function, Date expireDateTime) {
        CacheItem<T> cacheItem = (CacheItem<T>) myCache.get(key);
        if (cacheItem == null) {
            cacheItem = new CacheItem<>();
            cacheItem.setFunction(function);
            System.out.println("Expired date time: " + expireDateTime);
            cacheItem.setExpireDateTime(expireDateTime);
            cacheItem.setLastUpdateDateTime(new Date());
            cacheItem.setCacheContent(function.execute());
            myCache.put(key, cacheItem);
        } else {
            if (cacheItem.isEvicted() || cacheItem.getExpireDateTime().compareTo(new Date()) < 0) {
                cacheItem.setExpireDateTime(expireDateTime);
                cacheItem.setLastUpdateDateTime(new Date());
                cacheItem.setCacheContent(function.execute());
            }
        }
    }

    public void evict(String key) {
        if (myCache.get(key) != null) myCache.get(key).setEvicted(true);
    }

}
