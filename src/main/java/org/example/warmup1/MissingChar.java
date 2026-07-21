package org.example.warmup1;

public class MissingChar {
    public String missingChar(String str, int n) {
        str = str.substring(0,n) + str.substring(n+1);
        return str;
    }

}
