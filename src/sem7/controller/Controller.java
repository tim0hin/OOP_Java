package sem7.controller;

import sem7.model.ComplexNumbers;
import sem7.service.ComplexCalcService;
import sem7.service.ComplexCalcServiceAdd;
import sem7.service.ComplexCalcServiceDevide;
import sem7.service.ComplexCalcServiceMultiply;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    private Logger logger;
    Scanner in = new Scanner(System.in);

    public void calculate() {
        try {
            logger = Logger.getAnonymousLogger();
            FileHandler fileHandler = null;
            try {
                fileHandler = new FileHandler("log.txt", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            logger.addHandler(fileHandler);
            System.out.println("# При вводе чисел с дробной частью используйте ',' #");
            ComplexNumbers n1 = new ComplexNumbers(inputNumber("real: "), inputNumber("imaginary: "));
            char op = inputOperation("operation: ");
            ComplexNumbers n2 = new ComplexNumbers(inputNumber("real: "), inputNumber("imaginary: "));
            switch (op) {
                case '+' -> {
                    ComplexCalcService complexCalcService = new ComplexCalcServiceAdd();
                    ComplexNumbers result = complexCalcService.operation(n1, n2);
                    complexCalcService.getResult(result);
                    String res = ("(" + n1.toString() + ")" + " + " + "(" + n2.toString() + ")"
                    + " = " + result.toString());
                    logger.log(Level.INFO, res);

                }
                case '*' -> {
                    ComplexCalcService complexCalcService = new ComplexCalcServiceMultiply();
                    ComplexNumbers result = complexCalcService.operation(n1, n2);
                    complexCalcService.getResult(result);
                    String res = ("(" + n1.toString() + ")" + " * " + "(" + n2.toString() + ")"
                            + " = " + result.toString());
                    logger.log(Level.INFO, res);
                }
                case '/' -> {
                    ComplexCalcService complexCalcService = new ComplexCalcServiceDevide();
                    ComplexNumbers result = complexCalcService.operation(n1, n2);
                    complexCalcService.getResult(result);
                    String res = ("(" + n1.toString() + ")" + " / " + "(" + n2.toString() + ")"
                            + " = " + result.toString());
                    logger.log(Level.INFO, res);
                }
                default -> throw new IllegalStateException("Unexpected operation: " + op);

            }
            fileHandler.close();
        }
        catch (InputMismatchException ex){
            System.out.println("Введите данные правильно!");
            System.out.println(ex.getMessage());
        }
    }

    public double inputNumber(String message){
        System.out.printf("%s", message);
        return in.nextDouble();
    }
    public char inputOperation(String message){
        System.out.printf("%s", message);
        return in.next(".").charAt(0);
    }

}
