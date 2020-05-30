package exam.BlankQuizContext.domain.blankQuiz.repository.repository;

import exam.BlankQuizContext.domain.blankQuiz.entity.BlankQuiz;
import exam.BlankQuizContext.domain.blankQuiz.entity.BlankQuizId;
import exam.BlankQuizContext.domain.blankQuiz.repository.facade.BlankQuizRepository;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class BlankQuizRepositoryImpl implements BlankQuizRepository {
    private Set<BlankQuiz> blankQuizs = new HashSet<>();

    @Override
    public BlankQuiz find(BlankQuizId blankQuizId) {
        return blankQuizs.stream().filter(blankQuiz-> {
            return blankQuiz.getBlankQuizId().equals(blankQuizId);
        }).findFirst().orElseThrow(NullPointerException::new);
    }

    @Override
    public List<BlankQuiz> getAll(){
        return blankQuizs.stream().collect(Collectors.toList());
    }

    @Override
    public boolean save(BlankQuiz blankQuiz){
        return blankQuizs.add(blankQuiz);
    }

    @Override
    public boolean delete(BlankQuizId blankQuizId) {
        return blankQuizs.remove(blankQuizs.stream().filter(blankQuiz-> {
            return blankQuiz.getBlankQuizId().equals(blankQuizId);
        }).findFirst());
    };
}
