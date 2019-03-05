package JavaOOP.WorkingWithAbstractions_3.StudentSystem_3;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(
                String.format("%s is %s years old. ",
                        this.getName(), this.getAge()));

        if (this.getGrade() >= 5.00) {
            str.append("Excellent student.");
        } else if (this.getGrade() < 5.00 && this.getGrade() >= 3.50) {
            str.append("Average student.");
        } else {
            str.append("Very nice person.");
        }

        return str.toString();
    }
}
