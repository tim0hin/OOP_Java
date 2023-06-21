package sem7.service;

import sem7.model.ComplexNumbers;

public interface ComplexCalcService {
    ComplexNumbers operation(ComplexNumbers n1, ComplexNumbers n2);

    public void getResult(ComplexNumbers complexNum);
}
