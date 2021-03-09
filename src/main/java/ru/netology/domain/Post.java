package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private CommentPost commentPost;
    private boolean postLike;
    private int countLike;
    private int countComment;
    private int countView;
    private int countRepost;
    private String attachmentPost;
    private boolean canPinPost;
    private boolean canEditPost;
    private boolean canDeletePost;
    private GeoInfo geoInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId (int ownerId) {
        this.ownerId = ownerId;
    }
    public int getFromId () {
        return fromId;
    }
    public void setFromId (int fromId) {
        this.fromId = fromId;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public CommentPost getCommentPost() {
        return commentPost;
    }

    public void setCommentPost(CommentPost commentPost) {
        this.commentPost = commentPost;
    }

    public boolean isPostLike() {
        return postLike;
    }

    public void setPostLike(boolean postLike) {
        this.postLike = postLike;
    }

    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public int getCountView() {
        return countView;
    }

    public void setCountView(int countView) {
        this.countView = countView;
    }

    public int getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(int countRepost) {
        this.countRepost = countRepost;
    }

    public String getAttachmentPost() {
        return attachmentPost;
    }

    public void setAttachmentPost(String attachmentPost) {
        this.attachmentPost = attachmentPost;
    }

    public boolean isCanPinPost() {
        return canPinPost;
    }

    public void setCanPinPost(boolean canPinPost) {
        this.canPinPost = canPinPost;
    }

    public boolean isCanEditPost() {
        return canEditPost;
    }

    public void setCanEditPost(boolean canEditPost) {
        this.canEditPost = canEditPost;
    }

    public boolean isCanDeletePost() {
        return canDeletePost;
    }

    public void setCanDeletePost(boolean canDeletePost) {
        this.canDeletePost = canDeletePost;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }
}
