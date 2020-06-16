package lesson1;
//
public class Competition {
    static Competitor[] competitors = {
            new Human(),
            new Robot(),
            new Cat()
    };
    static Obstacle[] obstacles = {new Wall(3),
            new Treadmill(20),
            new Treadmill(200),
            new Wall(1)};

    public static void main(String[] args) {
        for(Competitor c: competitors) {
            for(Obstacle o: obstacles) {
                boolean isOnDistance = c.checkOperation(o);
                if (!isOnDistance) break;
            }
        }
    }
}