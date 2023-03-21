package com.example.comp1008week9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {
    //the username and password should be what ever you use on YOUR mysql server
    private static String user = "root";
    private static String password = "root";

    //jdbc:mysql - this is telling the system which SQL driver to user
    //127.0.0.1:3306 - tells Java that mySQL server is at IP 127.0.0.1, port 3306
    //edmuse2023 - this is the database name
    private static String connectUrl = "jdbc:mysql://127.0.0.1:3306/edmuse2023";

    /**
     * This method will connect to the database and create an ArrayList of Course objects
     */
    public static ArrayList<Course> getCoursesFromDB()
    {
        ArrayList<Course> courses = new ArrayList<>();

        //connect to the DB
        //try with () indicates that it is a try with resources block. Resources will
        //automatically be closed if they are opened inside the () block
        try(
                Connection conn = DriverManager.getConnection(connectUrl,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM courses");
                )
        {
            //loop over the records returned an create Course objects
            while (resultSet.next())
            {
                int crn = resultSet.getInt("crn");
                String courseCode = resultSet.getString("courseCode");
                String courseName = resultSet.getString("courseName");

                courses.add(new Course(crn,courseCode,courseName));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return courses;
    }

}
