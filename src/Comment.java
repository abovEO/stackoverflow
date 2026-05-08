public class Comment {

    private Long id;
    private String content;

    private User author;

    public Comment(Long id,
                   String content,
                   User author) {

        this.id = id;
        this.content = content;
        this.author = author;
    }

    public String getContent() {
        return content;
    }
}