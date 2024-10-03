package org.example;


public class IT24100733lab7Q2A {
    public static void main(String[] args) {
        int count=1;


        while (count<=4){
            int count2=1;
            while(count2<=5){
                System.out.print("$ ");
                count2++;
            }
            System.out.println();
            count++;
        }


        //
        //   OR
        //

        System.out.println("\n\n");
        count=1;
        while(count<=4){
            System.out.println("$ $ $ $ $");
            count++;
        }

    }
}