package org.example.warmup1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if( negative == false && ((a<0 && b>0) || (a>0 && b<0))){
            return true ;
        } else if ( negative == true && a<0 && b<0){
            return true ;
        } else {
            return false;
        }
    }
}
