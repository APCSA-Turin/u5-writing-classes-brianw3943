public class Temperature {
    private double temp1;
    private String temp1Type;
    private double temp2;
    private String temp2Type;
    public Temperature(double temp1, String temp1Type, double temp2, String temp2Type) {
        this.temp1 = temp1;
        this.temp1Type = temp1Type;
        this.temp2 = temp2;
        this.temp2Type = temp2Type;
    }
    public String compareTemps() {
        if (temp1Type == "C" || temp1Type == "c") {
            temp1 = Utility.celsiusToFahrenheit(temp1); //E
            temp1Type = "F";
        }
        if (temp2Type == "C" || temp2Type == "c") {
            temp2 = Utility.celsiusToFahrenheit(temp2);
            temp2Type = "F";
        }
        if (temp1 > temp2) {    //B
            return "Temperature 1 is higher.";
        } else if (temp2 > temp1) {
            return "Temperature 2 is higher.";
        } else {
            return "Both temperatures are equally as hot/cold.";
        }
    }
    public void increaseTemp(int tempNum, double increaseVal, String tempType) {
        if (tempNum == 1) {
            if(tempType == "F" || tempType == "f") {
                if (temp1Type == "F" || temp1Type == "f") {
                    temp1 = add(temp1, increaseVal);    //C
                } else if (temp1Type == "C" || temp1Type == "c") {
                    temp1 = Utility.celsiusToFahrenheit(temp1);
                    temp1 = add(temp1, increaseVal);
                } else {

                }
            } else if (tempType == "C" || tempType == "c") {
                if (temp1Type == "C" || temp1Type == "c") {
                    temp1 = add(temp1, increaseVal);
                } else if (temp1Type == "F" || temp1Type == "f") {
                    temp1 = fahrenheitToCelsius(temp1);
                    temp1 = add(temp1, increaseVal);
                } else {

                }
            }
        }
        if (tempNum == 2) {
            if(tempType == "F" || tempType == "f") {
                if (temp2Type == "F" || temp2Type == "f") {
                    temp2 = add(temp2, increaseVal);    //C
                } else if (temp2Type == "C" || temp2Type == "c") {
                    temp2 = Utility.celsiusToFahrenheit(temp2);
                    temp2 = add(temp2, increaseVal);
                } else {

                }
            } else if (tempType == "C" || tempType == "c") {
                if (temp2Type == "C" || temp2Type == "c") {
                    temp2 = add(temp2, increaseVal);
                } else if (temp2Type == "F" || temp2Type == "f") {
                    temp2 = fahrenheitToCelsius(temp2);
                    temp2 = add(temp2, increaseVal);
                } else {

                }
            }
        }
    }
    private double add(double a, double b) {
        return a + b;
    }
    public double posCelDiff() {
        if (temp1Type == "F" || temp1Type == "f") {
            temp1 = fahrenheitToCelsius(temp1); //D
        }
        if (temp2Type == "F" || temp2Type == "f") {
            temp2 = fahrenheitToCelsius(temp2);
        }
        return Math.abs(temp1 - temp2);
    }
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0/9.0);
    }


}
