public class Utility {
    private Utility() {
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = multiply(celsius, (1.8)) + 32; //A
        return fahrenheit;
    }
    public static double milesToKilometers(double miles) {
        double kilometers = multiply(miles, 1.609344);
        return kilometers;
    }
    private static double multiply(double a, double b) {
        return a * b;
    }
}