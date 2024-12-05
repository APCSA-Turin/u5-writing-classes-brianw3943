public class Main {
    public static void main(String args[]) {
        System.out.println(Utility.celsiusToFahrenheit(100.0));
        System.out.println(Utility.milesToKilometers(100.0));
        Temperature temp = new Temperature(20, "c", 60, "f");
        System.out.println(temp.compareTemps());
        temp.increaseTemp(2, 20, "F");
        System.out.println(temp.compareTemps());
        System.out.println(temp.posCelDiff());

    }
}
