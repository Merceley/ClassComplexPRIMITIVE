public class MyClass {
    public static void main(String args[]) {
        Complex a = new Complex();
        a.setRe(5);
        a.setIm(0);
        a.print();

        Complex b = new Complex(5, 0);
        b.print();

        Complex c = Complex.sum(a, b);
        c.print();

        Complex d = Complex.multpl(a, b);
        d.print();
    }
}
