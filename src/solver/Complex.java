package solver;

public class Complex {
    private double r, i;
    
    public Complex() {
        this.r = 0.0;
        this.i = 0.0;
    }
    
    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }
    
    @Override
    public String toString() {
        String re = this.r + "";
        String im = this.i < 0 ? this.i + "i" : this.i == 0 ? "" : "+" + this.i + "i";
        return re + im;
    }
}
