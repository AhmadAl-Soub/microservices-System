package com.example.showdata.Model;

import lombok.*;


public class StatisticsGrades {
    private double averageGrade;
    private int minGrade;
    private int maxGrade;

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(int minGrade) {
        this.minGrade = minGrade;
    }

    public int getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(int maxGrade) {
        this.maxGrade = maxGrade;
    }

    @Override
    public String toString() {
        return "DataAnalytics{" +
                ", maxGrade=" + maxGrade +
                ", minGrade=" + minGrade +
                ", averageGrade=" + averageGrade +
                '}';
    }

}
