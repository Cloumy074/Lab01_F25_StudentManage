package vaniercollege.zyd;

/**
 *
 * @author 2480549
 */
public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    @Override
    public void setScore(double grammar, double spelling, double correctLength, double content) {
        super.setScore(grammar + spelling + correctLength + content);
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public void setContent(double content) {
        this.content = content;
    }

    public double getGrammar() {
        return grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public double getContent() {
        return content;
    }
}
