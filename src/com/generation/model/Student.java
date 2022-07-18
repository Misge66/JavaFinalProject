package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO implement this method

        if (!approvedCourses.containsKey(courses)) {
            approvedCourses.put(course.getCode(), course);
        } else{
            System.out.println("Student is already registered for this course");
        }
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        // if(!approvedCourses.containsKey(courseCode)){

//        }
//       if ( courses.contains( courseCode ) )
//        {
//            List<Course> course1 = courses;
//            for ( Student student : students )
//            {
//                System.out.println( student );
//            }
  //      }
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}