package sem2;

public class Main {
    public static void main(String[] args) {
        AbstractCalc calculator = new ScientificCalc();
        calculator.add(5);
        calculator.multiply(2);
        System.out.println(calculator.getResult()); // Результат: 10.0

        ScientificCalc scientificCalculator = new ScientificCalc();
        scientificCalculator.add(5);
        scientificCalculator.sin();
        System.out.println(scientificCalculator.getResult()); // Результат: -0.9589242746631385
    }
}
