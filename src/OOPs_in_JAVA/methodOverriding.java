package OOPs_in_JAVA;

public class methodOverriding {
    public void draw(){
        System.out.println(" cannot define the type of shape");
    }
}
 class square extends methodOverriding{
    @Override

     public void draw(){
        super.draw();
         System.out.println(" square shape");
     }
}
class demo{
    public static void main(String[] args) {
        methodOverriding print = new square();
        print.draw();
    }
}
