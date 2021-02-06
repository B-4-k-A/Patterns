package behavioral.strategy;

/* Приложение "Карты" предоставляет пользователю возможность определить
спопсоб построения маршрута от точки до точки:
пешком, на автомобиле, общественным транспортом. Необходимо реализовать данный функционал
приложения с возможностью легкого добавления нового способа построения маршрута.
 */

public class MapRunner {
    public static void main(String[] args) {
        var mapApp = new MapApp();

        var a = new Point();
        var b = new Point();

//        mapApp.setPlanner(new WalkPlanner());
//        mapApp.buildTrack(a, b);

        mapApp.setPlanner(new CarPlanner());
        mapApp.buildTrack(a, b);

    }
}
