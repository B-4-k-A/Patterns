package behavioral.strategy;

public class CarPlanner implements Planner{
    @Override
    public Track buildTrack(Point a, Point b) {
        System.out.println("Track for car was built.");
        return new Track();
    }
}
