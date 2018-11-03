
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

    /*
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

    */


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
