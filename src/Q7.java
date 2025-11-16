import java.sql.*;

class Q7 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/labfiledb","root","root");

        Statement s = c.createStatement();
        s.executeUpdate("INSERT INTO students VALUES(1,'Krrish')");
        s.executeUpdate("UPDATE students SET name='Updated' WHERE id=1");

        System.out.println("Done");
    }
}
