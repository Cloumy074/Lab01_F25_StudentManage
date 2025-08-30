package vaniercollege.zyd;

import java.util.Scanner;

/**
 *
 * @author 2480549
 */
public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;
    Scanner sc = new Scanner(System.in);

    public void setScore(double grammar, double spelling, double correctLength, double content) {
        setGrammar(grammar);
        setSpelling(spelling);
        setCorrectLength(correctLength);
        setContent(content);

        super.setScore(this.getGrammar() + this.getSpelling() + this.getCorrectLength() + this.getContent());
        super.getGrade();
    }

    public void setGrammar(double grammar) {
        while (grammar > 30) {
            System.out.println("ERROR: grammar must be less than 30\nGrammaer points: ");
            grammar = sc.nextDouble();
        }

        this.grammar = grammar;
    }

    public void setSpelling(double spelling) {
        while (spelling > 20) {
            System.out.println("ERROR: spelling must be less than 20\nSpelling points: ");
            spelling = sc.nextDouble();
        }

        this.spelling = spelling;
    }

    public void setCorrectLength(double correctLength) {
        while (correctLength > 20) {
            System.out.println("ERROR: CorrectLength must be less than 20\nCorrect Length points: ");
            correctLength = sc.nextDouble();
        }

        this.correctLength = correctLength;
    }

    public void setContent(double content) {
        while (content > 30) {
            System.out.println("ERROR: content must be less than 30\nContent points: ");
            content = sc.nextDouble();
        }

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

    @Override
    public String toString() {
        return String.format("Total points: %.1f\nGrade: %c", this.getScore(), this.getGrade());
    }
}
