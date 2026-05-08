import java.util.ArrayList;
import java.util.List;

public class Question implements Votable, Commentable {

    private Long id;
    private String title;
    private String content;

    private User author;

    private List<Answer> answers;
    private List<Comment> comments;
    private List<Vote> votes;
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

    @Override
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public void addVote(Vote vote) {
        votes.add(vote);
    }

    @Override
    public int getVoteCount() {

        int count = 0;

        for (Vote vote : votes) {
            count += vote.getVoteType().getValue();
        }

        return count;
    }

    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
}