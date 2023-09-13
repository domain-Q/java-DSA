package OOPs_in_JAVA;

public class Simplify {
    public static class fraction {
        int num;
        int den;

        public fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }

        public void simplify() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;

        }
    }

    public static void main(String[] args) {
        fraction f1 = new fraction(100, 5);
        System.out.println("fraction is" + f1.num + "/" + f1.den);
        fraction f2 = new fraction(20, 10);
        System.out.println(" fraction is" + f2.num + "/" + f2.den);
        fraction f3 = add(f1,f2);
        System.out.println(f3.num+ "/" +f3.den);


//        f1.simplify();
//        System.out.println("simplified fraction is" + f1.num + "/" + f1.den);
//        System.out.println(f2.num + "/" + f2.den);
//        f2.simplify();
//        System.out.println("simplified fraction is" + f2.num + "/" + f2.den);


    }
    public static fraction add(fraction f1, fraction f2){
        int numerator = (f1.num* f2.den) - (f1.den * f2.num);
        int denominator =f1.den * f2.den;
        fraction f3 = new fraction(numerator, denominator);
        return f3;
    }


    public static int gcd(int x, int y) {
        if (y == 0) return x;

        return gcd(y, x % y);
    }
}
