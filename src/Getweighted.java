/*
Lab 4
Simiao Wang
5101
Section-8
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Getweighted {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        ArrayList<Double> a = new ArrayList<Double>();
        System.out.println("Please enter How many assignments do you have");
        int number = sc.nextInt();
        System.out.println("Please enter Total points and hit enter after each point");
        //input of Total points
        for(int i = 0; i < number; i++){
            a.add(sc.nextDouble());
        }

        List<Double> b = new ArrayList<Double>();
        System.out.println("Please enter Earned points hit enter after each point");
        //input of Earned points
        for(int i = 0; i < number; i++){
            b.add(sc.nextDouble());
        }

        List<Double> c = new ArrayList<Double>();
        System.out.println("Please enter percentage and hit enter after each point");
        //input of Percentage
        for(int i = 0; i < number; i++){
            c.add(sc.nextDouble());
        }

        WeightedGrade grade = new WeightedGrade(); //create an instance of WeightedGrade and pass parameters
        grade.setTotalGrade((ArrayList<Double>) a);// pass value to TotalGrade
        grade.setEarnedGrade((ArrayList<Double>)  b);// pass value EarnedGrade
        grade.setPercentage((ArrayList<Double>) c);// pass value Percentage
        String s= grade.getAnswer(); //call the method to do the math
        System.out.println("Your class is : "+s);




    }
}
