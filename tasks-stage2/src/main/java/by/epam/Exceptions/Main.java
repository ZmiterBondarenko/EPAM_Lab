package by.epam.Exceptions;

public class Main {
    public static void main(String[] args) {
        Student[] studentsArray = new Student[]{
                new Student("Electrotechnical", "ET-1", "Ivanov Alexsander", new Subject[]{
                        new Subject("Math", 7),
                        new Subject("Physics", 7),
                        new Subject("English", 8),
                }),
                new Student("Electrotechnical", "ET-1", "Rivera Annar", new Subject[]{
                        new Subject("Math", 3),
                        new Subject("Physics", 5),
                        new Subject("English", 7),
                }),
                new Student("Electrotechnical", "ET-1", "Kovar Boris", new Subject[]{
                        new Subject("Math", 6),
                        new Subject("Physics", 6),
                        new Subject("English", 8),
                }),
                new Student("Electrotechnical", "ET-1", "Sinicin Eugene", new Subject[]{
                        new Subject("Math", 3),
                        new Subject("Physics", 5),
                        new Subject("English", 10),
                }),
                new Student("Mechanical", "M-1", "Petrov Ivan", new Subject[]{
                        new Subject("Math", 10),
                        new Subject("Physics", 4),
                        new Subject("English", 9),
                }),
                new Student("Mechanical", "M-1", "Grachev Ivan", new Subject[]{
                        new Subject("Math", 3),
                        new Subject("Physics", 3),
                        new Subject("English", 5),
                }),
                new Student("Mechanical", "M-1", "Peskov Pavel", new Subject[]{
                        new Subject("", 8),
                        new Subject("Physics", 9),
                        new Subject("English", 6),
                }),
                new Student("Mechanical", "M-1", "Kihle Anna", new Subject[]{
                        new Subject("Math", -1),
                        new Subject("Physics", -1),
                        new Subject("English", -1),
                }),
                new Student("Mechanical", "M-1", "Erickson Maria", new Subject[]{
                })
        };

        System.out.println("Students list");
        for (Student student : studentsArray) {
            System.out.println(student);
        }

        //    Посчитать средний балл по всем предметам студента
        System.out.println("\nAverage mark of students:");
        for (Student student : studentsArray) {
            if (!student.getStudentName().equals("Undefine") &&
                    !student.getGroupName().equals("Undefine") &&
                    !student.getFacultyName().equals("Undefine"))
            {
                int j=0;
                int hasMarks=0;
                while (j < student.getSubject().length && !student.getSubject()[j].getNameSubject().equals("Undefine") &&
                        !(student.getSubject()[j].getMark() == -1)
                )
                {
                    j++;
                    hasMarks++;
                }
                if (hasMarks >= 1) {
                    System.out.println(student.getStudentName()+ ": " + String.format("%.2f",student.getAverageMarkOfSubjects()) + ", faculty: "
                            + student.getFacultyName() + ", group: " + student.getGroupName());
                }
            }
        }
        //    Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
        double sumMarks = 0;
        double averageMark = 0;
        int countMarks = 0;
        for (Student student : studentsArray) {
            if (student.getAverageMarkOfSubjectInGroupAtFaculty("English", "ET-1", "Electrotechnical") > 0)
            {
                sumMarks += student.getAverageMarkOfSubjectInGroupAtFaculty("English", "ET-1","Electrotechnical");
                countMarks += 1;
            }
        }
        if (countMarks != 0)
            averageMark = sumMarks / countMarks;
        System.out.println("\nAverage mark for the subject: " + "English" + ", in group: " + "ET-1" + ", at the faculty: " + "Electrotechnical");
        System.out.println(String.format("%.2f",averageMark));

        //    Посчитать средний балл по предмету для всего университета
        sumMarks = 0;
        countMarks = 0;
        for (Student student : studentsArray) {
            if (student.getAverageMarkForSubject("Math") >0)
            {
                sumMarks += student.getAverageMarkForSubject("Math");
                countMarks += 1;
            }
        }
        if (countMarks != 0)
            averageMark = sumMarks / countMarks;
        System.out.println("\nAverage mark of the subject: " + "Math" + " at university:");
        System.out.println(String.format("%.2f",averageMark));
    }
}
