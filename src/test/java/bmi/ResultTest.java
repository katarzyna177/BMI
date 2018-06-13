package bmi;

import org.junit.jupiter.api.Test;

class ResultTest {

    @Test
    void shouldCalculateBMIResultAndWrite(){
        BodyMassIndex getCentimeters = new BodyMassIndex();
        getCentimeters.convertCentimetersToMeters(162);
        getCentimeters.BMI(60, getCentimeters.convertCentimetersToMeters(162));

        Result result = new Result();
        result.results(getCentimeters.BMI(60, getCentimeters.convertCentimetersToMeters(162)));
    }
}