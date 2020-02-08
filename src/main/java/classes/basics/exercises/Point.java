package classes.basics.exercises;

public class Point {

    private double x;
    private double y;

   public Point(double x, double y) {
        this.x = y;
        this.y = x;

   }
    //metoda statyczna wzór na dystans z matemmatyki:
    public static double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }

    //Przeciążenie metody to nazwa z paramatrami metody

    public double distanceTo (Point other){
        return distance(this, other);

    }

    public String  toString(){
       return "Point(x: " + x + ", y" + y + ")";
    }

    public double getX() {
       return x;
    }
    public double getY(){
       return y;
    }



}
