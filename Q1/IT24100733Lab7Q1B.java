import java.util.*;
class IT24100733Lab7Q1B{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
	int tot=0;
	double avg=0;
	for(int i=0 ; i<3 ; i++){
		System.out.println("Student "+(i+1));
		System.out.print("Enter Marks : ");
		for(int j=0 ; j<4 ; j++){
			int number=input.nextInt();
			tot+=number;
		}
		avg=tot/4;
		System.out.println("Average is : "+avg);
		
	       	if (avg>=75) {
            		System.out.println("Overall Grade is  : Distinction\n");
        	}else if (avg>=50) {
            		System.out.println("Overall Grade is  : Credit\n");
        	}else{
            		System.out.println("Overall Grade is  : Fail\n");
        	}


	}
                        
    }
}