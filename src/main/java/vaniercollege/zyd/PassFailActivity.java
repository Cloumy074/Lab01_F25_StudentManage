package vaniercollege.zyd;

/**
 *
 * @author 2480549
 */
public class PassFailActivity extends GradedActivity{
    private double minPassingScore;

    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    @Override
    public char getGrade() {
        if (this.getScore() >= minPassingScore) {
            return 'P';
        } else {
            return 'F';
        }
    }
}
