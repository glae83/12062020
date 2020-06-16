package lesson1;
//
public class Obstacle {
    private int height;
    private int lenght;

    public Obstacle(int height, int lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    public int doHeight() {
        return height;
    }
    public int doLenght() {
        return lenght;
    }
}