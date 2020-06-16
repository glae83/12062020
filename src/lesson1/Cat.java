package lesson1;

public class Cat implements Competitor {
    static int maxRunDistance = 100;
    static int maxJumpHeight = 3;

    @Override
    public boolean checkOperation(Obstacle o) {
        boolean height = (maxJumpHeight >= o.doHeight());
        if (height) {
            System.out.println("Кот смог прыгнуть на высоту " + o.doHeight());
        } else {
            System.out.println("Коту не удалось запрыгнуть на высоту " + o.doHeight());
        }
        boolean dist = (maxRunDistance >= o.doLenght());
        if (dist) {
            System.out.println("Кот смог пробежать расстояние " + o.doLenght());
        } else {
            System.out.println("Кот не смог пробежать расстояние " + o.doLenght());
            return false;
        }
        return height && dist ;
    }
}