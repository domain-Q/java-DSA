package OOPs_in_JAVA;

public class static_function {
    public static void main(String[] args) {
        System.out.println(Student.getsNo());
        Student s1 = new Student("vishal",12, 91.3 ,'A');
        Student s2 = new Student("roshni",13, 93.3 ,'A');
        Student s3 = new Student("neha",14, 92.3 ,'A');
        System.out.println(s1.getsNo());
        System.out.println(s2.getsNo());
        System.out.println(s3.getsNo());


    }
}
