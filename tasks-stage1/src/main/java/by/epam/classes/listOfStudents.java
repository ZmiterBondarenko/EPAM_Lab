package by.epam.classes;
public class listOfStudents {
    public static void main(String[] args) {
        StudentsList newList = new StudentsList();
        newList.addStudents(new Students("Ivanov", "Alexander", "Petrovich", "23.04.2000", "Gomel, Sovetskaya str, 18-20", "1234567", "ET", "2", "ET-21"));
        newList.addStudents(new Students("Ivanov", "Alexander", "Petrovich", "23.04.2000", "Gomel, Sovetskaya str, 18-20", "1234567", "ET", "2", "ET-21"));
        newList.addStudents(new Students("Rivera", "Anna", "Alexandrovna", "20.05.2001", "Gomel, Lenina str, 1-21", "2122334", "ACC", "1", "ACC-11"));
        newList.addStudents(new Students("Kovar", "Boris", "Petrovich", "01.05.2001", "Gomel, Lange str, 12-21", "3122334", "M", "1", "M-11"));
        newList.addStudents(new Students("Baker", "Denis", "Borisovich", "13.11.2000", "Gomel, Rechitskaia str, 86-123", "4122334", "ET", "1", "ET-11"));
        newList.addStudents(new Students("Komar", "Sirena", "Ivanovna", "22.05.2000", "Minsk, Masherova str, 1-21", "5122334", "ACC", "2", "ACC-21"));
        newList.addStudents(new Students("Sinicin", "Eugene", "Vladimirovich", "20.08.1999", "Gomel, Sovetskaya str, 123-21", "6122334", "M", "3", "M-31"));
        newList.addStudents(new Students("Foster", "Gabrielle", "Petrovna", "20.11.2000", "Rechitsa, Urickogo str, 11", "7122334", "ACC", "1", "ACC-11"));
        newList.addStudents(new Students("Vargas", "Jessika", "Petrovna", "31.12.1998", "Gomel, Kosareva str, 11-121", "8122334", "ACC", "3", "ACC-31"));
        newList.addStudents(new Students("Lopez", "Iana", "Alexandrovna", "01.11.2000", "Lida, Sovetskaya str, 11-31", "9122334", "ACC", "2", "ACC-21"));
        newList.addStudents(new Students("Russel", "Isabella", "Nikolaevna", "13.02.1997", "Grodno, Puskina str, 21", "1022334", "ACC", "4", "ACC-41"));
        newList.addStudents(new Students("Jacobs", "Alexander", "Ivanovich", "09.02.2001", "Minsk, Sverdlova str, 45-222", "1122344", "M", "2", "M-21"));
        newList.addStudents(new Students("Grachev", "Ivan", "Andreevich", "23.05.1997", "Osipovichy, Sovetskaja str, 12-21", "1222334", "M", "4", "M-41"));
        newList.addStudents(new Students("Peskov", "Pavel", "Petrovich", "14.08.2001", "Gomel, Hasanovskaja str, 45", "1322334", "ET", "2", "ET-21"));
        newList.addStudents(new Students("Griffin", "Simmon", "Pavlovich", "25.09.2002", "Mogilev, Lenina str, 55-21", "1422334", "M", "1", "M-11"));
        newList.addStudents(new Students("Kim", "Kate", "Andreevna", "25.03.2001", "Mogilev, Sovetskaya str, 13", "1522334", "ACC", "2", "ACC-21"));
        newList.addStudents(new Students("Kihle", "Anna", "Srergeevna", "20.12.2001", "Vitebsk, Novaja str, 55", "1622334", "ET", "2", "ET-21"));
        newList.addStudents(new Students("Erickson", "Maria", "Alexandrovna", "30.04.1997", "Gomel, Dostoevskogo str, 45-21", "1722334", "ACC", "4", "ACC-41"));
        newList.getFacultyList("ET");
        newList.getFacultyCourseList("ACC", "1");
        newList.getYearOfBirthList("2000");
        newList.getGroupList("ET-21");
    }
}
