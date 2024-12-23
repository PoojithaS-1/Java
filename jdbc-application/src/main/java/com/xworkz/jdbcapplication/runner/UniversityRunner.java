package com.xworkz.jdbcapplication.runner;
import java.sql.*;
public class UniversityRunner {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver Found");
            String url="jdbc:mysql://localhost:3306/UNIVERSITY";
            String userName="root";
            String password="p00jitha@S";
            DriverManager.getConnection(url,userName,password);
            System.out.println("Connection Established");
        } catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC Driver not found"+classNotFoundException.getMessage());
        }
    }
}
