import java.util.HashSet;

public class Main {


    HashSet<Coder> CoderSet = new HashSet<>();
    HashSet<Project> ProjectSet = new HashSet<>();


    public void addCoder(Coder c) {
        CoderSet.add(c);
        for (Project p: ProjectSet) {
            c.heap.add(p);
            p.heap.add(c);
        }

    }

    public void addProject(Project p) {
        ProjectSet.add(p);
        for (Coder c: CoderSet) {
            p.heap.add(c);
            c.heap.add(p);
        }
    }






    public static void main(String[] args) {
	// write your code here


        FixedQueue<Integer> test = new FixedQueue<>(10) ;

        for (int i = 1; i <= 12; i++) {
            System.out.println(test.add(i) + test.toString());
        }
    }
}
