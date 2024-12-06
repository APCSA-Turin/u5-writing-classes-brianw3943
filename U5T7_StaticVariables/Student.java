public class Student {
    private static int totalPointsAllStudents = 0;
    private static int greatestPointsAnyStudent = 0;
    private String name;
    private int pointsEarned;
    public Student(String name) {
        this.name = name;
        pointsEarned = 0;
    }
    public static int getTotalPoints() {
        return totalPointsAllStudents;
    }
    public static int getGreatestPoints() {
        return greatestPointsAnyStudent;
    }
    public static String classInfo() {
        String str = "Total points earned by all students: " + totalPointsAllStudents;
        str += "\nMost points earned by any student: " + greatestPointsAnyStudent;
        return str;
    }
    public void addPoints(int points) {
        pointsEarned += points;
        totalPointsAllStudents += points;
        if (pointsEarned > greatestPointsAnyStudent) {
            greatestPointsAnyStudent = pointsEarned;
        }
    }
    public String studentInfo() {
        return "Student: " + name + "\nStudent's Points: " + pointsEarned;
    }
 }
 