public class Box {
    private double length;
    private double width;
    private double height;
    
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    // creates a cube: a box with all dimensions equal to side
    public Box(double side) {
        this(side, side, side);
    }
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public double volume() {
        return length * width * height;
    }
    
    public Box greaterVolume(Box otherBox) {
        if (this.volume() > otherBox.volume()) {
            return this;
        } else if (otherBox.volume() > this.volume()) {
            return otherBox;
        } else {
            return null;
        }
    }

    public String boxInfo() {
        return InfoString.boxInfoString(this);
    }

    public void addToShape(Shape s) {
        s.attachBox(this);
    }
    
    public static void main(String args[]) {
        Box b1 = new Box(10);
        Shape shape = new Shape();
        b1.addToShape(shape);
        Box shapeBox = shape.getBox();
        System.out.println(b1 == shapeBox);
        System.out.println(shapeBox.boxInfo());
        System.out.println();
        Box b2 = new Box(20, 30, 40);
        b2.addToShape(shape);
        shapeBox = shape.getBox();
        System.out.println(b2 == shapeBox);
        System.out.println(shapeBox.boxInfo());
    }
}
