package ru.netology.domain;

public class Comment {
    private int countComment;
    private boolean canComment;
    private boolean groupsCanComment;
    private boolean canClose;
    private boolean canOpen;

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isGroupsCanComment() {
        return groupsCanComment;
    }

    public void setGroupsCanComment(boolean groupsCanComment) {
        this.groupsCanComment = groupsCanComment;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
