package OOPs_in_JAVA;

public class methodOverloading {
    public int add() {
        int a = 1;
        int b = 2;
        int c = a + b;
        return c;
    }

    public void add(int x, int y) {
        int c = x + y;
        System.out.println(c);
    }

    public void add(int x, double y) {
        double c = x + y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        methodOverloading print = new methodOverloading();
        print.add(5, 6);
        print.add(5, 4.5);
        System.out.println(print.add());
    }
}


