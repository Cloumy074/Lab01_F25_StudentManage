package vaniercollege.zyd;

/**
 * @author Yu Duo Zhang (2480549)
 * 2025/08/29
 * https://github.com/Cloumy074/Lab01_F25_StudentManage.git
 */
public class GradedActivity {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public char getGrade() {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        }  else {
            return 'F';
        }
    }
}
