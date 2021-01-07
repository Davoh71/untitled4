package homework.adPortal.model;

public class User {

    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private String poneNumbe;
    private String pasword;

    public User(String name, String surname, Gender gender, int age, String poneNumbe, String pasword) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.poneNumbe = poneNumbe;
        this.pasword = pasword;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoneNumbe() {
        return poneNumbe;
    }

    public void setPoneNumbe(String poneNumbe) {
        this.poneNumbe = poneNumbe;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        if (gender != user.gender) return false;
        if (poneNumbe != null ? !poneNumbe.equals(user.poneNumbe) : user.poneNumbe != null) return false;
        return pasword != null ? pasword.equals(user.pasword) : user.pasword == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (poneNumbe != null ? poneNumbe.hashCode() : 0);
        result = 31 * result + (pasword != null ? pasword.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", poneNumbe='" + poneNumbe + '\'' +
                '}';
    }
}
