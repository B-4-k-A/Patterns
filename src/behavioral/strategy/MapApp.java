package behavioral.strategy;

public class MapApp {
    private Planner _planner;

    public void setPlanner(Planner planner) {
        _planner = planner;
    }

    public Track buildTrack(Point a, Point b) {
        /* some algorithm for build Track */
       return _planner.buildTrack(a, b);
    }
}
