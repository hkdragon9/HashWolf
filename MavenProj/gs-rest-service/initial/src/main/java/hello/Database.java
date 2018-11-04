package hello;

import java.util.HashMap;
import java.util.HashSet;

public class Database {

    HashSet<Project> projects;
    HashSet<Coder> coders;

    private HashMap<Integer, Student> studentMap;

    Database() {
        coders = new HashSet<>();
        projects = new HashSet<>();
        studentMap = new HashMap<>();
    }

    void addUser(Student s) {
        if (s instanceof Coder) {
            addCoder((Coder) s);
        } else {
        addProject((Project) s);
        }
        studentMap.put(s.id, s);
    }

    void addCoder(Coder s) {
        coders.add(s);
    }

    void addProject(Project s) {
        projects.add(s);
    }

    public Student findUser(int id) {
        assert studentMap.containsKey(id) : "User not found.";
        return studentMap.get(id);
    }
}
