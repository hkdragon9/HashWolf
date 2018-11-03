
public class Coder extends Student {
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

    private Heap heap;

    Coder(String n, String g, String m, String s, String p, String c) {
        this.name = n;
        this.graduation = g;
        this.major = m;
        this.skills = s;
        this.positions = p;
        this.commitment = c;

        this.graduationInt = characteristics.get(g);
        this.majorInt = characteristics.get(m);
        this.skillsInt = characteristics.get(s);
        this.positionsInt = characteristics.get(p);
        this.commitmentInt = characteristics.get(c);

    }


    //????????????
    @Override
    public int compareTo(Coder o) {



        return 0;
    }


    //this method is for us to manually change int values of characteristics.
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
        }
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
