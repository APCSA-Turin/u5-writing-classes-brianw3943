public class Main {
    public static void main(String[] args) {
        // ---- test constructor ----
        // 1. create a Temperature object named temp1 with a
        // high of 78.52, a low of 54.59, and a scale of "F",
        // then print the object to make sure it looks right
        // (note it should be rounded to nearest tenth)
        Temperature temp1 = new Temperature(78.52, 54.59, "F");
        System.out.println(temp1.tempInfo());

        // 2. create a Temperature object named temp2 with a
        // high of 23.90, a low of 14.95, and a scale of "C",
        // then print the object to make sure it looks right
        Temperature temp2 = new Temperature(23.90, 14.95, "C");
        System.out.println(temp2.tempInfo());

        // 3. create a Temperature object named temp3 with a
        // high of 57.53, a low of 38.65, and a scale of "K",
        // then print the object to make sure the scale
        // got correctly defaulted to "F"
        Temperature temp3 = new Temperature(57.53, 38.65, "K");
        System.out.println(temp3.tempInfo());

        // --- test public static conversion methods ---
        // 4. use static convertFtoC method to convert 78.5
        //    to Celcius; store and print the converted result
        double celciusTemp = Temperature.convertFtoC(78.5);
        System.out.println(celciusTemp);

        // 5. use static convertCtoF method to convert 12.6
        //   to Fahrenheit; store and print the converted result
        double fahrenheitTemp = Temperature.convertCtoF(12.6);
        System.out.println(fahrenheitTemp);

        // --- test instance methods ---
        // 6. change temp1 to Celcius using changeToC, then
        // print object again to make sure the conversion worked
        temp1.changeToC();
        System.out.println(temp1.tempInfo());

        // 7. try changing temp1 to Celcius again by calling
        // changeToC a second time, then print object to show 
        // that nothing happens since it is already C
        temp1.changeToC();
        System.out.println(temp1.tempInfo());

        // 8. change temp1 back to Fahrenheit using changeToF,
        // then print object to make sure the conversion worked
        temp1.changeToF();
        System.out.println(temp1.tempInfo());

        // 9. try changing temp1 to Fahrenheit again by calling
        // changeToF a second time, then print object to show 
        // that nothing happens since it is already F
        temp1.changeToF();
        System.out.println(temp1.tempInfo());
    }
}
