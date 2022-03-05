package com.design.doubleDimple.signleton;

/**
 * 第一种单例模式
 */
public class SingletonOne {

    public SingletonOne() {
        System.out.println("the instanse is created");
    }

    private static SingletonOne singlenton = new SingletonOne();

    public static SingletonOne getInstance() {
        return singlenton;
    }
}
