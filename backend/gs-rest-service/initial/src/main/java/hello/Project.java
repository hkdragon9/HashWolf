package hello;

import java.util.HashSet;

public class Project extends Student {


    //same as Coder, pls follow Coder's codes first.

    //NewHeap heap = new NewHeap(this);

    Project(String n, String g, String m, String s, String p, String c) {
        super();
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

        heap  = new NewHeap(this);

        this.CharSet.add(graduation);
        this.CharSet.add(major);
        this.CharSet.add(skills);
        this.CharSet.add(positions);
        this.CharSet.add(commitment);

        for (Coder coder: Application.database.coders) {
            this.heap.add(coder);
            coder.heap.add(this);
        }
    }

    private class Node<Coder> {
        private Coder c;

        private int value;

        Node (Coder coder) {
            c = coder;
            value = setValue();
        }

        private int setValue() {
            return 0;
        }
    }

}
