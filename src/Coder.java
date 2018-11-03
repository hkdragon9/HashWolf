
public class Coder extends Student {
    private String name;

    private String graduation;
    private String major;
    private String skills;
    private String positions;
    private String commitment;


    private Heap heap;

    Coder(String n, String g, String m) {
        this.name = n;
        this.graduation = g;
        this.major = m;
    }


    //????????????
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




    private class Node<Project> {
        private Project p;

        private int value;

        Node (Project proj) {
            p = proj;
            value = setValue();
        }

        private int setValue() {
            return 0;
        }
    }
}
