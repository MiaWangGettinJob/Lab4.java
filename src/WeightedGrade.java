/*
Lab 4
Simiao Wang
5101
Section-8
*/


import java.util.*;

public class WeightedGrade {
    private ArrayList<Double> totalGrade;
    private ArrayList<Double> percentage;
    private ArrayList<Double> earnedGrade;

    public void setEarnedGrade(ArrayList<Double> earnedGrade) {   //set method of earnedGrade
        this.earnedGrade = earnedGrade;
    }

    public void setTotalGrade(ArrayList<Double> totalGrade) {//set method of TotalGrade

        this.totalGrade = totalGrade;
    }

    public void setPercentage(ArrayList<Double> percentage) {//set method of Percentage
        this.percentage = percentage;
    }

    public Double getAnswer() {
        double weightedGrade=0;
        for( int i = 0; i < earnedGrade.size(); i++){
            weightedGrade += earnedGrade.get(i) / totalGrade.get(i) * percentage.get(i);
        }
        return weightedGrade;
    }

    public String getAnswer(Double weightedGrade) {

        if (90 <= weightedGrade && weightedGrade <= 100)  //decide if the grade belongs to A
            return "A";
        if (80 <= weightedGrade && weightedGrade < 90) //decide if the grade belongs to B
            return "B";
        if (70 <= weightedGrade && weightedGrade < 80) //decide if the grade belongs to C
            return "C";
        if (60 <= weightedGrade && weightedGrade < 70) //decide if the grade belongs to D
            return "D";

        return "F";//if the grade doesn't belong to the above, it is F
    }
}

