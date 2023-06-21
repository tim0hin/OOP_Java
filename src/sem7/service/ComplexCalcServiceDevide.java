package sem7.service;

import sem7.model.ComplexNumbers;

public class ComplexCalcServiceDevide implements ComplexCalcService{

    @Override
    public ComplexNumbers operation(ComplexNumbers n1, ComplexNumbers n2) {
        double resultReal = (n1.getReal() * n2.getReal() + n1.getImaginary() * n2.getImaginary()) /
                (n2.getReal() * n2.getReal() + n2.getImaginary() * n2.getImaginary());
        double resultImaginary = (n1.getImaginary() * n2.getReal() - n1.getReal() * n2.getImaginary()) /
                (n2.getReal() * n2.getReal() + n2.getImaginary() * n2.getImaginary());
        ComplexNumbers result = new ComplexNumbers(resultReal, resultImaginary);
        return  result;
    }

    @Override
    public void getResult(ComplexNumbers complexNum) {
        System.out.println("result = " + complexNum.toString());
    }
}
