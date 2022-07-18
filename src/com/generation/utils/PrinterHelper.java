package com.generation.utils;

import com.generation.model.Student;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PrinterHelper
{

    public static void showMainMenu(){
        System.out.println( "|-------------------------------|" );
        System.out.println( "| Welcome to StudentGen         |" );
        System.out.println( "|-------------------------------|" );
        System.out.println( "| Select 1 option:              |" );
        System.out.println( "| . 1 Register Student          |" );
        System.out.println( "| . 2 Find Student              |" );
        System.out.println( "| . 3 Enroll Student to Course  |" );
        System.out.println( "| . 4 Show Students Summary     |" );
        System.out.println( "| . 5 Show Courses Summary      |" );
        System.out.println( "| . 6 Exit                      |" );
        System.out.println( "|-------------------------------|" );
    }

    public static Student createStudentMenu( Scanner scanner )
        throws ParseException {
//        Scanner scanner1 = new Scanner(System.in);
        System.out.println("|-------------------------------------|");
        System.out.println("| . 1 Register Student                |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Enter student name:                 |");
        String name = scanner.next();
        System.out.println("| Enter student ID:                   |");
        String id = scanner.next();
        System.out.println("| Enter student email:                |");
        String email = scanner.next();
        System.out.println("| Enter student birth date(mm/dd/yyyy)|");
        DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        //TODO validate date format and catch exception to avoid crash
        Date birthDate = null;
        boolean invaliddateinput = true;

        //if(scanner.next().matches("(!(\\d{4}) - (0?[1-9] | 1[012]) - (0?[1-9] | [12] [1-9]| 3[01]))")){
        //if (formatter.hasNext("[0-9]{2}[/]{1}[0-9{2}[/]{1}[0-9]{4}")){
        while(invaliddateinput){
            try{
                birthDate = formatter.parse(scanner.next());
                invaliddateinput = false;

            } catch (Exception exception){
                System.out.println("==============================================================");
                System.out.println("                       invalid date input");
                System.out.println("==============================================================");
                System.out.println("| Enter Correct student birth date(mm/dd/yyyy)|");
            }
        }
            //BOD = formatter.parse(scanner.next());
            Student student = new Student(id, name, email, birthDate);
            System.out.println("|-------------------------------------|");
            System.out.println("Student Successfully Registered! ");
            System.out.println(student);
            return student;
    }

}


