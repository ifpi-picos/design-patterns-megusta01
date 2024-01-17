import enums.NotificationType;

public class Post {
    private String conteudo;
    private NotificationType notification;

    public Post(String conteudo, NotificationType notification) {
        this.conteudo = conteudo;
        this.notification = notification;
    }

    public String getConteudo() {
        return conteudo;
    }

    public NotificationType getNotification() {
        return notification;
    }
}
