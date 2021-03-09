package ru.netology.domain;

public class SettingsPost {
    public boolean limitedPost;
    public boolean disableComment;

    public boolean isLimitedPost() {
        return limitedPost;
    }

    public void setLimitedPost(boolean limitedPost) {
        this.limitedPost = limitedPost;
    }

    public boolean isDisableComment() {
        return disableComment;
    }

    public void setDisableComment(boolean disableComment) {
        this.disableComment = disableComment;
    }
}
