package com.beyzakaynar.javalearning;

public class Variables {

    public static void main(String[] args) {

        //Integer = int
        //Double - Float
        //String
        //boolean

        int x = 5;
        int y = 4;
        int age = 19;

        int result = age*4/3;

        System.out.println(result);

        //////////////////////////

        final double pi = 3.14;
        //final deðiþkenimizi sabit yaptý

        double r = 5.0;

        System.out.println(2*pi*r);

        /////////////////////////////

        float a = 19.0f;
        //Sonuna f koyduðumuzda sistem float olduðunu anlar

        System.out.println(a*4/3);

        //////////////////////////////

        String name = "James";
        String surname = "Matt";
        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        /////////////////////////////

        boolean isAlive = true;
        isAlive = false;

        System.out.println(isAlive);


    }
}