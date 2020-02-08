package inheritance.figure;

public class Test {

    public static void main(String[] args) {
        Figure[] figures = new Figure[] {
            new Circle(4.5),
                new Square(5.6D),
                new Circle(6.6),
                new Circle(5.7),
                new Tringle(4,6)
        };

        for (Figure figure:
                figures) {
            System.out.println("Figura " + figure + " ma powierzchnie " + figure.area());
        }
              {

        }
    }
}
