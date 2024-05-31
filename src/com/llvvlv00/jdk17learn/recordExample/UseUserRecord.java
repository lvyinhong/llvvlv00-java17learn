package com.llvvlv00.jdk17learn.recordExample;

public class UseUserRecord {
    public static void main(String[] args) {
        UserRecord llvvlv00 = new UserRecord(1L, "llvvlv00");
        UserRecord llvvlv01 = new UserRecord(1L, "llvvlv00");
        UserRecord llvvlv11 = new UserRecord(2L, "llvvlv11");

        System.out.println("llvvlv00.equals(llvvlv01) = " + llvvlv00.equals(llvvlv01));
    }
}
