package OOPs_in_JAVA;

public class Student {
    String name;
    int rno;
    double percentage;

      char rank;
  private static int sNo;

    public Student(String vishal, int rollNo, double per,char r) {
        name = vishal;
        rno = rollNo;
        percentage = per;
        rank =r;
        sNo++;
    }

    public static int getsNo() {
        return sNo;
    }
}

