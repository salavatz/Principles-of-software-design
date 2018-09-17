class Square {
    private double a;

    Square(double a) {
        if (a > 0) {
            this.a = a;
        }
    }

    double getSquare() {
        return a * a;
    }
}
