package com.codestroykh.generic.cache;

import java.util.Calendar;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello world!");
        var colorRedDesc = "Red is the color at the long wavelength" +
                " end of the visible spectrum of light, next to orange and opposite violet.";

        GenericCache genericCache = GenericCache.getInstance();
        genericCache.addCacheItem("dev.io", () -> "Dev.io");


        Colors colors = new Colors();
        colors.setCode("RED");
        colors.setName("Red");
        colors.setDescription(colorRedDesc);
        genericCache.addCacheItem(colors.getCode(), () -> colors, Calendar.MINUTE, 1);

        try {
         //   Thread.sleep(120000);
            Thread.sleep(100);
            var res = genericCache.getCacheItem("dev.io");
            if(null != res) {
                System.out.println("String cache: " + res);
            }else
                System.out.println("Cache not found");

            //genericCache.evict(colors.getCode());
            var colorCache = genericCache.getCacheItem(colors.getCode());
            if(null != colorCache) {
                System.out.println("Object cache: " + colorCache);
            }else
                System.out.println("Cache not found");

        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}