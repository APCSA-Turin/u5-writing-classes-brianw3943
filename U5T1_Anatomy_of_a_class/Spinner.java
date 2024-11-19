public class Spinner {
    private int currentSpin;
    private int numSpin;
    private int sumSpin;
    private int sects;
    public Spinner(int sects) {
        this.sects = sects;
        currentSpin = 0;
        numSpin = 0;
        sumSpin = 0;
    }
    public int getCurrentSpin() {
        return currentSpin;
    }
    public int getNumSpin() {
        return numSpin;
    }
    public int getSumSpin() {
        return sumSpin;
    }
    public void spin() {
        int spin = (int) (Math.random() * sects) + 1;
        currentSpin = spin;
        sumSpin += spin;
        numSpin++;
    }
    public double averageSpin() {
        return (double) sumSpin / numSpin;
    }
}
