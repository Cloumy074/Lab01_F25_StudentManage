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

    public FinalExam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        this.pointsEach = 100.00 / numQuestions;
        double result = 100.00 - (numMissed * this.pointsEach);
        super.setScore(result);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    @Override
    public String toString() {
        return String.format("Each question counts %.1f points.\nThe exam score is %.1f\nThe exam grade is %c",  pointsEach, this.getScore(), this.getGrade());
    }
}
