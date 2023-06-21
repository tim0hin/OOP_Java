package sem7.model;

public class ComplexNumbers {
    private double real;
    private double imaginary;

    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary > 0){
            return real + " + " + imaginary + "i";
        } else if (imaginary < 0) {
            return real + "" + imaginary + "i";
        }else {
            return real + "";
        }
    }
}
