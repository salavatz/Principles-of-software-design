public class Tests {
    public static void main(String[] args) {
        double epsilon = 1e-5;
        System.out.println(testRectangle(epsilon));
        System.out.println(testSquare(epsilon));
        System.out.println(testCircle(epsilon));
    }

    private static String testRectangle(double epsilon) {
        Rectangle rectangle1 = new Rectangle(3, 5.14);
        assert Math.abs(rectangle1.getSquare() - 15.42) < epsilon;

        Rectangle rectangle2 = new Rectangle(0, 5);
        assert  Math.abs(rectangle2.getSquare() - 0) < epsilon;

        Rectangle rectangle3 = new Rectangle(0, 0);
        assert  Math.abs(rectangle3.getSquare() - 0) < epsilon;

        Rectangle rectangle4 = new Rectangle(-5, 5);
        assert  Math.abs(rectangle4.getSquare() - 0) < epsilon;

        return "All tests for class Rectangle are executed without errors!";
    }

    private static String testSquare(double epsilon) {
        Square square1 = new Square(5.5);
        assert Math.abs(square1.getSquare() - 30.25) < epsilon;

        Square square2 = new Square(0);
        assert  Math.abs(square2.getSquare() - 0) < epsilon;

        Square square3 = new Square(-5);
        assert  Math.abs(square3.getSquare() - 0) < epsilon;

        return "All tests for class Square are executed without errors!";
    }

    private static String testCircle(double epsilon) {
        Circle circle1 = new Circle(5);
        assert Math.abs(circle1.getSquare() - Math.PI * Math.pow(5, 2)) < epsilon;

        Circle circle2 = new Circle(0);
        assert  Math.abs(circle2.getSquare() - 0) < epsilon;

        Circle circle3 = new Circle(-5);
        assert  Math.abs( circle3.getSquare() - 0) < epsilon;

        return "All tests for class Circle are executed without errors!";
    }

}
