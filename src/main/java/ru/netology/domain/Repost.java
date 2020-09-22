package ru.netology.domain;

public class Repost {
    int repostID;
    int repostAuthorID;
    int count;

    public int getRepostID() {
        return repostID;
    }

    public void setRepostID(int repostID) {
        this.repostID = repostID;
    }

    public int getRepostAuthorID() {
        return repostAuthorID;
    }

    public void setRepostAuthorID(int repostAuthorID) {
        this.repostAuthorID = repostAuthorID;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
