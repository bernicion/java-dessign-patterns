package com.bernic.patterns.creational.singleton;
/**
 * The Enum constants are implicitly static and final and you cannot change their values
 * once created.
 * You will get a compile time error when you attempt to explicitly instantiate an Enum object. As Enum gets loaded statically, it is
 * thread-safe. The clone method in Enum is final which ensures that enum constants never get cloned. Enum is inherently serializable, the serialization mechanism ensures that duplicate instances are never created as a result of deserialization. Instantiation
 * using reflection is also prohibited. These things ensure that no instance of an enum exists beyond the one defined by the enum
 * constants.
 */
public enum SingleEnum {
    SINGLETON_ENUM;

    int value;

    public void setValue(int value){
        this.value  = value;
    }

    public int getValue() {
        return value;
    }
}
