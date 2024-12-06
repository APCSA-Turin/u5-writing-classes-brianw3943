public class Main {
  public static void main(String[] args) {
    System.out.println("--- first student ---");
    Student s1 = new Student("Adam");
    System.out.println(s1.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s1.addPoints(20);
    System.out.println(s1.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s1.addPoints(30);
    System.out.println(s1.studentInfo());
    System.out.println(Student.classInfo());
 
 
 
 
 
 
 
 
 
 
    System.out.println("\n--- second student ---");
    Student s2 = new Student("Barb");
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(15);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(30);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(20);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    System.out.println("\n--- third student ----");
    Student s3 = new Student("Charles");
    System.out.println(s3.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s3.addPoints(40);
    System.out.println(s3.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s3.addPoints(35);
    System.out.println(s3.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s3.addPoints(25);
    System.out.println(s3.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    System.out.println("--- adding to Barb ---");
    s2.addPoints(10);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(20);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
    System.out.println();
    s2.addPoints(15);
    System.out.println(s2.studentInfo());
    System.out.println(Student.classInfo());
  }
 }
 