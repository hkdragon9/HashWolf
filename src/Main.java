import java.util.HashSet;
import java.util.ArrayList;

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

        String n1 = "proj1";
        String g1 = "PHD";    //6
        String m1 = "EECS";   //10
        String s1 = "Machine Learning";  //5
        String p1 ="Frontend Software Engineer"; //10
        String t1 = "16 Hours per Week"; //4
        Project proj1 = new Project(n1, g1, m1, s1, p1, t1);
        String n2 = "proj2";
        String g2 = "PHD";  //6
        String m2 = "EECS"; //10
        String s2 = "SQL";  //2
        String p2 = "Data Analyst";  //5
        String t2 = "4 Hours per Week";  //1
        Project proj2 = new Project(n2, g2, m2, s2, p2, t2);
        String n3 = "proj3";
        String g3 = "PHD";  //6
        String m3 = "EECS";   //10
        String s3 = "Machine Learning";  //5
        String p3 ="Frontend Software Engineer";  //10
        String t3 = "16 Hours per Week";  //4
        Project proj3 = new Project(n3, g3, m3, s3, p3, t3);


        ArrayList<Coder> Coders= new ArrayList();


        String[] name = new String[]{"Lucy", "Ken", "Kenny", "zeichuan"};
        String[] grade = new String[]{"PHD", "Senior", "Sophomore", "Freshman"};
        String[] major = new String[]{"EECS", "Data Science", "Business", "Media Studies"};
        String[] skills = new String[]{"Machine Learning", "Python", "Java", "Excel"};
        String[] positions = new String[]{"Frontend Software Engineer", "WebDev Software Engineer", "Data Analyst", "Project Manager"};
        String[] time = new String[]{"16 Hours per Week", "12 Hours per Week", "8 Hours per " +
                "Week", "4 Hours per Week"};
                                                                                            //    6, 10, 2, 5, 1
        Coder c1 = new Coder(name[0],grade[0], major[0], skills[0], positions[0],time[0]);  //Lucy: 6,10,5,10,4
        Coder c2 = new Coder(name[1],grade[1], major[1], skills[1], positions[1],time[1]);  //Ken: 4, 9, 3, 9, 3
        Coder c3 = new Coder(name[2],grade[2], major[2], skills[2], positions[2],time[2]);  //Kenny: 2, 3, 3, 5, 2
        Coder c4 = new Coder(name[3],grade[3], major[3], skills[3], positions[3],time[3]);  //ZC: 1, 1, 1, 1, 1

        Main m = new Main();

        m.addProject(proj1);
        m.addProject(proj2);
        m.addProject(proj3);

        m.addCoder(c1);
        m.addCoder(c2);
        m.addCoder(c3);
        m.addCoder(c4);



        int n = proj2.heap.size;


//        while (n > 0) {
//            Student tempCoder = proj2.heap.poll();
//            System.out.println(tempCoder.name);
//            System.out.println(tempCoder.compareTo(proj2));
//            System.out.println(proj2.compareTo(tempCoder));
//            System.out.println(proj2.compareTo(proj2));
//
//
//            n--;
//            //System.out.println(" n: " + n);
//        }
/**

        proj1.nextStudent().printAllChar();
        proj1.swipe(true);
        proj1.nextStudent().printAllChar();
        proj1.swipe(true);
        proj1.nextStudent().printAllChar();
        proj1.swipe(true);
        proj1.nextStudent().printAllChar();
        System.out.println("end of proj1");
        System.out.println();

        proj2.nextStudent().printAllChar();
        proj2.swipe(true);
        proj2.nextStudent().printAllChar();
        proj2.swipe(true);
        proj2.nextStudent().printAllChar();
        proj2.swipe(true);
        proj2.nextStudent().printAllChar();
        System.out.println("end of proj3");
        System.out.println();*/
        proj3.nextStudent().printAllChar();
        proj3.swipe(false);
        proj3.nextStudent().printAllChar();
        proj3.swipe(false);
        proj3.nextStudent().printAllChar();




    }
}
