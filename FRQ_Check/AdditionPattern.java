
public class AdditionPattern {
    private int start;
    private int add;
    private int current;
    public AdditionPattern(int start, int add) {
       this.start = start;
       this.add = add;
       current = start;
    }
    public int currentNumber() {
       return current;
    }
    public void next() {
       current += add;
    }
    public void prev() {
       if (current - add >= start) {
         current -= add;
       }
    }
 }
 
 
 