package org.example;


import java.util.Scanner;
class IT24100733Lab7Q3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println("Customer "+(i+1));
            System.out.print("Enter Total Bill Amount : ");
            double billAmount = input.nextDouble();
            System.out.print("Enter Mode Of Payment ( C for Cash , O for Other ) : ");
            char paymentMethod=input.next().charAt(0);

            if (paymentMethod=='C' || paymentMethod=='c'){
                double discount = billAmount*5/100;
                System.out.println("Discount is : "+discount);
                System.out.println("Amount to be paid : "+(billAmount-discount+"\n"));
            }else if (paymentMethod=='o' || paymentMethod=='O'){
                System.out.println("No discount applicable...");
                System.out.println("Amount to be paid : "+billAmount+"\n");
            }else {
                System.out.println("Payment method is not valid...\n");
            }
        }



    }
}