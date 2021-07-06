package by.epam.Exceptions;

import by.epam.Exceptions.CustomExceptions.CustomExceptions.*;

import java.util.Arrays;

public class Student  {
    public Faculty facultyName;
    private Group groupName;
    private Subject[] subject;
    private String studentName;

    public Student(Faculty facultyName, Group groupName, String studentName, Subject[] subject) {

        try {
            if (studentName.length() < 1) {
                throw new StudentNameException("Some of students don't have correct name." );
            }
            this.studentName = studentName;
        } catch (StudentNameException ex) {
        }

        try {
            if (subject.length < 1) {
                throw new SubjectCountException("by.epam.Exceptions.Student must have at least one subject. It will be set to 'Math' with mark = 0");
            }
            this.subject = subject;
        } catch (SubjectCountException ex) {
            this.subject = new Subject[1];
            this.subject[0] = new Subject("Math", 0);
        }

        try {
            if (groupName.getGroupName().length() < 1) throw new GroupNameException("Every student must have group name");
            this.groupName=groupName;
        } catch (GroupNameException ex) {
        }

        try {
          if (facultyName.getFacultyName().length() < 1) throw new FacultyNameException("Every student must have the faculty");
        this.facultyName=facultyName;
         } catch (FacultyNameException ex4) {
         }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Group getGroupName() {
        return groupName;
    }

    public Faculty getFacultyName() {
        return facultyName;
    }

    public String getMarks() {
        String marks = "";
        for (Subject subject : this.subject) {
            marks += subject.getNameSubject() + "=" + subject.getMark() + "; ";
        }
        return marks;
    }

    public double getAverageMarkOfSubjects() throws SubjectMarkAndNameException {
        double sumMarks = 0;
        int countMarks = 0;
        for (Subject subject : this.subject) {
            if (subject.getMark() <0 || subject.getMark() > 10) {
                throw new SubjectMarkAndNameException("Wrong subject mark was found."); }
            if (subject.getNameSubject().isEmpty()){
                throw new SubjectMarkAndNameException("Wrong subject  was found."); }
            sumMarks += subject.getMark();
            countMarks += 1;
        }
        return sumMarks / countMarks;
    }

    public double getAverageMarkOfSubjectInGroupAtFaculty(String nameSubject, String nameGroup, String
            nameFaculty) {
        try {
            double sumMarks = 0;
            int countMarks = 0;
            for (Subject subject : this.subject) {
                if (subject.getNameSubject().equals(nameSubject)
                        && groupName.getGroupName().equals(nameGroup)
                        && facultyName.getFacultyName().equals(nameFaculty))
                {
                    sumMarks += subject.getMark();
                    countMarks += 1;
                }
            }
            return sumMarks / countMarks;
        } catch (ArithmeticException ex) {
            throw (ex);
        }
    }

    public double getAverageMarkForSubject(String nameSubject) {
        try {
            double sumGrades = 0;
            int countGrades = 0;
            for (Subject subject : this.subject) {
                if (subject.getNameSubject() == nameSubject) {
                    sumGrades += subject.getMark();
                    countGrades += 1;
                }
            }
            return sumGrades / countGrades;
        } catch (ArithmeticException e) {
            throw (e);
        }
    }

    @Override
    public String toString() {
        return "by.epam.Exceptions.Student{" +"" +
                "studentName='" + studentName +
                " facultyName=" + facultyName +
                ", groupName=" + groupName +
                ", subject=" + Arrays.toString(subject)
                + '}';
    }
}