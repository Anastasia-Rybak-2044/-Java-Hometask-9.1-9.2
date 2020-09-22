package ru.netology.domain;

public class Like {
    private int likeID;
    private int likeAuthorID;
    private int likecount;

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

    public int getLikecount() {
        return likecount;
    }

    public void setLikecount(int likecount) {
        this.likecount = likecount;
    }
}

