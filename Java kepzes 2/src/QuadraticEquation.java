import static java.lang.Math.sqrt;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        if (this.getDiscriminant()>=0){
            return ((-1)*b+sqrt(this.getDiscriminant()))/(2*a);
        }else{
            return 0;
        }
    }
    public double getRoot2(){
        if (this.getDiscriminant()>=0){
            return ((-1)*b-sqrt(this.getDiscriminant()))/(2*a);
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
