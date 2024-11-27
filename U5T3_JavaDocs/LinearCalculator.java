/**
 * This class represents a Linear Calculator object
 *
 * @author Brian Wang
 */
public class LinearCalculator{
    /** The x coordinate of the first point*/
    private int x1;
    /** The x coordinate of the second point*/
    private int x2;
    /** The y coordinate of the first point*/
    private int y1;
    /** The y coordinate of the second point*/
    private int y2;
   


     /**
     * Instantiates a LinearCalculator object.
     *
     * @param coord1 The first coordinate
     * @param coord2 The second coordinate
     */
    public LinearCalculator(String coord1, String coord2){
        int temp = coord1.indexOf(",");
        x1 = Integer.parseInt(coord1.substring(1, temp));
        y1 = Integer.parseInt(coord1.substring(temp + 1, coord1.length()-1));
        temp = coord2.indexOf(",");
        x2 = Integer.parseInt(coord2.substring(1, temp));
        y2 = Integer.parseInt(coord2.substring(temp + 1, coord2.length()-1));
    }






    /**
     * Returns the current value of the first x coordinate.
     *
     * @return The value of the first x coordinate
     */
    public int getX1(){
        return x1;
    }
    /**
     * Returns the current value of the first y coordinate.
     *
     * @return The value of the first y coordinate
     */
    public int getY1(){
        return y1;
    }
    /**
     * Returns the current value of the second x coordinate.
     *
     * @return The value of the second x coordinate
     */
    public int getX2(){
        return x2;
    }
    /**
     * Returns the current value of the second y coordinate.
     *
     * @return The value of the second y coordinate
     */
    public int getY2(){
        return y2;
    }
    /**
     * Sets the value of the first x coordinate to a new value.
     *
     * @param newX1 The new value of the x coordinate
     */
    public void setX1(int newX1){
        x1 = newX1;
    }
    /**
     * Sets the value of the first y coordinate to a new value.
     *
     * @param newY1 The new value of the y coordinate
     */
    public void setY1(int newY1){
        y1 = newY1;
    }
    /**
     * Sets the value of the second x coordinate to a new value.
     *
     * @param newX2 The new value of the x coordinate
     */
    public void setX2(int newX2){
        x2 = newX2;
    }
    /**
     * Sets the value of the second y coordinate to a new value.
     *
     * @param newY2 The new value of the y coordinate
     */
    public void setY2(int newY2){
        y2 = newY2;
    }




    /**
     * Returns the distance of two points with any coordinates,
     * calculated by adding both squares of the positive difference
     * of the values of both axes and then square rooting all of that,
     * then rounding to the nearest hundredths place
     * 
     * @return The distance of two points with any coordinates
     */
    public double distance(){
        double distance = Math.sqrt((double) Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        distance = distance * 100;
        distance = Math.round(distance);      // I learned how to round from here: https://stackoverflow.com/questions/8825209/rounding-decimal-points
        distance = distance / 100;
        return distance;
    }
    /**
     * Returns the value of the y-intercept based on the line the two points make when connected,
     * calculated by getting the first y coordinate and subtracting the slope multiplied by the
     * first x coordinate from it, then rounding to the nearest hundredths place.
     *
     * @return The value of the y-intercept
     */
    public double yInt(){
        double yInt;
        if ((x2 - x1) == 0) {
            yInt = -999.99;
        } else {
            yInt = y1 - ((double)slope())*x1;
            yInt = yInt * 100;
            yInt = Math.round(yInt);
            yInt = yInt / 100;
        }
        return yInt;
    }


    /**
     * Returns the slope of the two points, calculated
     * by dividing the change in x by the change in y
     *
     * @return The slope of the two points
     */
    public double slope(){
        double slope;
        if ((x2 - x1) == 0) {
            slope = -999.99;
        } else {
            slope = (double)(y2 - y1) / (x2 - x1);
            slope = slope * 100;
            slope = Math.round(slope);
            slope = slope / 100;
        }
        return slope;
    }


    /**
     * Returns a String that includes the equation
     * of the slope of the line of the two points
     *
     * @return  String representation of the slope as an equation
     */
    public String equation(){
        String equation = "";
        if (slope() == -999.99) {
            equation = "undefined";
        } else {
            if (yInt() < 0) {
                equation = "y=" + slope() + "x" + yInt();
            } else {
                if (yInt() > 0) {
                    equation = "y=" + slope() + "x+" + yInt();
                } else {
                    if (yInt() == 0) {
                        equation = "y=" + slope() + "x";
                    }
                   
                }
            }
            if (slope() == 0) {
                equation = "y=" + yInt();
            }
        }
        return equation;
    }




    /**
     * Private helper method that rounds a value to the nearest hundredths place by
     * multiplying the value by 100, calling Math.round, and then dividing the value by 100
     * 
     * @param x The value before rounding
     * @return The value of the number after rounding to the nearest hundredths place
     */
    public double roundedToHundredth(double x){
        x = x * 100;
        x = Math.round(x);
        x = x / 100;
        return x;
    }


    /**
     * Returns a String that includes values
     * of the two points, the equation, the slope, the y-intercept,
     * and the distance of the two points
     *
     * @return  String representation of the two points and its information
     */
    public String printInfo(){
        String str = "The two points are: (" + x1 + "," + y1  + ")";
        str += " and " + "(" + x2 + "," + y2 + ")";
        str += "\nThe equation of the line between these points is: " + equation();
        str += "\nThe slope of this line is: " + slope();
        str += "\nThe y-intercept of the line is: " + yInt();
        str += "\nThe distance between the two points is: " + distance();
 
        return str;
    }


}
