package HW42.Forum;

import java.time.LocalDateTime;
import java.util.Objects;

public class Post {

    private int postId;
    private String title;
    private String author;
    private String content;
    private LocalDateTime date;
    private int likes;

    // коснтруктор и прочие методы
    public Post(int postId, String title, String author, String content) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", likes=" + likes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;  // вернем false, когда сравниваем с null или с объектом другого класса
        Post post = (Post) o;
        return postId == post.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId);
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}