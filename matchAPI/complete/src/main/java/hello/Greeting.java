package hello;

public class Greeting {

    private final long id;
    private final String content;
    private String name;

    public Greeting() {
        this.id = -1;
        this.content = "";
        this.name = "Ken";
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.name = "Ken";
    }
    
    public String getName() {
    	return name;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
