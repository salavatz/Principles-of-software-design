class Circle {
    private double r;

    Circle(double r) {
        if (r > 0) {
            this.r = r;
        }
    }

    double getSquare() {
        return Math.PI * Math.pow(r, 2);
    }
}
