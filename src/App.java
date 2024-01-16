import enums.TipoNotificacao;

public class App {
    public static void main(String[] args) {
        Page page = new Page();

        Observer f1 = new Follower(TipoNotificacao.POSTS, "Gustavo");
        Observer f2 = new Follower(TipoNotificacao.TODAS, "Katelyn");

        page.addFollower(f1);
        page.addFollower(f2);
        
        Post p1 = new Post("Todas as Notificações", TipoNotificacao.TODAS);
        Post p2 = new Post("Post", TipoNotificacao.POSTS);
        Post p3 = new Post("Video Ao vivo", TipoNotificacao.AOVIVO);
        Post p4 = new Post("Post", TipoNotificacao.TODAS);

        page.publish(p1);
        page.publish(p2);
        page.publish(p3);
        page.publish(p4);
    }
}
