package by.epam.Exceptions;

import by.epam.Exceptions.CustomExceptions.CustomExceptions.*;

public class Main {
    public static void main(String[] args) {
        Faculty electrotechnicalFaculty = new Faculty("Electrotechnical");
        Faculty mechanicalFaculty = new Faculty("Mechanical");


        Group groupElectrotechnicalFaculty = new Group("ET-1", electrotechnicalFaculty);
        Group groupMechanicalFaculty = new Group("M-1", mechanicalFaculty);

        Student[] studentsArray = new Student[]{
                new Student(electrotechnicalFaculty, groupElectrotechnicalFaculty, "Ivanov Alexander", new Subject[]{
                        new Subject("Math", 7),
                        new Subject("Physics", 7),
                        new Subject("English", 8),
                }),
                new Student(electrotechnicalFaculty, groupElectrotechnicalFaculty, "Rivera Annar", new Subject[]{
                        new Subject("Math", 3),
                        new Subject("Physics", 5),
                        new Subject("English", 7),
                }),
                new Student(electrotechnicalFaculty, groupElectrotechnicalFaculty, "Kovar Boris", new Subject[]{
                        new Subject("Math", 6),
                        new Subject("Physics", 6),
                        new Subject("English", 8),
                }),
                new Student(electrotechnicalFaculty, groupElectrotechnicalFaculty, "Sinicin Eugene", new Subject[]{
                        new Subject("Math", 3),
                        new Subject("Physics", 5),
                        new Subject("English", -1),
                }),
                new Student(mechanicalFaculty, groupMechanicalFaculty, "", new Subject[]{
                        new Subject("Math", 10),
                        new Subject("Physics", 4),
                        new Subject("English", 9),
                }),
                new Student(mechanicalFaculty, groupMechanicalFaculty, "Grachev Ivan", new Subject[]{
                        new Subject("Math", 3),
                        new Subject("Physics", 10),
                        new Subject("English", 5),
                }),
                new Student(mechanicalFaculty, groupMechanicalFaculty, "Peskov Pavel", new Subject[]{
                        new Subject("Math", 8),
                        new Subject("Physics", 9),
                        new Subject("English", 6),
                }),
                new Student(mechanicalFaculty, groupMechanicalFaculty, "Kihle Anna", new Subject[]{
                        new Subject("", 5),
                        new Subject("Physics", 6),
                        new Subject("English", 8),
                }),
                new Student(mechanicalFaculty, groupMechanicalFaculty, "Kihle Anna", new Subject[]{
                })
        };
//        System.out.println("Students list");
//        for (by.epam.Exceptions.Student student : studentsArray) {
//          System.out.println(student.toString());
//        }

        //    Посчитать средний балл по всем предметам студента
        System.out.println("\nAverage mark of students:");
        for (Student student : studentsArray) {
            try {
                System.out.println(student.getStudentName()+ ": " + String.format("%.2f",student.getAverageMarkOfSubjects()) + ", faculty: "
                        + student.getFacultyName() + ", group: " + student.getGroupName());
            } catch (SubjectMarkAndNameException e) {
            }
        }

        //    Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
        double sumMarks = 0;
        double averageMark = 0;
        int countMarks = 0;

        for (Student student : studentsArray) {
            if (student.getGroupName() != null &&
                    student.getFacultyName() != null){
                if (student.getAverageMarkOfSubjectInGroupAtFaculty("English", "ET-1", "Electrotechnical") >= 0) {
                    sumMarks += student.getAverageMarkOfSubjectInGroupAtFaculty("English", "ET-1","Electrotechnical");
                    countMarks += 1;
                }
            }}
        if (countMarks != 0)
            averageMark = sumMarks / countMarks;
        System.out.println("\nAverage mark for the subject: " + "English" + ", in group: " + "ET-1" + ", at the faculty: " + "Electrotechnical");
        System.out.println(String.format("%.2f",averageMark) + "\n");


        //    Посчитать средний балл по предмету для всего университета
        sumMarks = 0;
        countMarks = 0;
        for (Student student : studentsArray) {
            if (student.getGroupName() != null &&
                    student.getFacultyName() != null){
                if (student.getAverageMarkForSubject("Math") >= 0) {
                    sumMarks += student.getAverageMarkForSubject("Math");
                    countMarks += 1;
                }
            }}
        if (countMarks != 0)
            averageMark = sumMarks / countMarks;
        System.out.println("\nAverage mark of the subject: " + "Math" + " at university:");
        System.out.println(String.format("%.2f",averageMark) + "\n");
    }
}
