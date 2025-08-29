package vaniercollege.zyd;

/**
 * @author Yu Duo Zhang (2480549)
 * 2025/08/29
 * https://github.com/Cloumy074/Lab01_F25_StudentManage.git
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int numQuestions, double pointsEach, int numMissed) {
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
