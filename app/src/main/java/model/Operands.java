package model;

public class Operands {

    private String operation;
    private float answer;
    private String elapsedTime;
    private String status;
    private int totalOfQuestions;
    private int totalAnsweredQuestions;
    private String totalDuration;
    private String totalElapsedTime;



    private float percentCorrectAnswer;
    private float percentWrongAnswer;
    private String velocity;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public float getAnswer() {
        return answer;
    }

    public void setAnswer(float answer) {
        this.answer = answer;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalOfQuestions() {
        return totalOfQuestions;
    }

    public void setTotalOfQuestions(int totalOfQuestions) {
        this.totalOfQuestions = totalOfQuestions;
    }

    public int getTotalAnsweredQuestions() {
        return totalAnsweredQuestions;
    }

    public void setTotalAnsweredQuestions(int totalAnsweredQuestions) {
        this.totalAnsweredQuestions = totalAnsweredQuestions;
    }

    public String getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(String totalDuration) {
        this.totalDuration = totalDuration;
    }

    public String getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(String totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public float getPercentCorrectAnswer() {
        return percentCorrectAnswer;
    }

    public void setPercentCorrectAnswer(float percentCorrectAnswer) {
        this.percentCorrectAnswer = percentCorrectAnswer;
    }

    public float getPercentWrongAnswer() {
        return percentWrongAnswer;
    }

    public void setPercentWrongAnswer(float percentWrongAnswer) {
        this.percentWrongAnswer = percentWrongAnswer;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }



    public Operands(String operation, float answer, String elapsedTime, String status, int totalOfQuestions, int totalAnsweredQuestions, String totalDuration, String totalElapsedTime, float percentCorrectAnswer, float percentWrongAnswer, String velocity) {
        this.operation = operation;
        this.answer = answer;
        this.elapsedTime = elapsedTime;
        this.status = status;
        this.totalOfQuestions = totalOfQuestions;
        this.totalAnsweredQuestions = totalAnsweredQuestions;
        this.totalDuration = totalDuration;
        this.totalElapsedTime = totalElapsedTime;
        this.percentCorrectAnswer = percentCorrectAnswer;
        this.percentWrongAnswer = percentWrongAnswer;
        this.velocity = velocity;
    }

    public Operands() {
        this.operation = "";
        this.answer = 0;
        this.elapsedTime = "00:00";
        this.status = "Undefined";
        this.totalOfQuestions = 0;
        this.totalAnsweredQuestions = 0;
        this.totalDuration = "00:00";
        this.totalElapsedTime = "00:00";
        this.percentCorrectAnswer = 0;
        this.percentWrongAnswer = 0;
        this.velocity = "00:00";
    }

    @Override
    public String toString() {
        return "Operator{" +
                "operation='" + operation + '\'' +
                ", answer=" + answer +
                ", elapsedTime='" + elapsedTime + '\'' +
                ", status='" + status + '\'' +
                ", totalOfQuestions=" + totalOfQuestions +
                ", totalAnsweredQuestions=" + totalAnsweredQuestions +
                ", totalDuration='" + totalDuration + '\'' +
                ", totalElapsedTime='" + totalElapsedTime + '\'' +
                ", percentCorrectAnswer=" + percentCorrectAnswer +
                ", percentWrongAnswer=" + percentWrongAnswer +
                ", velocity='" + velocity + '\'' +
                '}';
    }











}
