package ru.netology.domain;


import java.util.Date;

public class Post {
    private int idPost; //id поста
    private int idСreator; // id создателя поста
    private int datePost;  // дата, время cоздания поста
    private PostInfo postInfo; //текст поста
    private boolean saveBookmark; // сохранить в закладках
    private AttachmentsPost attachmentsPost; //вложения в пост (фото видео и т.д.)
    private ComplaintsPost complaintsPost; //жалоба
    private LikePost LikePost; //лайк
    private CommentsPost commentsPost; //комментарии
    private SharePost sharepost;  // поделится постом
    private ReasonComplaints reasonComplaints;  //причина жалобы
    private int viewsPost; // счетчик просмотров, решил не усложнять в идеале нужно вести статистику

    public class PostInfo {
        private int idPostInfo; // id поста
        private int idAuthor; // id автора
        private String textComplaint; //текс поста
        private String urlPostInfo; //ссылка на вложение
    }

    public class ComplaintsPost {
        private int idComplaint; // id жалобы
        private int idAuthor; // id автора
        private int idReasonComplaint; //id причины жалобы
    }

    public class AttachmentsPost {
        private int idAttachment; // id вложения
        private int idAuthor; // id автора
        private String urlAttachment; //ссылка на вложение
    }

    public class LikePost {
        private int idLikePost; // id лайкнутого поста
        private int idLikeAuthor; // id автора лайка //если бы были дизлайки нужно добавить boolean
        private int likePost; //счетчик лайков
    }

    public class CommentsPost {
        private int idComments; // id комментария
        private int idAuthorComments; // id автора
        private String textComments; //текс коментария
    }

    private class SharePost {
        private int idSharePost; // id  поста
        private int idSareAuthor; // id автора
        private int SharePost; //счетчик

    }

    private class ReasonComplaints {
        private int idReasonComplaint; //id причины жалобы
        private String reasonComplaint; //текст жалобы
    }
    // + get/set на все поля
    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getIdСreator() {
        return idСreator;
    }

    public void setIdСreator(int idСreator) {
        this.idСreator = idСreator;
    }

    public int getDataPost() {
        return datePost;
    }

    public void setDataPost(int dataPost) {
        this.datePost = dataPost;
    }

    public PostInfo getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(PostInfo postInfo) {
        this.postInfo = postInfo;
    }

    public boolean isSaveBookmark() {
        return saveBookmark;
    }

    public void setSaveBookmark(boolean saveBookmark) {
        this.saveBookmark = saveBookmark;
    }

    public AttachmentsPost getAttachmentsPost() {
        return attachmentsPost;
    }

    public void setAttachmentsPost(AttachmentsPost attachmentsPost) {
        this.attachmentsPost = attachmentsPost;
    }

    public ComplaintsPost getComplaintsPost() {
        return complaintsPost;
    }

    public void setComplaintPost(ComplaintsPost complaintPost) {
        this.complaintsPost = complaintPost;
    }

    public Post.LikePost getLikePost() {
        return LikePost;
    }

    public void setLikePost(Post.LikePost likePost) {
        LikePost = likePost;
    }

    public CommentsPost getCommentsPost() {
        return commentsPost;
    }

    public void setCommentsPost(CommentsPost commentsPost) {
        this.commentsPost = commentsPost;
    }

    public SharePost getSharepost() {
        return sharepost;
    }

    public void setSharepost(SharePost sharepost) {
        this.sharepost = sharepost;
    }

    public ReasonComplaints getReasonComplaints() {
        return reasonComplaints;
    }

    public void setReasonComplaint(ReasonComplaints reasonComplaint) {
        this.reasonComplaints = reasonComplaint;
    }

    public int getViewsPost() {
        return viewsPost;
    }

    public void setViewsPost(int viewsPost) {
        this.viewsPost = viewsPost;
    }


}
