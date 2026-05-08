//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StackOverflowService service =
                new StackOverflowService();

        User user1 =
                new User(3642384L, "Nainsi", "nainsi@gmail.com");

        User user2 =
                new User(342L, "Praneet", "praneet@gmail.com");

        Question question =
                service.createQuestion(
                        3642384L,
                        "what?",
                        "whattttttt?",
                        user1
                );

        Tag tag = new Tag(3642384L, "ques");
        question.addTag(tag);

        Answer answer =
                service.createAnswer(
                        3642384L,
                        "nothing",
                        user2,
                        question
                );

        Comment comment =
                new Comment(
                        3642384L,
                        "Good answer!",
                        user1
                );

        service.addComment(answer, comment);

        Vote vote =
                new Vote(
                        3642384L,
                        user1,
                        VoteType.UPVOTE
                );

        service.addVote(answer, vote);

        System.out.println(question.getTitle());
        System.out.println(question.getContent());

        System.out.println(answer.getContent());

        System.out.println(
                "Votes : " +
                        answer.getVoteCount()
        );
    }
}