import java.util.ArrayList;
import java.util.List;
public class StudentsList {
    private List<Students> studentsList = new ArrayList<>();

    public void addStudents(Students student) {
        studentsList.add(student);
    }

    public void getFacultyList(String faculty) {
        System.out.println("List of students " + faculty + " faculty");
        for (Students student : studentsList) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.toString());

            }
        }
    }
    public void getFacultyCourseList(String faculty,String course){
        System.out.println("\nList of students "+faculty+" faculty "+course+" course");
        for(Students student:studentsList){
            if(student.getFaculty().equals(faculty)&student.getCourse().equals(course)){
                System.out.println(student.toString());}
        }
    }
    public void getYearOfBirthList(String year){
        System.out.println("\nList of students born after "+year+" year");
        for(Students student:studentsList){
            if(getYear(student.getDateOfBirth().substring(6))>getYear(year)){
                System.out.println(student.toString());}
        }
    }
    public int getYear(String years){
        return Integer.parseInt(years);
    }
    public void getGroupList(String group){
        System.out.println("\nList of students "+group +" group");
        for(Students student:studentsList){
            if(student.getGroup().equals(group)){
                System.out.println(student.toString());
            }
        }
    }
}