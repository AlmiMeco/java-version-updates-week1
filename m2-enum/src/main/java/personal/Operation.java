package personal;

public enum Operation {

    PLUS, MINUS, MULTIPLY, DIVIDE, dog, PI(3.1428);

    private double value;

    public double getValue() {
        return value;
    }

    Operation(double value) {
        this.value = value;
    }

    Operation() {
    }
}
