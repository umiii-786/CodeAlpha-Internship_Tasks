import java.util.ArrayList;
import java.util.Scanner;

public class Student_Grade_Tracker {
      static ArrayList<Integer> score=new ArrayList<>();
      public static void get_Students_Grade(){
           
            Scanner sc=new Scanner(System.in);
            for (int i = 1; i < 10; i++) {
                System.out.println("Enter the Student "+i+"   Grade :");
                String grade=sc.next();
                if (grade.equals("A+")) {
                    score.add(90);
                }
                if (grade.equals("A")) {
                    score.add(80);
                }
                else if (grade.equals("B")) {
                    score.add(70);
                }
                else if (grade.equals("C")) {
                    score.add(60);
                }
                else if (grade.equals("D")) {
                    score.add(50);
                }
                else if (grade.equals("E")) {
                    score.add(40);
                }
                else if (grade.equals("F")) {
                    score.add(30);
                }
            }
      }
      public static int FindLowest(){
        int lowest=score.get(0);
        for (int i = 1; i < score.size(); i++) {
            if (lowest>score.get(i)) {
                lowest=score.get(i);
            }
        }
        return lowest;
      }
      public static int FindHighest(){
        int highest=score.get(0);
        for (int i = 1; i < score.size(); i++) {
            if (highest<score.get(i)) {
                highest=score.get(i);
            }
        }
        return highest;
      }
      public static float Average(){
        int avg=0;
        for (int i = 0; i < score.size(); i++) {
            avg+=score.get(i);
        }
        return avg/score.size();
      }
      public static void main(String[] args) {
            get_Students_Grade();;
            System.out.println("the Average Student got the score "+Average());
            System.out.println("the Lowest scores is "+FindLowest());
            System.out.println("the Highest scores is "+FindHighest());

      }
}