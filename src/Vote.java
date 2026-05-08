public class Vote {

    private Long id;

    private User voter;
    private VoteType voteType;

    public Vote(Long id,
                User voter,
                VoteType voteType) {

        this.id = id;
        this.voter = voter;
        this.voteType = voteType;
    }

    public VoteType getVoteType() {
        return voteType;
    }
}