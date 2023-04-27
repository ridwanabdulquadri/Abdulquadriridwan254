package Ridwan.chapter2;

public class BMI {
    public double getBmi(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;
    }
}

