public class Usernames {
    private String name;
    private int score;
    private int totalScore;

    public Usernames (String name) {
        this.name = name;
        this.score = 0;
        this.totalScore = 0;
    }

    public void addScore(int points) {
        this.score += points;
        this.totalScore += points;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void subtractScore(int points) {
        this.score -= points;
        if (this.score < 0);
        this.totalScore -= points;
    }
}
