package by.epam.Exceptions;
import by.epam.Exceptions.CustomExceptions.CustomExceptions.*;

public class Student extends Group {
    private Subject[] subject;
    private String studentName;
    public Student(String facultyName, String groupName, String studentName, Subject[] subject) {
        super(facultyName, groupName);

        try {
            if (this.getFacultyName().length() < 1) throw new FacultyNameException("Every student must have the faculty");
        } catch (FacultyNameException ex) {
            this.setFacultyName("Undefine");
        }

        try {
            if (this.getGroupName().length() < 1) throw new GroupNameException("Every student must have group name");
        } catch (GroupNameException ex) {
            this.setGroupName("Undefine");
        }

        try {
            if (studentName.length() < 1) {
                throw new StudentNameException("Some of students don't have correct name." );
            }
            this.studentName = studentName;
        } catch (StudentNameException ex) {
            this.setStudentName("Undefine");
        }
        try {
            if (subject.length < 1) {
                throw new SubjectCountException("Student must have at least one subject. It will be set to 'Undefine' with mark = -1");
            }
            this.subject = subject;
        } catch (SubjectCountException ex) {
            this.subject = new Subject[1];
            this.subject[0] = new Subject("Undefine", -1);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

    public String getSubjectAndMark() {
        String marks = "";
        for (Subject subject : this.subject) {
            marks += subject.getNameSubject() + "=" + subject.getMark() + "; ";
        }
        return marks;
    }

    public double getAverageMarkOfSubjects() {
        try {
            double sumMarks = 0;
            int countMarks = 0;
            for (Subject subject : this.subject) {
                if (!(subject.getMark() == -1)) {
                    sumMarks += subject.getMark();
                    countMarks += 1;
                }
            }
            return sumMarks / countMarks;
        } catch (ArithmeticException ex) {
            throw ex;
        }
    }

    public double getAverageMarkOfSubjectInGroupAtFaculty(String nameSubject, String nameGroup, String nameFaculty) {
        try {
            double sumMarks = 0;
            int countMarks = 0;
            for (Subject subject : this.subject) {
                if (subject.getNameSubject() == nameSubject
                        && this.getGroupName() == nameGroup
                        && this.getFacultyName() == nameFaculty) {
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
            double sumMarks = 0;
            int countMarks = 0;
            for (Subject subject : this.subject) {
                if (subject.getNameSubject() == nameSubject) {
                    sumMarks += subject.getMark();
                    countMarks += 1;
                }
            }
            return sumMarks / countMarks;
        } catch (ArithmeticException ex) {
            throw (ex);
        }
    }

    @Override
    public String toString() {
        return "Name=" + studentName + "; Faculty=" + super.getFacultyName() + "; Group=" + super.getGroupName() + ", Subjects: " + this.getSubjectAndMark();
    }
}