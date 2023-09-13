package OOPs_in_JAVA;

public class hierarchial_inheritence {

//    int v = 40;
//void input(){
//    System.out.print(" enter your name: ");
//}
//    void show(){
//        System.out.println(" my name is krishna ");
//        System.out.println(v);
//    }
public void G(){
    System.out.println(" my name is kabadi ");
}
}
class x extends hierarchial_inheritence{
    int v = 30;


    public void b() {
//        super.b();
        System.out.println(" my name is bhikari ");

    }


//   void show(){
//       super.show();
//        System.out.println(" my name is vishal ");
//       System.out.println(super.v);
//       System.out.println(v);
//    }
}
//class y extends hierarchial_inheritence{
//    void disp(){
//        System.out.println("my name is roshni");
//    }
//}
class check{
    public static void main(String[] args) {
//        y name = new y();
        x name2 = new x();
//        name.input();
//        name.disp();
//        name.input();


    }
}
