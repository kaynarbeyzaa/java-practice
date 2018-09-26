package com.beyzakaynar.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {

       //Arrays

       String[] myArray = new String[4];

       myArray[0] = "James";
       myArray[1] = "Clara";
       myArray[2] = "John";
       myArray[3] = "Rob";

       System.out.println(myArray[0]);

       int[] myNumberArray = {1,2,3,4};

       System.out.println(myNumberArray[3]);

       //ArrayList

        ArrayList<String> myMusician = new ArrayList<>();
        myMusician.add("James");
        myMusician.add("Clara");
        myMusician.add(1,"John");
        myMusician.add("Rob");

        System.out.println(myMusician.get(0));
        System.out.println(myMusician.get(1));
        System.out.println(myMusician.get(2));
        System.out.println(myMusician.get(3));

        //Set
        //Ayn� dizi i�inde ayn� eleman�n birden fazla olmas�n�
        //istemedi�imiz durumlarda kullan�l�r
        //Sadece bir kez i�leme al�r

        HashSet<String> mySet = new HashSet<>();
        mySet.add("Rob");
        mySet.add("Rob");

        System.out.println(mySet.size());
        //�ki kez Rob eklememize ra�men
        //��kt�da size 1 olarak verildi

        //Map
        //Bir de�er ve onun kar��l���nda bir anahtar
        //saklamak i�in kullan�l�r

        HashMap<String,String> myHashMap = new HashMap<String,String>();
        myHashMap.put("name", "James");
        myHashMap.put("instrument", "Guitar");

        System.out.println(myHashMap.get("name"));

    }
}
