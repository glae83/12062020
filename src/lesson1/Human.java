package lesson1;
//
public class Human implements Competitor {
    static int maxJumpHeight = 2;
    static int maxRunDistance = 5000;

    @Override
    public boolean checkOperation(Obstacle o) {
        boolean height = (maxJumpHeight >= o.doHeight());
        if (height) {
            System.out.println("Человек смог прыгнуть " + o.doHeight());
        } else {
            System.out.println("Человек не смог прыгнуть " + o.doHeight());
        }
        boolean dist = (maxRunDistance >= o.doLenght());
        if (dist) {
            System.out.println("Человек смог пробежать расстояние" + o.doLenght());
        } else {
            System.out.println("Человек не смог пробежать "  + o.doLenght());
        }
        return height && dist ;
    }
}