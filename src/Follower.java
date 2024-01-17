
import enums.NotificationType;

public class Follower implements Observer {
    private NotificationType notificationType;
    private String name;

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public Follower(NotificationType preferencia, String name) {
        this.notificationType = preferencia;
        this.name = name;
    }

    @Override
    public void update(Post post) {
        System.out.println(name + ":\n - " + post.getNotification().toString() + "\n - " + post.getConteudo());
    }
}
