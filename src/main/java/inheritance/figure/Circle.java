package inheritance.figure;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Circle implements Figure{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2.0);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
