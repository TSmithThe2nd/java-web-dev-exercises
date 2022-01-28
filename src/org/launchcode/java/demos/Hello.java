package org.launchcode.java.demos;

import org.launchcode.java.demos.lsn4classes2.Course;
import org.launchcode.java.demos.lsn4classes2.Student;
import org.launchcode.java.demos.lsn4classes2.Teacher;

import java.util.ArrayList;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        Student me= new Student("Thomas",1,1,4.0);
        Teacher you= new Teacher("Tim", "Smoh","JavaScript", 5);
        System.out.println(me.getGpa());
        ArrayList<Student> roster= new ArrayList<>();
        roster.add(me);

        Course JavaScript= new Course("JavaScript", you, roster);

        System.out.println(JavaScript.getTopic());

    }
}


