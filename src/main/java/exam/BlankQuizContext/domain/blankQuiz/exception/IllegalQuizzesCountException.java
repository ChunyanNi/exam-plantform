package exam.BlankQuizContext.domain.blankQuiz.exception;

class IllegalQuizzesCountException extends IllegalArgumentException {

    public IllegalQuizzesCountException(int actual) {
        super("TooManyQuizzesException: exception:5~20, actual:" + actual);
    }
}
