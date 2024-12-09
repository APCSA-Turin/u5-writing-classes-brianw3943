public class NumberRunner {
    public static void main(String args[]) {
        Number num = new Number(10, 20);
        System.out.println(num.compareNums());
        System.out.println(Number.getHighestNum());
        Number num2 = new Number(15, 34);
        System.out.println(num2.compareNums());
        System.out.println(Number.getHighestNum());
        System.out.println(num.getHigherNumOutOf2());
        System.out.println(num2.getHigherNumOutOf2());
    }
}
