import java.util.Scanner;
public class IT24100264Lab4Q2{
    public static void main(String[] args){
        Scanner myKey=new Scanner(System.in);
        System.out.print("Please enter exam marks(Out of 100): ");
        int examMarks=myKey.nextInt();
        if(examMarks>=0 && examMarks<=100){
            System.out.print("Please enter lab submission marks(Out of 100): ");
            int labMarks=myKey.nextInt();
	        if(labMarks>=0 && labMarks<=100){
            System.out.print("Please enter the percentage given for the exam: ");
            double percentageExm=myKey.nextDouble();
	    System.out.print("Please enter the percentage given for the lab subbmision: ");
            double percentageLab=myKey.nextDouble();
            double finalExm=(percentageExm/100)*examMarks;
            double finalLab=(percentageLab/100)*labMarks;
            double finalMarks=finalExm+finalLab;
            if(percentageExm+percentageLab==100){
                System.out.print("Final exam mark is : "+finalMarks);
            }
            else{
                System.out.print("The percentages must add up to 100. Terminating program");
            }
	}

       else {
            System.out.print("Invalid input for exam marks. Terminating the program.");
	}
}
        
        else {
            System.out.print("Invalid input for exam marks. Terminating the program.");
       }
    }
}  