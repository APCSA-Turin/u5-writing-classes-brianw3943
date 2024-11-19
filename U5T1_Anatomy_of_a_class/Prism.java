public class Prism {
    private int length;
    private int height;
    private int width;

    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public int volume() {
        return length * width * height;
    }
    public int surfaceArea() {
        return 2 * length * width + 2 * height * width + 2 * height * length;
    }
    public String info() {
        return "Length = " + length + "\n" + "Width = " + width + "\n" + "Height = " + height + "\n";
    }
}
