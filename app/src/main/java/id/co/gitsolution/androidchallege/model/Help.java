package id.co.gitsolution.androidchallege.model;

/**
 * Created by Git Solution on 03/10/2017.
 */

public class Help {
    private String question;
    private String answer;
    private String date;
    private String viewer;

    public Help(String question, String answer, String date, String viewer) {
        this.question = question;
        this.answer = answer;
        this.date = date;
        this.viewer = viewer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getViewer() {
        return viewer;
    }

    public void setViewer(String viewer) {
        this.viewer = viewer;
    }
}
