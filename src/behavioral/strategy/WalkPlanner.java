package behavioral.strategy;

public class WalkPlanner implements Planner{
    @Override
    public Track buildTrack(Point a, Point b) {
        System.out.println("Track for walking was built.");
        return new Track();
    }
}
