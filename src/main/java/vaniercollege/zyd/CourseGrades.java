package vaniercollege.zyd;

/**
 *
 * @author 2480549
 */
public class CourseGrades implements Analyzable {
    private GradedActivity[] grades;
    private final int NUM_GRADES = 4;

    public CourseGrades() {}

    public void setLab (GradedActivity aLab) {}
    public void setPassFailExam (PassFailExam passFailExam) {}
    public void setEssay (Essay essay) {}
    public void setFinalExam (FinalExam finalExam) {}

    @Override
    public String toString() {
        return super.toString();
    }
}
