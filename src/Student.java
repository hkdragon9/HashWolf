import java.util.HashMap;
import java.util.*;


public class Student {


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
    public int compareTo(Coder o) {



        return 0;
    }

    public void setChar(String s, int n) {

    }

    public int getChar(String s) {
        return

    }

    public void printAllChar() {
        System.out.println();
    }


    //other function:

    //reconstruct heap, but probably just use online api
    public void heapify() {

    }

    //return the next one in the heap
    public Student nextStudent() {

    }






}
