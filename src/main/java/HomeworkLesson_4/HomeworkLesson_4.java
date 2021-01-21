package HomeworkLesson_4;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 20.01.2021
 */
public class HomeworkLesson_4 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Директор", "ivanov@mail.ru", "+7-495-495-11-11", 90000, 65);
        employees[1] = new Employee("Иванова Галина Ивановна", "Бухгалтер", "ivanova@mail.ru", "+7-495-495-11-12", 80000, 55);
        employees[2] = new Employee("Иванов Сергей Иванович", "Менджер", "ivanovS@mail.ru", "+7-495-495-11-13", 70000, 45);
        employees[3] = new Employee("Сергеев Сергей Сергеевич", "Менеджер", "sergeev@mail.ru", "+7-495-495-11-14", 65000, 35);
        employees[4] = new Employee("Сергеева Галина Сергеевна", "Секретарь", "sergeeva@mail.ru", "+7-495-495-11-15", 50000, 25);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) System.out.println(employee.toString());
        }
    }
}
