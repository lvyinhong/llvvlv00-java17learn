package com.llvvlv00.jdk17learn;

public class InstanceOfFeature {
    public void testInstanceOfFeature()
    {
        Object o = 1;
        if (o instanceof Integer i) {
            System.out.println(i.intValue());
        } else if (o instanceof String s) {
            System.out.println(s.charAt(0));
        }
    }
}
