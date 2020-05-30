package exam.BlankQuizContext.domain.blankQuiz.service;

import exam.BlankQuizContext.domain.blankQuiz.entity.BlankQuiz;
import exam.BlankQuizContext.domain.blankQuiz.repository.facade.BlankQuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlankQuizService {
    private BlankQuizRepository blankQuizRepository;

    @Autowired
    public BlankQuizService(BlankQuizRepository blankQuizRepository) {
        this.blankQuizRepository = blankQuizRepository;
    }
//    public BlankQuiz createBlankQuiz(){
//
//    }
//
//    public BlankQuiz updateBlankQuiz(){}
//
//    public BlankQuiz invalidBlankQuiz() {
//    }
}
