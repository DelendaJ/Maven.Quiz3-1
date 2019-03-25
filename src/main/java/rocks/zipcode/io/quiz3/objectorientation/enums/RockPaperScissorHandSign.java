package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("SCISSOR", "PAPER"),
    PAPER("ROCK", "SCISSOR"),
    SCISSOR("PAPER", "ROCK");

    String loser;
    String winner;

    RockPaperScissorHandSign(String loser, String winner) {
        this.loser = loser;
        this.winner = winner;
    }


    public RockPaperScissorHandSign getWinner() {
       return RockPaperScissorHandSign.valueOf(winner);
    }

    public RockPaperScissorHandSign getLoser() {
        return RockPaperScissorHandSign.valueOf(loser);
    }
}
