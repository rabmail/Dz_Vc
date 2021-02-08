package ru.netology.domain;

public class CommentsPost {
    private int idComments; // id комментария
    private int idAuthorComments; // id автора
    private String textComments; //текс коментария

    public int getIdComments() {
        return idComments;
    }

    public void setIdComments(int idComments) {
        this.idComments = idComments;
    }

    public int getIdAuthorComments() {
        return idAuthorComments;
    }

    public void setIdAuthorComments(int idAuthorComments) {
        this.idAuthorComments = idAuthorComments;
    }

    public String getTextComments() {
        return textComments;
    }

    public void setTextComments(String textComments) {
        this.textComments = textComments;
    }
}
