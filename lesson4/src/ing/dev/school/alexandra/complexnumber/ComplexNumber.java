package ing.dev.school.alexandra.complexnumber;

public class ComplexNumber {

    private String name;
    private double re;
    private double im;

    public ComplexNumber(String name, double re, double im) {
        this.name = name;
        this.re = re;
        this.im = im;
        System.out.println("Complex number " + this.name + " = " + this.re + " + i * " + this.im);
    }

    public String getName() {
        return name;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void add(ComplexNumber value){
        this.re += value.getRe();
        this.im += value.getIm();
        System.out.println("Addition result -> " + this.getName() + " = " + this.re + " + i * " + this.im);
    }

    public void subtract(ComplexNumber other){
        this.re -= other.getRe();
        this.im -= other.getIm();
        System.out.println("Subtraction result -> " + this.getName() + " = " + this.re + " + i * " + this.im);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
