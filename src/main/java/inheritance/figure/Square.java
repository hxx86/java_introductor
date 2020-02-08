package inheritance.figure;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }



    @Override
    public double area() {
        return side * side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "bok=" + side+
                '}';
    }
}
