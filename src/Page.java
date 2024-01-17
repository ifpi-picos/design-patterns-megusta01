import java.util.List;

import enums.NotificationType;

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
            if (follower.getNotificationType().equals(NotificationType.TODAS) 
            || follower.getNotificationType().equals(post.getNotification())) {
                follower.update(post);
            }
        }
    }

    public void publishPost(Post post) {
        posts.add(post);
        notifyFollowers(post);
    }
}
