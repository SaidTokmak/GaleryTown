package com.said.galerytown.exception.enums;

public enum UserExceptionEnum {

    USER_NOT_FOUND("USER.0001", "User not found.");

    private final String code;
    private final String message;

    UserExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
