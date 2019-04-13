package com.code;

import java.io.Serializable;

public class Bser implements Serializable {
    private static final long serialVersionUID=1L;
    String a;

    public String getA(){
        return this.a;
    }
    public void setA(String a){
        this.a = a;
    }
}