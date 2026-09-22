public class CalculatorModel {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a - b;
    }

    public double add(double a, double b) {
        return a * b;
    }

    public double add(double a, double b) {
        if (b == 0)
            return 0;
        return a / b;
    }
}