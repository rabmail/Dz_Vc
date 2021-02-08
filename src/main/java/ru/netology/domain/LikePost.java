package ru.netology.domain;

public class LikePost {
    private int idLikePost; // id лайкнутого поста
    private int idLikeAuthor; // id автора лайка //если бы были дизлайки нужно добавить boolean
    private int likePost; //счетчик лайков

    public int getIdLikePost() {
        return idLikePost;
    }

    public void setIdLikePost(int idLikePost) {
        this.idLikePost = idLikePost;
    }

    public int getIdLikeAuthor() {
        return idLikeAuthor;
    }

    public void setIdLikeAuthor(int idLikeAuthor) {
        this.idLikeAuthor = idLikeAuthor;
    }

    public int getLikePost() {
        return likePost;
    }

    public void setLikePost(int likePost) {
        this.likePost = likePost;
    }
}
