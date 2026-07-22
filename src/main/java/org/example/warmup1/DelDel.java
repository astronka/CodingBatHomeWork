package org.example.warmup1;

public class DelDel {
    public String delDel(String str) {
        if ( str.startsWith("del",1)){
            return str.substring(0,1).concat(str.substring(4));
        }
        return str;
    }
}
