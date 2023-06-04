package sem2;

public abstract class AbstractCalc implements BasicCalc {
    protected double result;

    public AbstractCalc(double result) {
        this.result = result;
    }

    @Override
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void clear(){
        result = 0;
    }
}
