package OOPs_in_JAVA;

public class multilevel_inheritence {
    int a , b ,c ;
    void add(){
        a = 10;
        b= 20;
        c = a+b;
        System.out.println("sum of two numbers are : "+c);
    }
    void subtract(){
        a = 50;
        b= 20;
        c = a-b;
        System.out.println("subtract of two numbers are : "+c);
    }

}
class b extends multilevel_inheritence{
    void multi(){
        a = 2 ;
        b = 2 ;
        c = a*b;
        System.out.println(" multiplication of two numbers are: " +c);
    }
    void division(){
        a = 2 ;
        b = 2 ;
        c = a/ b;
        System.out.println(" division of two numbers are: " +c);
    }
}
 class c extends b{
    void remainder(){
        a = 2 ;
        b = 2 ;
        c = a% b;
        System.out.println(" modulas of two numbers are: " +c);
    }

}
class test{
    public static void main(String[] args) {
        c r = new c();
        r.add();
        r.subtract();
        r.multi();
        r.division();
        r.remainder();
    }
}

