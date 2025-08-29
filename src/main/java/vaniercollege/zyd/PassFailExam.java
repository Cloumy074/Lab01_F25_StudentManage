package vaniercollege.zyd;

/**
 *
 * @author 2480549
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(double minPassingScore, int numQuestions, double pointsEach, int numMissed) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.pointsEach = pointsEach;
        this.numMissed = numMissed;
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
