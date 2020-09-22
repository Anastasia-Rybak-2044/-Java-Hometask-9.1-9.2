package ru.netology.domain;

public class ActionsInfo {
    private boolean canLike;
    private int likesCounter;
    private int likeAuthorID;
    private boolean canRepost;
    private int repostAuthorID;
    private  int repostCounter;
    private int canHide; // hide a post
    private boolean canEdit;
    private boolean canDelete;
    private boolean canComplain; // put a complaint on an inappropriate content
    private boolean canSave;

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public int getLikesCounter() {
        return likesCounter;
    }

    public void setLikesCounter(int likesCounter) {
        this.likesCounter = likesCounter;
    }

    public int getLikeAuthorID() {
        return likeAuthorID;
    }

    public void setLikeAuthorID(int likeAuthorID) {
        this.likeAuthorID = likeAuthorID;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public int getRepostAuthorID() {
        return repostAuthorID;
    }

    public void setRepostAuthorID(int repostAuthorID) {
        this.repostAuthorID = repostAuthorID;
    }

    public int getRepostCounter() {
        return repostCounter;
    }

    public void setRepostCounter(int repostCounter) {
        this.repostCounter = repostCounter;
    }

    public int getCanHide() {
        return canHide;
    }

    public void setCanHide(int canHide) {
        this.canHide = canHide;
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

    public boolean isCanComplain() {
        return canComplain;
    }

    public void setCanComplain(boolean canComplain) {
        this.canComplain = canComplain;
    }

    public boolean isCanSave() {
        return canSave;
    }

    public void setCanSave(boolean canSave) {
        this.canSave = canSave;
    }
}
