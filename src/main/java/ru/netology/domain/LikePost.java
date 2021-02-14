package ru.netology.domain;

public class LikePost {
    private int count; // число пользователей, которым
    private boolean userLikes; //  наличие отметки «Мне нравится»
    private boolean canLikes;  //информация о том, может ли текущий пользователь поставить отметку
    private boolean canPublish; //информация о том, может ли текущий пользователь сделать репост

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLikes() {
        return canLikes;
    }

    public void setCanLikes(boolean canLikes) {
        this.canLikes = canLikes;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}