package com.design.doubleDimple.signleton;

/**
 * 第二种单例模式,相当于懒加载,在需要的时候,在创建
 */
public class LazySingleton {

    public LazySingleton() {
        System.out.println("the signle instance is created");
    }

    private static  LazySingleton instance = null;
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
