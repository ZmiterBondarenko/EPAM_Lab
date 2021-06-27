package by.epam.Exceptions;
import by.epam.Exceptions.CustomExceptions.CustomExceptions.*;

public class Subject {
    private String nameSubject;
    private int mark;
    public Subject(String nameSubject, int mark) {
        try {
            if (mark >= 0 && mark <= 10)
                this.mark = mark;
            else throw new SubjectMarkAndNameException("Wrong subject mark was found.");

        } catch (SubjectMarkAndNameException ex) {
            this.mark = -1;
        }
        try {
            if (nameSubject.length() > 1)
                this.nameSubject = nameSubject;
            else throw new SubjectMarkAndNameException("You enter wrong subject name");
        } catch (SubjectMarkAndNameException ex) {
            this.nameSubject =  ("Undefined");
            System.out.println(ex);
        }
    }
    public String getNameSubject() {
        return nameSubject;
    }
    public int getMark() {
        return mark;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject [nameSubject=" + nameSubject + ", mark=" + mark + "]";
    }
}
