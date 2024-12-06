public class Employee {
    private static int totalEmployeesCreated = 0;
    private static int mostRecentEmployeeID = 99;
    private String firstName;
    private String lastName;
    private int employeeID;
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        mostRecentEmployeeID++;
        employeeID = mostRecentEmployeeID;
        totalEmployeesCreated++;
    }
    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }
    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }
    public String fullName() {
        return firstName + " " + lastName;
    }
    public String employeeInfo() {
        String str = "--------------------------";
        str += "\nName: " + fullName();
        str += "\nEmployee ID: " + employeeID;
        str += "\nMost recent ID assigned: " + mostRecentEmployeeID;
        str += "\nTotal employees hired: " + totalEmployeesCreated;
        str += "\n--------------------------";
        return str;
    }
 }
 