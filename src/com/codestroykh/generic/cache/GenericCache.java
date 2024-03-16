package com.codestroykh.generic.cache;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;


public class GenericCache {

    private final HashMap<String, CacheItem<?>> cacheItemHashMap = new HashMap<>();
    private static GenericCache genericCache;

    private GenericCache() {
    }

    public static GenericCache getInstance() {
        if (genericCache == null) genericCache = new GenericCache();
        return genericCache;
    }

    public <T> T getCacheItem(String key) {
        CacheItem<T> cacheItem = (CacheItem<T>) cacheItemHashMap.get(key);
        if(cacheItem == null)
            return null;
        if (cacheItem.isEvicted() || cacheItem.getExpireDateTime().compareTo(new Date()) < 0) {
            cacheItemHashMap.remove(key);
            return null;
        }
        return cacheItem.getCacheContent();
    }

    public <T> void addCacheItem(String key, CacheFunctionalInterface<T> function) {
        this.addCacheItem(key, function, Calendar.MINUTE, 1);
    }

    public <T> void addCacheItem(String key, CacheFunctionalInterface<T> function, Integer field, Integer amount) {
        Calendar expireDateTimeCalendar = Calendar.getInstance();
        expireDateTimeCalendar.add(field, amount);
        this.addCacheItem(key, function, expireDateTimeCalendar.getTime());
    }

    public <T> void addCacheItem(String key, CacheFunctionalInterface<T> function, Date expireDateTime) {
        CacheItem<T> cacheItem = new CacheItem<>();
        cacheItem.setFunction(function);
        cacheItem.setExpireDateTime(expireDateTime);
        cacheItem.setLastUpdateDateTime(new Date());
        cacheItem.setCacheContent(function.execute());
        cacheItemHashMap.put(key, cacheItem);

        System.out.println("Expired date time: " + expireDateTime);
        System.out.println("Cache key: " + key + " and value: " + function.execute());
    }

    public void evict(String key) {
        if (cacheItemHashMap.get(key) != null) {
            cacheItemHashMap.remove(key);
        }
    }

}
