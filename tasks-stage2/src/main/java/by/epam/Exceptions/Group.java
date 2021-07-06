package by.epam.Exceptions;

public class Group  {
    private String groupName;
    private Faculty faculty;

    public Group(String groupName, Faculty faculty) {
        this.groupName = groupName;
        this.faculty = faculty;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return  groupName;
    }
}