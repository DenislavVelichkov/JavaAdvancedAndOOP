package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

public class Child {
    private String name;
    private String birthday;

    public Child(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return String.join(" ", this.name, this.birthday);
    }
}
