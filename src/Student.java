public class Student {


    private String name;

    private String graduation;
    private String major;
    private String skills;
    private String positions;
    private String commitment;
    //and more

    private Heap heap;

    Coder(String n, String g, String m) {
        this.name = n;
        this.graduation = g;
        this.major = m;
    }


    //compares the charcteristics between two students(coders/project)
    @Override
    public int compareTo(Coder o) {



        return 0;
    }

    public void setChar(String s, int n) {

    }

    public void getChar(String s, int n) {

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
