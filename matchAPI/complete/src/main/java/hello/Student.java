package hello;

import java.util.HashMap;
import java.util.*;


public class Student implements Comparable<Student> {


    private String name;

    private String graduation;
    private String major;
    private String skills;
    private String positions;
    private String commitment;

    private int graduationInt;
    private int majorInt;
    private int skillsInt;
    private int positionsInt;
    private int commitmentInt;
    //and more

    //private Heap heap;


    public static TreeMap<String, Integer> characteristics = new TreeMap<>();


    Student() {

        characteristics.put("EECS", 10);
        characteristics.put("Math", 7);
        characteristics.put("Data Science", 9);
        characteristics.put("Statistics", 8);
        characteristics.put("Business", 3);
        characteristics.put("Media Studies", 1);

        characteristics.put("Freshman", 1);
        characteristics.put("Sophomore", 2);
        characteristics.put("Junior", 3);
        characteristics.put("Senior", 4);
        characteristics.put("Graduate", 5);
        characteristics.put("PHD", 6);

        characteristics.put("Java", 3);
        characteristics.put("Python", 3);
        characteristics.put("SQL", 2);
        characteristics.put("Machine Learning", 5);
        characteristics.put("Excel", 1);
        characteristics.put("Microsoft office", 1);

        characteristics.put("Backend Software Engineer", 5);
        characteristics.put("Frontend Software Engineer", 10);
        characteristics.put("IOS Software Engineer", 9);
        characteristics.put("WebDev Software Engineer", 9);
        characteristics.put("FullStack Software Engineer", 7);
        characteristics.put("Data Analyst", 5);
        characteristics.put("Project Manager", 1);

        characteristics.put("4 Hours per Week", 1);
        characteristics.put("8 Hours per Week", 2);
        characteristics.put("12 Hours per Week", 3);
        characteristics.put("16 Hours per Week", 4);
        characteristics.put("20 Hours per Week", 5);


    }


    //compares the charcteristics between two students(coders/project)
    @Override
    public int compareTo(Student o) {



        return 0;
    }

    //this method is for us to manually change int values of characteristics.
    //I can do one for String as well. But not yet.
    public void setChar(String charact, int n) {
        if (charact.equals("graduation")) {
            graduationInt = n;
        } else if (charact.equals("major")) {
            majorInt = n;
        } else if (charact.equals("skills")) {
            skillsInt = n;
        } else if (charact.equals("positions")) {
            positionsInt = n;
        } else if (charact.equals("commitment")) {
            commitmentInt = n;
        } else {
            throw new RuntimeException("No such characteristics!");
        }
    }

    //this method is for the user to change their information
    public void setChar(String charact, String s) {
        if (charact.equals("name")) {
            name = s;
        } else if (charact.equals("graduation")) {
            graduation = s;
            graduationInt = characteristics.get(s);
        } else if (charact.equals("major")) {
            major = s;
            majorInt = characteristics.get(s);
        } else if (charact.equals("skills")) {
            skills = s;
            skillsInt = characteristics.get(s);
        } else if (charact.equals("positions")) {
            positions = s;
            positionsInt = characteristics.get(s);
        } else if (charact.equals("commitment")) {
            commitment = s;
            commitmentInt = characteristics.get(s);
        } else {
            throw new RuntimeException("No such characteristics!");
        }
    }


    public String getChar(String s) {
        if (s.equals("name")) {
            return name;
        } else if (s.equals("graduation")) {
            return graduation;
        } else if (s.equals("major")) {
            return major;
        } else if (s.equals("skills")) {
            return skills;
        } else if (s.equals("positions")) {
            return positions;
        } else if (s.equals("commitment")) {
            return commitment;
        } else {
            throw new RuntimeException("No such characteristics!");
        }

    }

    public int getCharInt(String s) {
        if (s.equals("graduation")) {
            return graduationInt;
        } else if (s.equals("major")) {
            return majorInt;
        } else if (s.equals("skills")) {
            return skillsInt;
        } else if (s.equals("positions")) {
            return positionsInt;
        } else if (s.equals("commitment")) {
            return commitmentInt;
        } else {
            throw new RuntimeException("No such characteristics!");
        }
    }

    public void printAllChar() {
        System.out.println("Name: " +name);
        System.out.println("Graduation: " +graduation + " IntValue: " + graduationInt);
        System.out.println("Major: " +major + " IntValue: " + majorInt);
        System.out.println("Skills: " +skills + " IntValue: " + skillsInt);
        System.out.println("Position: " +positions + " IntValue: " + positionsInt);
        System.out.println("Commitment: " +commitment + " IntValue: " + commitmentInt);

    }


    //other function:

    //reconstruct heap, but probably just use online api
    public void heapify() {

    }

    //return the next one in the heap
    public Student nextStudent() {
      return null;
    }






}
