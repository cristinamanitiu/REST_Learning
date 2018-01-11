package hello;

public class JsonGreeting {
    private final long id;
    private final String content;
    private final String adjective;

    public JsonGreeting(long id, String content, String adjective) {
        this.id = id;
        this.content = content;
        this.adjective=adjective;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAdjective(){
        return adjective;
    }
}
