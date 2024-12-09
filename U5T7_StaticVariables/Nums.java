public class Nums {
    private int int1;
    private int int2;
    private int randomNumsGenerated;
    private static int totalRandomNumsGenerated = 0;
        public Nums(int int1, int int2) {
            this.int1 = int1;
            this.int2 = int2;
            randomNumsGenerated = 0;
        }
        public int getRandomNumsGenerated() {
            return randomNumsGenerated;
        }
        public static int getTotalRandomNumsGenerated() {
            return totalRandomNumsGenerated;
    }
    public int randBetween() {
        totalRandomNumsGenerated++;
        randomNumsGenerated++;
        return (int) (Math.random() * (int2 - int1 + 1)) + int1;
    }
}