import java.util.Scanner;
public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject 1 Marks");
        int mark1=sc.nextInt();
        System.out.println("Enter Subject 2 Marks");
        int mark2=sc.nextInt();
        System.out.println("Enter Subject 3 Marks");
        int mark3=sc.nextInt();
        System.out.println("Enter Subject 4 Marks");
        int mark4=sc.nextInt();
        System.out.println("Enter Subject 5 Marks");
        int mark5=sc.nextInt();
        float totalMarks=(mark1+mark2+mark3+mark4+mark5);
        System.out.println("Total Marks:"+totalMarks);
        totalMarks/=5;
        System.out.println("Average Percentage:"+totalMarks);
        if (totalMarks>=90){
            System.out.println("Grade:O");
        }else if (totalMarks>=80){
            System.out.println("Grade:E");
        }
        else if (totalMarks>=70){
            System.out.println("Grade:A");
        }
        else if (totalMarks>=60){
            System.out.println("Grade:B");
        }
        else if (totalMarks>=50){
            System.out.println("Grade:C");
        }
        else if (totalMarks>=40){
            System.out.println("Grade:D");
        }
        else{
            System.out.println("Fail");
        }
    }
}