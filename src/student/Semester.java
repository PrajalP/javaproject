package student;

import java.io.Serializable;
import java.util.ArrayList;
public class Semester implements Serializable{

    ArrayList<Course> courses;
    SGPA sgpa;

    Semester()
    {
        courses = new ArrayList<Course>();
        sgpa = new SGPA();
    }

    public void addCourse()
    {
        Course c = new Course();
        c.addCourse();
        courses.add(c);
    }

    public void calculateSGPA()
    {
        sgpa.setSgpa(courses);
    }

    public String toString()
    {
        String s="";
        for(Course i:courses)
            s+=i.toString();
        return s+sgpa.toString();
    }

    public void print()
    {
        System.out.println(toString());
    }

}
