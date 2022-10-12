package myPackage;

public class Student {
    private String name = "John";
    private String group = "C02";

    public Student(String name) {
        this.name = name;
    };

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
