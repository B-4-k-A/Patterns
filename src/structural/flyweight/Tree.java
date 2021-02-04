package structural.flyweight;


public class Tree {
    private int x;
    private int y;
    private int high;
    private int size;
    private final Texture texture;

    public Tree(int x, int y, int high, int size, Texture texture) {
        this.x = x;
        this.y = y;
        this.high = high;
        this.size = size;
        this.texture = texture;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void draw() {
        System.out.println("Has drawn " + this.toString());
    }

    @Override
    public String toString() {
        return "Tree{" +
                "x=" + x +
                ", y=" + y +
                ", high=" + high +
                ", size=" + size +
                '}';
    }
}
