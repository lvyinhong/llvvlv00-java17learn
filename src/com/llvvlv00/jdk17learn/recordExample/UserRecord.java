package com.llvvlv00.jdk17learn.recordExample;

public record UserRecord(Long userId, String userName) {
    public UserRecord(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}


