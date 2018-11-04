package hello;

import java.util.HashMap;
import java.util.HashSet;

public class Database {

    private HashSet<Student> projects;
    private Hashset<Student> coders;

    private HashMap<Integer, Student> studentMap;

    public Database() {
        coders = new HashSet<>();
        projects = new HashSet<>();
    }

    public void addUser(Student s) {
        if (s instanceof Coder) {
            addCoder((Coder) s);
        } else {
        addProject((Project) s);
        }
        studentMap.put(s.id, s);
    }

    public void addCoder(Coder s) {
        coders.add(s);
    }

    public void addProject(Project s) {
        projects.add(s);
    }

    public findUser(int id) {
        assert studentMap.contains(id);
        return studentMap.get(id);
  }
}