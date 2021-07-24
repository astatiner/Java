 //JDBC Demo 
 import java.sql.*;
 import java.util.Date;
 import java.io.*;
 public class databaseConnectivity
 {
     public static void main(String[] args) throws Exception {
        Date date = new Date();
        String connectionUrl = "jdbc:sqlserver://localhost:__portNumberGoesHere__;databaseName=__dataBaseNameGoesHere___";
        String username = "__yourUserNameGoesHere__";
        String password = "__yourPasswordGoesHere__";
         try (Connection con = DriverManager.getConnection(connectionUrl,username,password);
                Statement stmt = con.createStatement();) {
                System.out.println("Successfully connected to SQL Database");
                String toDate = date.toString();
                //This query inserts a username, a password, an E-mail and date at the time of execution in a SQL Database Table
                String query ="INSERT INTO userTable VALUES('sampleUsername','sampleHashedPassword','sampleE-Mail','toDate')";
                stmt.executeUpdate(query);
                System.out.println("Query executed successfully");
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
 }