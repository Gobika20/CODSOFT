import java.util.Scanner;

class Marks{
    int tamil,english,maths,science,social;
    public void getMarks(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Marks out of 100:");
        System.out.println("Enter the Tamil Mark:");
        tamil=input.nextInt();
        System.out.println("Enter the English Mark:");
        english=input.nextInt();
        System.out.println("Enter the Maths Mark:");
        maths=input.nextInt();
        System.out.println("Enter the Science Mark:");
        science=input.nextInt();
        System.out.println("Enter the Social Mark:");
        social=input.nextInt();
        
    }

}
class Total_Marks extends Marks{
    int total;
    public int totalMark(){
        total=tamil + english + maths + science + social;
        System.out.println("Total Marks : "+ total);
        return total;

    }
}
class Average_Mark extends Total_Marks{
    int avg;
    public int avgMark(){
        avg=total/5;
        System.out.println("Average Mark : "+avg);
        return avg;
    
    }
}
class Grade extends Average_Mark{
    public void gradeCalc(){
        if(avg>=90){
            System.out.println("Grade: O ");
        }
        else if(avg>=80){
            System.out.println("Grade: A+ ");
        }
        else if(avg>=70){
            System.out.println("Grade: A ");
        }
        else if(avg>=60){
            System.out.println("Grade: B+ ");
        }
        else if(avg>=50){
            System.out.println("Grade: B ");
        }
        else if(avg>=45 && avg<50){
            System.out.println("Grade: C ");
        }
        else{
            System.out.println("Grade: U ");
        }
    }
}

public class Student_Grade_Calc{
    public static void main(String[] args){
        Grade obj=new Grade();
        obj.getMarks();
        obj.totalMark();
        obj.avgMark();
        obj.gradeCalc();
        

    }
}