import enums.NotificationType;

public interface Observer {
    public void update(Post post);

    public NotificationType getNotificationType();
}
