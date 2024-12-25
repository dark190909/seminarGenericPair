public class Pair<T, U> {
    private final T first;
    private final U second;

    // Конструктор
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Метод для получения первого значения
    public T getFirst() {
        return first;
    }

    // Метод для получения второго значения
    public U getSecond() {
        return second;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

