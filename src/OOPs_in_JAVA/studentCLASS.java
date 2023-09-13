package OOPs_in_JAVA;

public class studentCLASS {
    //creating a new data type
       public static void main(String[] args) {
//        student x = new student(); //x is the object here student is the name of class we created with multiple attributes
//        x.name = "vishal";
//        x.rno = 12;
//        x.percentage = 96.5;

//           Student s = new Student();
//        s.name = "roshni";
//        s.rno = 13;
//        s.percentage = 99.5;
//        System.out.println(s.name);
            Student s1 = new Student("vishal",12, 93.3 ,'A');

//           System.out.print(s1.sNo);
           System.out.println( " "+ s1.name);
           Student s2 = new Student("roshni", 13,99.99,'A');

//           System.out.print("S.no"+s2.sNo+":");
           System.out.print(" name of the student is : "+ s2.name+",");
           System.out.print(" she got the rank:"+s2.rank+",");
           s2.rank = 'B';
           System.out.println(" but she cheated and after changing her rank is :"+s2.rank);

           Student s3 = new Student("neha", 11,95.99,'A');


//           System.out.print(s3.sNo);
//           change(s1);

           System.out.println(" "+s3.name);
//           System.out.println(s1.name);


//        int x = 5;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);
//    }

//    private static void change(int x) {
//        x = 7;
//        return;
//    }
    }

    private static void change(Student s1) {
           s1.name = "wishal";
    }


}