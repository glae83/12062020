package lesson1;

public class Robot implements Competitor {
    static int maxJumpHeight = 10;
    static int maxRunDistance = 100000;

    @Override
    public boolean checkOperation(Obstacle o) {
        boolean height = (maxJumpHeight >= o.doHeight());
        if (height) {
            System.out.println("Робот смог прыгнуть на " + o.doHeight());
        } else {
            System.out.println("Робот не смог прыгуть на " + o.doHeight());
        }
        boolean dist = (maxRunDistance >= o.doLenght());
        if (dist) {
            System.out.println("Робот пробежал расстояние " + o.doLenght());
        } else {
            System.out.println("Робот не смог пробежать " + o.doLenght());
        }
        return height && dist ;
    }
}