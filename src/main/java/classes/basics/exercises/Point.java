package classes.basics.exercises;

public class Point {

    double x;
    double y;

    Point(double x, double y) {
        this.x = y;
        this.y = x;



    }
    //metoda statyczna
    static double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }

    //Przeciążenie metody to nazwa z paramatrami metody

    double distanceTo (Point other){
        return distance(this, other);

    }


}
