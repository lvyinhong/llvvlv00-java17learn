package com.llvvlv00.jdk17learn;

public class SwitchCaseFeature {
    public void testSwitchCaseFeature() {
        var name = "徐庶";
        String alias = switch(name) {
            case "周瑜" -> "公瑾";
            case "徐庶" -> "元直";
            case "项羽" -> "楚霸王";
            case "刘邦" -> "汉高祖";
            default -> "未知";
        };
        System.out.println("alias: " + alias);
    }
    public void testSwitchCaseFeature2() {
        String name = "徐庶";
        String country = switch (name) {
            case "周瑜", "徐庶" -> "三国";
            case "项羽", "刘邦" -> "汉朝";
            default -> "未知";
        };
        System.out.println("country = " + country);
    }

    public void testSwitchCaseFeature3() {
        String name = "徐庶";
        String country = switch (name) {
            case "周瑜", "徐庶" -> {
                System.out.println("三国");
                yield "三国";
            }

            case "成吉思汗", "忽必烈" -> {
                System.out.println("元朝");
                yield "元朝";
            }
            case "项羽", "刘邦" -> {
                System.out.println("汉朝");
                yield "汉朝";
            }
            default -> {
                System.out.println("未知");
                yield "未知";
            }
        };
        System.out.println("国家: " + country);
    }

//    public String testSwitchCaseFeature4(Object o) {
//        return switch (o) {
//            case null -> "o is null";
//            case Integer i -> String.format("Integer i: %s", i);
//            case Long l -> String.format("Long l: %s", l);
//            case Double d -> String.format("Double d: %s", d);
//            case String s -> String.format("String s: %s", s);
//            default -> o.toString();
//        };
//    }
}
