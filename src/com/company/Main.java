package com.company;

import java.sql.*;

public class Main {
    private final static String url = "jdbc:postgresql://localhost:5432/company";
    private final static String user = "student";
    private final static String password = "C0d3Cr3w";

    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    private static void resultDisplay(ResultSet rs) throws SQLException
    {
        while (rs.next())
        {
            System.out.print(rs.getString(1)+ "\t");
            System.out.print(rs.getString(2)+ "\t");
            System.out.print(rs.getString(3)+ "\t");
            System.out.print(rs.getString(4)+ "\t");
            System.out.println(rs.getString(5));
        }
    }

    private static void exercise1(String fname, String lname, String position, Integer salary) {
//        Insert 4 new Employees using JDBC INSERT
        String SQL = "Insert into employee(firstname, lastname, position, salary) values(?,?,?,?)";

        try {
            Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1,fname);
            pstmt.setString(2,lname);
            pstmt.setString(3,position);
            pstmt.setInt(4,salary);
            ResultSet rs = pstmt.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void exercise2() {
//        SELECT all Employee records from the database
        String SQL = "SELECT * from employee";
        try
        {
            Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            ResultSet rs = pstmt.executeQuery();
            resultDisplay(rs);
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private static void exercise3(String positionToCompare) {
//       SELECT only the DEVELOPERS from the table
        String SQL = "SELECT * from employee where position = ?";
        try
        {
            Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1,positionToCompare);
            ResultSet rs = pstmt.executeQuery();
            resultDisplay(rs);
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private static void exercise4(Integer amountMade) {
//       SELECT only the Employees making more than 50000
        String SQL = "SELECT * from employee where salary > ?";
        try
        {
            Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1,amountMade);
            ResultSet rs = pstmt.executeQuery();
            resultDisplay(rs);
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private static void exercise5(String firstName , String lastName, String Position, Integer Salary) {
//        INSERT a new ENGINEER, Thomas Tank, with a salary of 75000
        exercise1(firstName, lastName, Position, Salary);
    }

    private static void exercise6(Integer newSalary , String employeeFirstName) {
//        UPDATE the salary for Ellen Musk and change her salary to 42000
//        String SQL = "SELECT * from employee";
        String SQL = " update employee set salary = ? where firstname = ?";

        try
        {
            Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1,newSalary);
            pstmt.setString(2,employeeFirstName);
            ResultSet rs = pstmt.executeQuery();
            resultDisplay(rs);
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private static void exercise7(String firstName) {
//       DELETE Sam Sham
//        String SQL = "SELECT * from employee";
        String SQL = "DELETE from employee where firstname = ?";

        try
        {
            Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1,firstName);
            ResultSet rs = pstmt.executeQuery();
            resultDisplay(rs);
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
//        exercise1("Chuck", "Jones", "MANAGER", 100000);
//        exercise1("Marty", "Krofft", "ENGINEER", 80000);
//        exercise1("Peter", "Barker", "DEVELOPER", 50000);
//        exercise1("Sam", "Sham", "DEVELOPER", 35000);
//        exercise1("Ellen", "Musk", "DEVELOPER", 38000);
//        exercise2();
//        exercise3("DEVELOPER");
//        exercise4(50000);
//        exercise5("Thomas","Tank","ENGINEER",75000);
//        exercise6(42000,"Ellen");
//        exercise7("Sam");

    }
}
//jdbc:postgresql://localhost:5432/company