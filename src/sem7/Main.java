package sem7;

import sem7.controller.Controller;

public class Main {
    // View нет, вместо него выступает Main
    public static void main(String[] args) {
        // View нет, так как текстовый интерфейс. Вместо View выступает Main.
        Controller controller = new Controller();
        controller.calculate();
    }
}
