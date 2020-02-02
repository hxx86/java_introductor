package classes.basics.exercises;

public class PointCollection {

    Point[] points = new Point[100];
    int pointNumber = 0;
    int sctualPointNumber = 0;

    void addPoints(Point... points) {
        for (Point newPoint : points) {
            this.points[pointNumber] = newPoint;
            pointNumber++;
        }
    }

    void printAllPoints() {
        //wypisz wszystkie elementy tablicy this.points od 0 do this.pointNumber -1
        for (int i = 0; i < pointNumber; i++) {
            sctualPointNumber = i + 1;
            printPoint(points[i]);

        }
    }

    void printPoint(Point point) {
        System.out.println("Punkt " + sctualPointNumber + " x;   " + point.getX() + " y;    " + point.getY());

    }

    void printStats() {


        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < pointNumber; i++) {
            Point point1 = points[1];
            for (int j = 0; j < pointNumber; j++) {
                Point point2 = points[j];
                if (point1 == point2) ;
                continue;
            }
        }
    }

}