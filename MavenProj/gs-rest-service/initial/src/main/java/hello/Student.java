package hello;

import java.util.HashMap;
import java.util.*;

public class Student implements Comparable<Student> {

    String name;

    String graduation;
    String major;
    String skills;
    String positions;
    String commitment;

    int id;

    HashSet<String> CharSet = new HashSet<>();

    int graduationInt;
    int majorInt;
    int skillsInt;
    int positionsInt;
    int commitmentInt;
    //and more

    public NewHeap<Student> heap;

    HashSet<Student> likedStudent = new HashSet<>();
    HashSet<Student> dislikedStudent = new HashSet<>();

    HashSet<Student> studentLikesYou = new HashSet<>();

    HashSet<String> dislikeCharacteristics = new HashSet<>();

    public static TreeMap<String, Integer> characteristics = new TreeMap<>();

    static {
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

    FixedQueue<Student> dislikedStudentQueue = new FixedQueue<>(5);

    Student() {
      this.id = 1;
      Application.database.addUser(this);
    }

    private int idGenerator() {
      return (int) (Math.random() * 1000000000);
    }

    public String getName() { return name; }
    public String getGraduation() { return graduation; }
    public String getMajor() { return major; }
    public String getSkills() { return skills; }
    public String getPositions() { return positions; }
    public String getCommitment() { return commitment; }

    //true stands for like, false is dislike
    public void swipe(boolean ifLike) {
        if (heap.isEmpty()) {
            for (Student stud: dislikedStudent) {
                heap.add(stud);
            }
            dislikedStudent = new HashSet<>();
        }

        Student next = heap.poll();
        if (ifLike) {
            likedStudent.add(next);
            next.studentLikesYou.add(this);
        } else {
            dislikedStudent.add(next);
            dislikedStudentQueue.add(next);

            if (dislikedStudentQueue.size() == 5) {
                findCommonDislikeCharacteristics(dislikedStudentQueue);
                NewHeap<Student> newNewHeap = new NewHeap<>(this);
                while (! heap.isEmpty()) {
                    Student stud = heap.poll();
                    for (String str: stud.CharSet) {
                        if (dislikeCharacteristics.contains(str)) {
                            dislikedStudent.add(stud);
                        } else {
                            newNewHeap.add(stud);
                        }
                    }
                }

                heap = newNewHeap;
            }
        }
    }

    public void findCommonDislikeCharacteristics(FixedQueue<Student> q) {

        for (String str : characteristics.keySet()) {
            int count = 0;
            for (Student stud: q) {
                if (stud.CharSet.contains(str)) {
                    count++;
                }
                if (count >=4) {
                    dislikeCharacteristics.add(str);
                }
            }
        }
    }

    public Student nextStudent() {
        return heap.peak();
    }

    //compares the charcteristics between two students(coders/project)
    @Override
    public int compareTo(Student s) {
        return Math.abs(graduationInt - s.graduationInt) +
                Math.abs(majorInt - s.majorInt) +
                Math.abs(skillsInt - s.skillsInt) +
                Math.abs(positionsInt - s.positionsInt) +
                Math.abs(commitmentInt - s.commitmentInt);
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
        this.heap.buildheap();

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
        this.heap.buildheap();
    }

    public String getChar(String s) {
        if (s.equals("name")) {
            return name;
        } if (s.equals("graduation")) {
            return graduation;
        } if (s.equals("major")) {
            return major;
        } if (s.equals("skills")) {
            return skills;
        } if (s.equals("positions")) {
            return positions;
        } if (s.equals("commitment")) {
            return commitment;
        }
        throw new RuntimeException("No such characteristics!");
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












}
