package com.code;

import java.io.*;

public class ABMain {
    public static void main(String[] args) throws Exception {
        Aser aser = Aser.getInstance();
        aser.setA("Anil GGGG");
//        FileOutputStream fileOutputStream = new FileOutputStream("/Users/neteshchiku/IdeaProjects/Algorithms/src/com/code/ser.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        System.out.println("Ser Start");
//        objectOutputStream.writeObject(aser);

        FileInputStream fileInputStream = new FileInputStream("/Users/neteshchiku/IdeaProjects/Algorithms/src/com/code/ser.txt");
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
        System.out.println("Der Start");
        Aser aser1 = (Aser) objectInputStream.readObject();
        System.out.println("value is: "+aser1.getA());
    }
}
