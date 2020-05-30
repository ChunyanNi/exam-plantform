package exam.BlankQuizContext.domain.blankQuiz.entity;

import exam.paperContext.domain.model.paper.IllegalScoreException;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class BlankQuiz implements ValueObject<BlankQuiz> {
    private String quizId;
    private int score;
    private boolean isValid;

    public BlankQuiz(String quizId, int score) {
        if(score > 100 || score < 0) {
            throw new IllegalScoreException(score);
        }
        this.quizId = quizId;
        this.score = score;
        this.isValid = true;
    }

    @Override
    public boolean sameValueAs(BlankQuiz other) {
        return this.equals(other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlankQuiz blankQuiz = (BlankQuiz) o;
        return score == blankQuiz.score &&
                Objects.equals(quizId, blankQuiz.quizId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quizId, score);
    }
}
