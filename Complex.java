public class Complex {

    int Re;
    int Im;

    public Complex(){
        Re = 0;
        Im = 0;
    }

    public Complex(int Re, int Im){
        this.Re = Re;
        this.Im = Im;
    }

    public void setRe(int Re){
        this.Re = Re;
    }

    public void setIm(int Im){
        this.Im = Im;
    }

    public void print() {
        String result = "";
        if(Re != 0){
            result = Re + " + " + Im + "i";
        } else {
            result = Im + "i";
        }
        System.out.println(result);

    }

    public static Complex sum(Complex a, Complex b){
        Complex c = new Complex( a.Re + b.Re, a.Im + b.Im);
        return c;
    }

    public static Complex multpl(Complex a,Complex b){
        Complex result = new Complex(a.Re*b.Re - a.Im*b.Im,b.Re*a.Im + a.Re*b.Im);
        return result;
    }


}
