package com.llvvlv00.jdk17learn;

public class StringContactFeature {
    public String testStringContactFeature() {
        return """
                <html>
                    <body>
                        <h1>Hello, Wolrd!</h1>
                    </body>
                </html>
                """;
    }

    public void testStringContactFeature2() {
        String html = """
                <html>\s
                    <body>
                        <h1>Hello, Wolrd!</h1>
                    </body>
                </html>
                """;
        System.out.println(html);
    }

    public static void main(String[] args) {
        StringContactFeature stringContactFeature = new StringContactFeature();
        stringContactFeature.testStringContactFeature2();
    }
}
