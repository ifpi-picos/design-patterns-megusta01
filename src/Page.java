import java.util.List;

import java.util.ArrayList;

public class Page {
    private List<Observer> followers = new ArrayList<>();
    List<Post> posts = new ArrayList<>();

    public void addFollower(Observer follower) {
        followers.add(follower);
    }

    public void removeFollower(Observer follower) {
        followers.remove(follower);
    }

    public void notifyFollowers(Post post) {
        for (Observer follower : followers) {
            if(follower.getTipoNotificacao().equals(post.getNotificacao())){
                follower.update(post);
            }
        }
    }

    public void publish(Post post) {
        posts.add(post);
        notifyFollowers(post);
    }
}
