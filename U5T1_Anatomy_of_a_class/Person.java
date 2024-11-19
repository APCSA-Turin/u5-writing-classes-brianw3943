public class Person {
    private String firstName;
    private String lastName;
    private int meetings;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        meetings = 0;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getMeetings() {
        return meetings;
    }
    public void setMeetings(int newMeetings) {
        meetings = newMeetings;
    }
    public void meet(Person person) {
        System.out.println("Hello, my name is " + firstName);
        System.out.println("Hi, my name is " + person.getFirstName());
        meetings++;
        person.setMeetings(person.getMeetings() + 1);
    }
}
