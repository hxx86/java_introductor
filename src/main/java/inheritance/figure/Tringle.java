package inheritance.figure;







public class Tringle implements Figure{







    private double base;



    private double height;







    public Tringle(double base, double height) {



        this.base = base;



        this.height = height;



    }







    @Override



    public double area() {



        return (base * height) / 2;



    }







    @Override



    public String toString() {



        return "Triangle{" +



                "base=" + base +



                ", height=" + height +



                '}';



    }



}