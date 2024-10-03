import java.util.Scanner;
class IT24100733Lab7Q1A{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks for 4 Subjects ...\n");
        int count=0;
        int tot=0;
        double avg=0;
        while(count<4){
            System.out.print("Enter subject marks "+(count+1)+" : ");
            int number=input.nextInt();

            tot+=number;
            count++;
        }
        avg=tot/(count+1);
        System.out.println("Average is : "+avg);

        if (avg>=75) {
            System.out.println("Overall Grade is  : Distinction");
        }else if (avg>=50) {
            System.out.println("Overall Grade is  : Credit");
        }else{
            System.out.println("Overall Grade is  : Fail");
        }

        
    }

}