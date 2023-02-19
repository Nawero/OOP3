package Shapes;

public class Main {

    public static void main(String[] args) {

        Shape myShape = new Shape("blue",true);
        System.out.println(myShape.toString());

        Shape nySecondShape = new Shape();
        nySecondShape.setColor("orange");
        System.out.println(nySecondShape.toString());

    }
}
