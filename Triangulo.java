public class Triangulo{
    private double Lado1;
    private double Lado2;
    private double Lado3;


    /*
     @asserts l1>0
     @asserts l2>0
     @asserts l3>0
    @ensures l1+l2>l3;
    @ensures l2+l3>l1;
    @ensures l1+l3>l2;
    */
    public Triangulo(double l1, double l2, double l3) {
        Lado1 = l1;
        Lado2 = l2;
        Lado3 = l3;
    }

  /*
  @asserts \result > 0;
  */
    public double CalculaArea() {
        double p = (Lado1 + Lado2 + Lado3)/2;
        double r = Math.sqrt(p*(p-Lado1)*(p-Lado2)*(p-Lado3));
        return r;
    }
}
