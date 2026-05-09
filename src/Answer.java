import java.util.ArrayList;
import java.util.List;

public class Answer extends Post {

    private Question question;

    public Answer(Long id,
                  String content,
                  User author,
                  Question question) {

        this.id = id;
        this.content = content;
        this.author = author;
        this.question = question;

        this.comments = new ArrayList<>();
        this.votes = new ArrayList<>();
    }

    private String getQuestion(){
        return this.question.content;
    }
}