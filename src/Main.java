public class Main {
    public static void main(String[] args) {
        // Пример с разными типами
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        System.out.println(pair1); // Pair{first=Age, second=25}

        // Пример с одинаковыми типами
        Pair<Double, Double> pair2 = new Pair<>(3.14, 2.71);
        System.out.println(pair2); // Pair{first=3.14, second=2.71}

        // Пример с пользовательским типом
        Pair<String, String> pair3 = new Pair<>("Key", "Value");
        System.out.println("First: " + pair3.getFirst());
        System.out.println("Second: " + pair3.getSecond());
    }
}
