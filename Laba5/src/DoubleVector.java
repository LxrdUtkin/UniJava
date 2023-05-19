public class DoubleVector {
    private double[] values;

    public DoubleVector(double[] values) {
        this.values = values;
    }

    // sum
    private DoubleVector add(DoubleVector other) {
        if (values.length != other.values.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        double[] result = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] + other.values[i];
        }
        return new DoubleVector(result);
    }

    // subtract
    private DoubleVector subtract(DoubleVector other) {
        if (values.length != other.values.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        double[] result = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] - other.values[i];
        }
        return new DoubleVector(result);
    }

    // multiply on scalar
    private DoubleVector multiply(double scalar) {
        double[] result = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] * scalar;
        }
        return new DoubleVector(result);
    }

    public String[] TestVector(DoubleVector other, double scalar) {
        DoubleVector add = this.add(other);
        DoubleVector subtract = this.subtract(other);
        DoubleVector multiply = this.multiply(scalar);

        StringBuilder addString = new StringBuilder("add: ");
        for (double value : add.values) {
            addString.append(value);
            addString.append(";");
        }

        StringBuilder subtractString = new StringBuilder("subtract: ");
        for (double value : subtract.values) {
            subtractString.append(value);
            subtractString.append(";");
        }

        StringBuilder multiplyString = new StringBuilder("multiply: ");
        for (double value : multiply.values) {
            multiplyString.append(value);
            multiplyString.append(";");
        }

        return new String[]{addString.toString(), subtractString.toString(), multiplyString.toString()};
    }
}
