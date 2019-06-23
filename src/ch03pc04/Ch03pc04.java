package ch03pc04;
import java.util.Scanner;
/**
 *
 * @author FRANK.OLSON
 * date: 11/1/2017
 * purpose: to calculate and display the grade for a class based on the average of three tests
 */
public class Ch03pc04 {

    public static void main(String[] args) {
        //variables
        double test1, test2, test3, testAverage;
        String grade;
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        System.out.print("Please enter the score for Test 1: ");
        test1 = keyboard.nextDouble();
        System.out.print("Please enter the score for Test 2: ");
        test2 = keyboard.nextDouble();
        System.out.print("Please enter the score for Test 3: ");
        test3 = keyboard.nextDouble();
        
        //calculations
        testAverage = (test1 + test2 + test3)/3;
        
        //display results
        if (testAverage >= 90)
            grade = "A";
        else if (testAverage < 90 && testAverage >= 80)
            grade = "B";
        else if (testAverage < 80 && testAverage >= 70)
            grade = "C";
        else if (testAverage < 70 && testAverage >= 60)
            grade = "D";
        else
            grade = "F";
        
        System.out.println("Your average test score is: " + testAverage);
        System.out.println("This gives you a letter grade of: " + grade);
    }
    
}
