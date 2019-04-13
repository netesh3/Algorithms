package com.code;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Aser implements Serializable {
    private static final long serialVersionUID=1L;
    private static Aser INSTANCE;
    private Aser(){

    }
    String b;

    public String getA(){
        return this.b;
    }
    public void setA(String a){
        this.b = a;
    }
    public static Aser getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Aser();

        }
        return INSTANCE;
    }

//    private Object readResolve() throws ObjectStreamException {
//        return INSTANCE;
//    }
    private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
            if (INSTANCE == null) {
                INSTANCE = this;
            }
    }
}
