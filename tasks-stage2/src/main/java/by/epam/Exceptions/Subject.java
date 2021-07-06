package by.epam.Exceptions;

public class Subject {
    private String nameSubject;
    private int mark;

    public Subject(String nameSubject, int mark) {
                this.mark = mark;
                this.nameSubject = nameSubject;
        }

    public String getNameSubject() {
        return nameSubject;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "[nameSubject=" + nameSubject + ", mark=" + mark + "]";
    }
}
