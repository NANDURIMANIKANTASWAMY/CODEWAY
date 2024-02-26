import java.util.*;

class Std_Gra_cal {
    static int len;
    static int[] marks_copy;

    public Std_Gra_cal(int[] arr) {
        marks_copy = arr;
        len = arr.length;
    }

    // Function to find the sum of marks
    static int sum() {
        int total = 0;
        for (int i = 0; i < len; i++) {
            total += marks_copy[i];
        }
        return total;
    }

    // Function to find the average of marks
    static int avg() {
        int average = sum() / len;
        return average;
    }

    // Function to return the grage
    static String grade() {
        String grd;
        int opt = avg() / 10;
        switch (opt) {
            case 10:
                grd="O";
                break;
            case 9:
                grd = "A+";
                break;
            case 8:
                grd = "A";
                break;
            case 7:
                grd = "B+";
                break;
            case 6:
                grd = "B";
                break;
            case 5:
                grd = "c";
                break;
            case 4:
                grd = "D";
                break;
            default:
                grd = "F";
                break;
        }
        return grd;
    }
}

public class Task_2 {
    public static void main(String[] arg) {
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        count=sc.nextInt();
        int[] marks=new  int[count];
        for(int i=0;i<count;i++){
            System.out.print("Enter Your marks in subject_"+(i+1)+" : ");
            marks[i]=sc.nextInt();
        }
        Std_Gra_cal sgc=new Std_Gra_cal(marks);
        System.out.println("Your total marks is "+sgc.sum());
        System.out.println("Your average percentage is "+sgc.avg());
        System.out.println("Your grade is "+sgc.grade());
    }

}
