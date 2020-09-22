package ru.netology.domain;

public class CommentsInfo {
    private boolean canComment;
    private int groupsCanPost; //информация о том, могут ли сообщества комментировать запись;
    int commentID;
    int commentAuthorID;
    int commentTime;
    private String commentText;
    private int counter;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canReply;
    private int groupsCanPost; //информация о том, могут ли сообщества комментировать запись
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи
    private boolean canClose; //может ли текущий пользователь закрыть комментарии к записи
    private String reference; // reference to an external site

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getCommentAuthorID() {
        return commentAuthorID;
    }

    public void setCommentAuthorID(int commentAuthorID) {
        this.commentAuthorID = commentAuthorID;
    }

    public int getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(int commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanReply() {
        return canReply;
    }

    public void setCanReply(boolean canReply) {
        this.canReply = canReply;
    }
}