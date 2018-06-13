package bmi;

public class Result {

    public void results(double BMI) {
        if (BMI < 18.5) {
            System.out.println("Masz niedowagę - Musisz przytyć");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Masz wagę prawidłową - Tak trzymaj!");
        } else if (BMI >= 25) {
            System.out.println("Masz nadwagę - Musisz schudnąć");
        }
    }
}
