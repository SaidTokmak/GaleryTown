package com.said.galerytown.model.enums;

public enum StorageType {
    DEVICE("device"),
    SERVER("server");

    private String name;

    StorageType(String name) {
        this.name = name;
    }
}
