package HomeworkLesson_4;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 20.01.2021
 */
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                fullName +
                ", " + position +
                ", email: " + email +
                ", телефон: " + phone +
                ", зарплата: " + salary +
                ", возраст: " + age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
