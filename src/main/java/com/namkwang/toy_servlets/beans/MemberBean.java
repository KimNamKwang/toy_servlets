package com.namkwang.toy_servlets.beans;

public class MemberBean {
    protected String questions_list;
    protected String answer_list;
    protected String questions_answers;

    public void setQuestions_list(String questions_list) {
        this.questions_list = questions_list;
    }

    public String getQuestions_list() {
        return this.questions_list;
    }

    public void setAnswer_list(String answer_list) {
        this.answer_list = answer_list;
    }

    public String getAnswer_list() {
        return this.answer_list;
    }

    public void setQuestions_answers(String questions_answers) {
        this.questions_answers = questions_answers;
    }

    public String getQuestions_answers() {
        return this.questions_answers;
    }
}
