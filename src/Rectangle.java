class Rectangle {
    private double a;
    private double b;

    Rectangle(double a, double b) {
        if (a > 0) {
            this.a = a;
        }
        if (b > 0) {
            this.b = b;
        }
    }

    double getSquare() {
        return a * b;
    }
}
