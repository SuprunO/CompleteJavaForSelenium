/**
 * Created by alex on 16.01.2017.
 */
public class ConditionalStatement {
    public static void main(String[] args) {

        int val1 = 10;
        int val2 = 20;
        boolean condition =10 == 10;
        boolean condition2 = val2 == val1;
        System.out.println(condition);
        System.out.println(condition2);

        if (val1==val2){
            System.out.println("TRUE");
        }


        System.out.println("****************************************");
        int score = 91;
        String grade;

        if (score > 90) {
            grade = "A";
        }
        else if(score > 75){
            grade = "B";
        }
        else {
            grade = "C";
        }
        System.out.println("Score " + score);
        System.out.println("Grade " + grade);

        }
    }

