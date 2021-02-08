package ru.netology.domain;

public class SharePost {
    private int idSharePost; // id  поста
    private int idSareAuthor; // id автора
    private int SharePost; //счетчик

    public int getIdSharePost() {
        return idSharePost;
    }

    public void setIdSharePost(int idSharePost) {
        this.idSharePost = idSharePost;
    }

    public int getIdSareAuthor() {
        return idSareAuthor;
    }

    public void setIdSareAuthor(int idSareAuthor) {
        this.idSareAuthor = idSareAuthor;
    }

    public int getSharePost() {
        return SharePost;
    }

    public void setSharePost(int sharePost) {
        SharePost = sharePost;
    }
}
