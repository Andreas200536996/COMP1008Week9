package com.example.comp1008week9;

public class DBUtility {
    //the username and password should be what ever you use on YOUR mysql server
    private static String user = "root";
    private static String password = "root";

    //jdbc:mysql - this is telling the system which SQL driver to user
    //127.0.0.1:3306 - tells Java that mySQL server is at IP 127.0.0.1, port 3306
    //edmuse2023 - this is the database name
    private static String connectUrl = "jdbc:mysql://127.0.0.1:3306/edmuse2023";

}
