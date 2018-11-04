package hello;

public class Coder extends Student {
    /*
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
*/

    //NewHeap heap = new NewHeap(this);

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

        heap = new NewHeap(this);

        this.CharSet.add(graduation);
        this.CharSet.add(major);
        this.CharSet.add(skills);
        this.CharSet.add(positions);
        this.CharSet.add(commitment);






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
