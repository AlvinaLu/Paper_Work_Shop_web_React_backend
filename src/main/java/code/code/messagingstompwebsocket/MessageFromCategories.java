package code.code.messagingstompwebsocket;

public class MessageFromCategories {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageFromCategories{" +
                "message='" + message + '\'' +
                '}';
    }
}
