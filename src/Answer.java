import java.util.ArrayList;
import java.util.List;

public class Answer implements Votable, Commentable {

    private Long id;
    private String content;

    private User author;
    private Question question;

    private List<Comment> comments;
    private List<Vote> votes;

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

    public String getContent() {
        return content;
    }
}