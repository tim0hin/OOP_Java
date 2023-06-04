package sem2;

public class ScientificCalc extends AbstractCalc {

    public ScientificCalc(double result) {
        super(result);
    }

    public ScientificCalc() {
        super(0);
    }

    @Override
    public void add(double value) {
        setResult(getResult() + value);
    }

    @Override
    public void subtract(double value) {
        setResult(getResult() - value);
    }

    @Override
    public void multiply(double value) {
        setResult(getResult() * value);
    }

    @Override
    public void divide(double value) {
        setResult(getResult() / value);
    }

    public void sin() {
        setResult(Math.sin(getResult()));
    }

    public void cos() {
        setResult(Math.cos(getResult()));
    }

    public void tan() {
        setResult(Math.tan(getResult()));
    }

    public void sqrt() {
        setResult(Math.sqrt(getResult()));
    }
}
