package ru.netology.domain;

public class LikeInfo {
    private int likeID;
    private int likeAuthorID;
    private int likeCount;

    public int getLikeID() {
        return likeID;
    }

    public void setLikeID(int likeID) {
        this.likeID = likeID;
    }

    public int getLikeAuthorID() {
        return likeAuthorID;
    }

    public void setLikeAuthorID(int likeAuthorID) {
        this.likeAuthorID = likeAuthorID;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
