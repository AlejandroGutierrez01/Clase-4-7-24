import javax.swing.*;
import java.awt.*;
import java.net.ConnectException;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    String url = "jdbc:mysql://localhost:3306/estudiantes2024a";
//    String user = "root";
//    String password = "123456";
        JFrame frame = new JFrame();
        frame.setTitle("Estudiantes 2024");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Form1().panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(1028, 628);
        frame.setVisible(true);
    }
}
//    try(Connection connection = DriverManager.getConnection(url,user,password)) {
//        System.out.println("Conexion exitosa");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Cedula: ");
//        String cedula = sc.nextLine();
//        String query = "SELECT * FROM estudiantes where cedula = '"+cedula+"'";
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(query);
//        while(resultSet.next()) {
//            System.out.println("El estudiante "+ resultSet.getString("nombre")+" con cedula "+resultSet.getString("cedula") + " tiene de nota b1 " + resultSet.getString("b1")+ " y de nota b2 "+resultSet.getString("b2"));
//            Double n1 = Double.valueOf( resultSet.getDouble("b1"));
//            Double n2 = Double.valueOf(resultSet.getDouble("b2"));
//            Double nota = n1 + n2;
//            if (nota >= 28.0 ){
//                System.out.println("Sin supletorios");
//            }
//            else if ((nota < 28.0) && (nota >= 18.0) ) {
//                System.out.println("Va a supletorio");
//            } else if (nota< 18.0) {
//                System.out.println("Se quedo");
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("cedula: ");
//        String cedulaB = sc.nextLine();
//        String query2 = "SELECT * FROM estudiantes where cedula = cedulaB";
//        Statement statement1 = connection.createStatement();
//        ResultSet resultSet1 = statement.executeQuery(query2);
//        while(resultSet.next()) {
//            System.out.println("El estudiante "+ resultSet1.getString("nombre")+" con cedula "+resultSet1.getString("cedula") + " tiene de nota b1 " + resultSet1.getString("b1")+ " y de nota b2 "+resultSet1.getString("b2"));
//        }
//
//    }
//    catch(SQLException e){
//        System.out.println(e.getMessage());;
//        }
//    }
