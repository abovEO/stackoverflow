import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String name;
    private String email;
    private int reputation;

    private List<Question> questions;
    private List<Answer> answers;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.reputation = 0;

        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    public String getName() {
        return name;
    }
}