public class StackOverflowService {

    public Question createQuestion(Long id,
                                   String title,
                                   String content,
                                   User user) {

        Question question =
                new Question(id, title, content, user);

        user.addQuestion(question);

        return question;
    }

    public Answer createAnswer(Long id,
                               String content,
                               User user,
                               Question question) {

        Answer answer =
                new Answer(id, content, user, question);

        question.addAnswer(answer);
        user.addAnswer(answer);

        return answer;
    }

    public void addComment(Commentable entity,
                           Comment comment) {

        entity.addComment(comment);
    }

    public void addVote(Votable entity,
                        Vote vote) {

        entity.addVote(vote);
    }
}