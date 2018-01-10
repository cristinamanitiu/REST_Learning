package hello;

public class JsonGreeting {
    private final long id;
    private final String content;

    public JsonGreeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
