package com.design.doubleDimple.signleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 第三种单例模式,静态单例模式
 */
public class StaticSingleton {

    public StaticSingleton() {
        System.out.println("the singleton instance is created");
    }

    private static class SingletonHolder {
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        final StaticSingleton instance = SingletonHolder.instance;
        return instance;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0;i<10;i++) {
            executorService.submit(StaticSingleton::getInstance);
        }
        executorService.shutdownNow();
    }
}
