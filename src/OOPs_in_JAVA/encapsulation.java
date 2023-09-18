package OOPs_in_JAVA;

public class encapsulation {
    private int value; // data hiding
    public void setValue(int x){ // data abstraction
    value = x;
    }
    public int getValue(){
    return value;
    }
}
class v{
    public static void main(String[] args) {
        encapsulation print = new encapsulation();
        print.setValue(100);
        System.out.println(print.getValue());
    }
}
