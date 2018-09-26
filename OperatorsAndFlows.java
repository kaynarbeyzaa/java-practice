package com.beyzakaynar.javalearning;

public class OperatorsAndFlows {

    public static void main(String[] args) {

        int x =5;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x+5;
        System.out.println(x);

        int y = 4;

        System.out.println(x>y);
        System.out.println(x<=y);
        System.out.println(y!=x);
        System.out.println(x==y);
        y = 40;

        //and &&
        //or ||

        //if flows

        if (x>y){
            System.out.println("x is bigger than y");
        }
        else if (y>x){
            System.out.println("y is bigger than x");
        }
        else {
            System.out.println("x = y");
        }

        //Switch

        int day = 1;
        String dayString = "";

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                dayString = "Sunday";
                break;

        }

    }
}
