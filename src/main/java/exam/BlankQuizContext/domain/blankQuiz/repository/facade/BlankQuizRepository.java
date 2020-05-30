package exam.BlankQuizContext.domain.blankQuiz.repository.facade;

import exam.BlankQuizContext.domain.blankQuiz.entity.BlankQuiz;
import exam.BlankQuizContext.domain.blankQuiz.entity.BlankQuizId;

import java.util.List;

public interface BlankQuizRepository {
    BlankQuiz find(BlankQuizId blankQuizId);

    List<BlankQuiz> getAll();

    boolean save(BlankQuiz blankQuiz);

    boolean delete(BlankQuizId blankQuizId);
}
