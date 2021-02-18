package math;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public void setRealPart(double re) {
        this.re = re;
    }

    public double imaginaryPart() {
        return im;
    }

    public void setImaginaryPart(double im) {
        this.im = im;
    }

    public String toString() {
        return re + " + " + im + "i";
    }

    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.realPart() + c2.realPart(), c1.imaginaryPart() + c2.imaginaryPart());
    }

    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.realPart() - c2.realPart(), c1.imaginaryPart() - c2.imaginaryPart());
    }

    public static Complex multiply(Complex c1, Complex c2) {
        double re = c1.realPart() * c2.realPart() - c1.imaginaryPart() * c2.imaginaryPart();
        double im = c1.realPart() * c2.imaginaryPart() + c1.imaginaryPart() * c2.realPart();
        return new Complex(re, im);
    }

    public static Complex divide(Complex c1, Complex c2) throws Exception {
        double re = (c1.realPart() * c2.realPart() + c1.imaginaryPart() * c2.imaginaryPart()) /
                (Math.pow(c2.realPart(), 2) + Math.pow(c2.imaginaryPart(), 2));
        double im = (c1.imaginaryPart() * c2.realPart() - c1.realPart() * c2.imaginaryPart());
        return new Complex(re, im);
    }
}
