import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.sql.*;
import java.util.Scanner;


public class Form1 {
    private JButton btn1;
    public JPanel panel1;
    private JLabel nombreTxt;

    public Form1() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url="jdbc:mysql://localhost:3306/estudiantes2024a";
                String user="root";
                String password="123456";

                try (Connection connection= DriverManager.getConnection(url,user,password)){
                    System.out.println("Conectado a la base de datos");
                    String query="select * from estudiantes where cedula=0123456789";
                    Statement statement=connection.createStatement();
                    ResultSet resultSet=statement.executeQuery(query);
                    while(resultSet.next()){
                        System.out.println(resultSet.getString("nombre"));
                        nombreTxt.setText(resultSet.getString("nombre"));
                    }
                }catch (SQLException e1){
                    System.out.println(e1);}
            }
        });
    }
}
