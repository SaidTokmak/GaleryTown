package com.said.galerytown.model.enums;

public enum ResourceType {
    IMAGE("image"),
    VIDEO("video");

    private String name;

    ResourceType(String name) {
        this.name = name;
    }
}
