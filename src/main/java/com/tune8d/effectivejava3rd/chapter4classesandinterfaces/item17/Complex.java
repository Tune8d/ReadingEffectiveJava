package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item17;
/*
[Five rules of creating immutable classes]

1. Don't provide methods that modify the object's state (= mutators)
2. Ensure that the class can't be extended.
3. Make all fields final. - show intention
4. Make all fields private. - restrict client access
5. Ensure exclusive access to any mutable components. - make no room for external editing

Classes should be immutable unless there's a very good reason to make them mutable.

*/
public final class Complex {
    private final double re;
    private final double im;

    private Complex(final double re, final double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex c){
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c){
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c){
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }

    public Complex dividedBy(Complex c){
        double tmp = re * c.re - im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) /tmp);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof Complex)){
            return false;
        }
        Complex c = (Complex)o;
        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + ", " + im + "i)";
    }


}
