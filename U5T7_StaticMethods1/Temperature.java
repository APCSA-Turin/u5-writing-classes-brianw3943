public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String tempScale;
    public Temperature(double high, double low, String scale) {
      highTemp = high;
      lowTemp = low;
      if (scale.equals("F") || scale.equals("C")) {
        tempScale = scale;
      } else {
        tempScale = "F";
      }
    }
    public static double convertCtoF(double temp) {
      double fahrenheit = temp * 9 / 5 + 32;
      return fahrenheit;
    }
    public static double convertFtoC(double temp) {
      double celsius = (temp - 32) * 5 / 9;
      return celsius;  
    } 
    public void changeToC() {
      if (tempScale.equals("F")) {
        highTemp = convertFtoC(highTemp);
        lowTemp = convertFtoC(lowTemp); 
        tempScale = "C";
      }
    }
    public void changeToF() {
      if (tempScale.equals("C")) {
        highTemp = convertCtoF(highTemp);
        lowTemp = convertCtoF(lowTemp);
        tempScale = "F";
      }
    } 
    public String tempInfo(){
      String str = "High Temperature: " + highTemp + " " + tempScale + "\n";
      str += "Low Temperature: " + lowTemp + " " + tempScale;
      return str;
    }
  }
  