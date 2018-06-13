package bmi;

public class BodyMassIndex {

    public BodyMassIndex(){
    }

    public double convertCentimetersToMeters(int centimeters){
        double meters = (double) centimeters /100;
        return meters;
    }

    public double BMI(int weight, double heightInMeters){
        double result = weight/(heightInMeters * heightInMeters);
        System.out.printf("%.2f", result);
        System.out.println();
        return result;
    }
}
