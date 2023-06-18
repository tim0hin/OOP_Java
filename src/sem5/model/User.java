package sem5.model;

public abstract class User {
    private String name;
    private Integer yearOfBorn;

    public User(String name, Integer yearOfBorn) {
        this.name = name;
        this.yearOfBorn = yearOfBorn;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(Integer yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    @Override
    public String toString() {
        return name + " " + yearOfBorn;
    }
}
