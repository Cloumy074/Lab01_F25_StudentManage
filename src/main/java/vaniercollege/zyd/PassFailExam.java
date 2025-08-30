package vaniercollege.zyd;

/**
 *
 * @author 2480549
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int numQuestions, int numMissed, double minPassingScore ) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.pointsEach = 100.00 /  numQuestions;
        this.numMissed = numMissed;
        super.setScore(100.00 - numMissed *  this.pointsEach);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    @Override
    public String toString() {
        return String.format("Each question counts %.1f points.\nThe exam score is %.1f\nThe exam grade is %c", this.getPointsEach(), this.getScore(), this.getGrade());
    }
}
