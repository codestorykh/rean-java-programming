

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        GenericCache genericCache = GenericCache.getInstance();
        genericCache.addCacheItem("dev.io", () -> "Dev.io");

        try {
            Thread.sleep(120000);
            var res = genericCache.getCacheItem("dev.io");
            if(null != res) {
                System.out.println(res);
            }else
                System.out.println("Cache not found");
        }catch (CacheItemNotFound itemNotFound) {
            itemNotFound.printStackTrace();
        }

    }
}