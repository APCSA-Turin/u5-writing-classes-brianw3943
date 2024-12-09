public class Number {
    private static int highestNum;
    private int higherNumOutOf2;
    private int num1;
    private int num2;
    public Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getHigherNumOutOf2() {
        return higherNumOutOf2;
    }
    public static int getHighestNum() {
        return highestNum;
    }
    public int compareNums() {
        if (num1 > num2) {
            if (num1 > highestNum) {
                highestNum = num1;
            }
            higherNumOutOf2 = num1;
            return num1;
        } else {
            if (num2 > highestNum) {
                highestNum = num2;
            }
            higherNumOutOf2 = num2;
            return num2;
        }
    }
}
