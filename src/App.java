import enums.NotificationType;

public class App {
    public static void main(String[] args) {
        Page page = new Page();

        Observer f1 = new Follower(NotificationType.POSTS, "Gustavo");
        Observer f2 = new Follower(NotificationType.TODAS, "Katelyn");
        Observer f3 = new Follower(NotificationType.AOVIVO, "Larissa");
        Observer f4 = new Follower(NotificationType.RESPOSTAS, "Rafael");


        page.addFollower(f1);
        page.addFollower(f2);
        page.addFollower(f3);
        page.addFollower(f4);
        
        Post p1 = new Post("POO fez uma nova publicação.", NotificationType.POSTS);
        Post p2 = new Post("POO iniciou um video AoVivo.", NotificationType.AOVIVO);
        Post p3 = new Post("POO fez uma nova publicação.", NotificationType.POSTS);
        Post p4 = new Post("POO respondeu uma publicação. ", NotificationType.RESPOSTAS);

        page.publishPost(p1);
        page.publishPost(p2);
        page.publishPost(p3);
        page.publishPost(p4);

        page.removeFollower(f2);

        Post p5 = new Post("POO fez uma nova publicação.", NotificationType.POSTS);

        page.publishPost(p5);
    }
}
