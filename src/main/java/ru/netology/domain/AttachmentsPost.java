package ru.netology.domain;

public class AttachmentsPost {
    private int idAttachment; // id вложения
    private int idAuthor; // id автора
    private String urlAttachment; //ссылка на вложение

    public int getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(int idAttachment) {
        this.idAttachment = idAttachment;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getUrlAttachment() {
        return urlAttachment;
    }

    public void setUrlAttachment(String urlAttachment) {
        this.urlAttachment = urlAttachment;
    }
}
