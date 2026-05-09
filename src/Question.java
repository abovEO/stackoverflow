import java.util.ArrayList;
import java.util.List;

public class Question extends Post {

    private String title;
    private List<Answer> answers;
    private List<Tag> tags;

    public Question(Long id,
                    String title,
                    String content,
                    User author) {

        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;

        this.answers = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.votes = new ArrayList<>();
        this.tags = new ArrayList<>();
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public String getTitle() {
        return title;
    }
}