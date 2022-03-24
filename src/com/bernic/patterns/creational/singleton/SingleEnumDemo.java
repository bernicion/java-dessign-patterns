package com.bernic.patterns.creational.singleton;

public class SingleEnumDemo {

    public static void main(String[] args) {
        SingleEnum sc = SingleEnum.SINGLETON_ENUM;
        sc.setValue(3);
        System.out.println(sc.getValue());
    }


}

