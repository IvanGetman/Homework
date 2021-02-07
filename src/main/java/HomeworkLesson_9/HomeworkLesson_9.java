package HomeworkLesson_9;

import java.sql.*;

/**
 * Java Core for Android
 * Project Homework
 *
 * @author Ivan Getman
 * @version 1.0
 * Created 07.02.2021
 */
public class HomeworkLesson_9 {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;
    private static String primaryLoad = "CREATE TABLE if not exists Cats(CatsID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, Name TEXT NOT NULL, Color TEXT NOT NULL, Weight INTEGER NOT NULL);";
    private static String preparedStr = "insert into Cats(Name, Color, Weight) values (?, ?, ?)";

    public static void main(String[] args) throws SQLException {
        connect();
        statement = connection.createStatement();
        statement.execute(primaryLoad);

        createCatBD("Мурзик", "Черный", 2);
        createCatBD("Тыгтыг", "Белый", 3);
        createCatBD("Рыжик", "Рыжий", 4);
        createCatBD("Шарик", "Серый", 5);

        readCatBD();
        updateCatBD("update Cats set Name = 'Жирный' where Weight > 4;");
        deleteCatBD("delete from Cats where CatsID > 10;");

        close();
    }

    private static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:cats.db");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void close() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void createCatBD(String name, String color, int weight) {
        Cat cat = new Cat(name, color, weight);
        try {
            preparedStatement = connection.prepareStatement(preparedStr);
            preparedStatement.setString(1, cat.getName());
            preparedStatement.setString(2, cat.getColor());
            preparedStatement.setInt(3, cat.getWeight());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void readCatBD() {
        try {
            ResultSet rs = statement.executeQuery("select * from Cats;");
            while (rs.next()) {
                System.out.println("id " + rs.getString(1) + " cat " + rs.getString(2) + " color " + rs.getString(3) + " weight " + rs.getString(4));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void updateCatBD(String stringSQL) {

        try {
            ResultSet rs = statement.executeQuery("select * from Cats;");
            while (rs.next()) {
                statement.executeUpdate(stringSQL);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private static void deleteCatBD(String stringSQL) {
        try {
            ResultSet rs = statement.executeQuery("select * from Cats;");
            while (rs.next()) {
                statement.executeUpdate(stringSQL);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
