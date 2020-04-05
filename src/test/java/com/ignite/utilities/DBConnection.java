package com.ignite.utilities;


import java.sql.*;

public class DBConnection {

    static String LOGIN = "ignite";
    static String PASSWORD = "Eh7ruY3!p@82";
    static String dbURL = "jdbc:sqlserver://192.168.1.15\\COOLSQLIGNITE;";

    static Connection connection = null;
    static Statement statement = null;
    static ResultSet resultSet;

    public static void main(String[] args) throws SQLException {


        try {

            connection = DriverManager.getConnection(dbURL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            //Put the query that you want ro run
            resultSet = statement.executeQuery("SELECT TOP (1000) \n" +
                    "      [firstName]\n" +
                    "      ,[lastName]\n" +
                    "      ,[dateOfBirth]\n" +
                    "  FROM [CoolSIS_111].[dbo].[stdApplications]");

            // Iterate through the data in the result set and display it.
            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstName") + "      " + resultSet.getString("lastName") + "     " + resultSet.getString("dateOfBirth"));

            }
            // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void myQuery(String query) throws SQLException {

        connection = DriverManager.getConnection(dbURL, LOGIN, PASSWORD);
        statement = connection.createStatement();
       String SQL = "SELECT TOP (1000) [firstName],[lastName],[gender]  FROM [CoolSIS_111].[dbo].[stdApplications]";
       // String SQL ="SELECT firstName,lastName,gender,fullName  FROM [CoolSIS_111].[dbo].[stdApplications]";

        resultSet = statement.executeQuery(SQL);

        while (resultSet.next()) {
            System.out.println(resultSet.getString(query));

        }
    }
}


      /*  resultSet = statement.executeQuery("SELECT TOP (1000) \n" +


      /*

         // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://192.168.1.15\\COOLSQLIGNITE;" +
                "databaseName=" + MyDataBase + ";" +
                "user=ignite;" +
                "password=Eh7ruY3!p@82";
            ResultSet rs = state.executeQuery(SQL);

    }
    }


/*

 public void myQuery( String query){
        query="\"[SELECT TOP (1000) [applicationId]\" +\n" +
DBConnection dbConnection=new DBConnection();

dbConnection.myQuery("select*from tablename")  // parentezin ici quer

parent parent=new Parent();

parent.firstName
 */

