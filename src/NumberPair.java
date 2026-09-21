public class NumberPair {
    private double first;
    private double second;
    private boolean initialized = false;

    // Ввод двух чисел
    public void inputNumbers(double a, double b) {
        this.first = a;
        this.second = b;
        this.initialized = true;
    }

    public boolean isInitialized() {
        return initialized;
    }

    // Сложение
    public double add() {
        if (!initialized) {
            throw new IllegalStateException("Числа не введены!");
        }
        return first + second;
    }

    // Вычитание
    public double subtract() {
        if (!initialized) {
            throw new IllegalStateException("Числа не введены!");
        }
        return first - second;
    }

    public double multiple() {
        if (!initialized) {
            throw new IllegalStateException("Числа не введены!");
        }
        return first * second;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }
}