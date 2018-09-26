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
        //Ayný dizi içinde ayný elemanýn birden fazla olmasýný
        //istemediðimiz durumlarda kullanýlýr
        //Sadece bir kez iþleme alýr

        HashSet<String> mySet = new HashSet<>();
        mySet.add("Rob");
        mySet.add("Rob");

        System.out.println(mySet.size());
        //Ýki kez Rob eklememize raðmen
        //Çýktýda size 1 olarak verildi

        //Map
        //Bir deðer ve onun karþýlýðýnda bir anahtar
        //saklamak için kullanýlýr

        HashMap<String,String> myHashMap = new HashMap<String,String>();
        myHashMap.put("name", "James");
        myHashMap.put("instrument", "Guitar");

        System.out.println(myHashMap.get("name"));

    }
}
