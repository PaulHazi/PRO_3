package com.company.Lab3.Calculator;

public class Conversion {

    public int fahrenheitToCelsius(int fahrenheit) {
        int celsius = ((fahrenheit - 32) * 5 / 9);
        return celsius;
    }

    public double inchToMeters(double inch) {
        double meters = (inch * 0.0254);
        return meters;
    }
/* de modificat metoda sa foloseasca orele si minutele, am gresit metoda

    public double[] multipleReturns(double meters, double hours, double minuites, double seconds) {
        double[] speed = new double[3];
        speed[0] = (meters / seconds);
        speed[1] = ((speed[0]) * 3.6);
        speed[2] = ((speed[0]) * 2.236936292054);
        return speed;

    }
*/
}