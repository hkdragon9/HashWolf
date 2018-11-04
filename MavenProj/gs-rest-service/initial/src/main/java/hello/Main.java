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

    }




    //swipe left and swipe right


    public static void main(String[] args) {
	// write your code here




    }
}
