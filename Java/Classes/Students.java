public class Students {
    private int id;
    private static int nextId=1;
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;
    public Students ( String lastName, String firstName, String middleName,String dateOfBirth,  String address,  String phoneNumber, String faculty, String course, String group) {

        this.lastName=lastName;
        this.firstName=firstName;
        this.middleName=middleName;
        this.dateOfBirth=dateOfBirth;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.faculty=faculty;
        this.course=course;
        this.group=group;
        id=nextId++;
        setLastName(lastName);
        setMiddleName(middleName);
        setDateOfBirth(dateOfBirth);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setAddress(address);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);}

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

      public String toString() {
        return String.format("%d %s %s %s %s %s %s %s %s %s", id, lastName, firstName, middleName, dateOfBirth, address, phoneNumber, faculty, course, group);}
}

