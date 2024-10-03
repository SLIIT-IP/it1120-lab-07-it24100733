package org.example;



class IT24100733lab7Q2B{
    public static void main(String[] args) {
        int number=1;

        /////////  Using for loop

        for (int j = 1; j <=5; j++) {
            System.out.print(number+" - ");
            for (int i = 0; i < j; i++) {
               System.out.print(" * ");
            }
            System.out.println();
            number++;
        }


       /*
        /////////////////// Using while loop
        int count=1;

        int number1=1;
        while(count<=5){
            System.out.print(number1+" - ");

            int count1=0;
            while (count1<count){
                System.out.print(" * ");
                count1++;
            }
            System.out.println();
            count++;
            number1++;
        }
        */
    }
}