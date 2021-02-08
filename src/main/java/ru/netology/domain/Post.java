package ru.netology.domain;

public class Post {
    private int idPost; //id поста
    private int idСreator; // id создателя поста
    private int datePost;  // дата, время cоздания поста
    private PostInfo postInfo; //текст поста
    private boolean saveBookmark; // сохранить в закладках
    private AttachmentsPost attachmentsPost; //вложения в пост (фото видео и т.д.)
    private ComplaintsPost complaintsPost; //жалоба
    private LikePost likePost; //лайк
    private CommentsPost commentsPost; //комментарии
    private SharePost sharepost;  // поделится постом
    private ReasonComplaints reasonComplaints;  //причина жалобы
    private int viewsPost; // счетчик просмотров, решил не усложнять в идеале нужно вести статистику

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

    public int getDatePost() {
        return datePost;
    }

    public void setDatePost(int datePost) {
        this.datePost = datePost;
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

    public void setComplaintsPost(ComplaintsPost complaintsPost) {
        this.complaintsPost = complaintsPost;
    }

    public LikePost getLikePost() {
        return likePost;
    }

    public void setLikePost(LikePost likePost) {
        this.likePost = likePost;
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

    public void setReasonComplaints(ReasonComplaints reasonComplaints) {
        this.reasonComplaints = reasonComplaints;
    }

    public int getViewsPost() {
        return viewsPost;
    }

    public void setViewsPost(int viewsPost) {
        this.viewsPost = viewsPost;
    }
}
