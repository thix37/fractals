public class AffineMapping {

    private double a11,a12,c1,a21,a22,c2;


    //constructor
    public AffineMapping(double a11, double a12, double c1, double a21, double a22, double c2) {
        this.a11 = a11;
        this.a12 = a12;
        this.c1 = c1;
        this.a21 = a21;
        this.a22 = a22;
        this.c2 = c2;
    }


    //method that calculate next point of affine mapping
    public Point2D countNextPoint(Point2D p){
        return new Point2D(a11*p.getX()+a12*p.getY()+c1,a21*p.getX()+a22*p.getY()+c2);
    }






    //getters and setters
    public double getA11() {
        return a11;
    }

    public void setA11(double a11) {
        this.a11 = a11;
    }

    public double getA12() {
        return a12;
    }

    public void setA12(double a12) {
        this.a12 = a12;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getA21() {
        return a21;
    }

    public void setA21(double a21) {
        this.a21 = a21;
    }

    public double getA22() {
        return a22;
    }

    public void setA22(double a22) {
        this.a22 = a22;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }
}
