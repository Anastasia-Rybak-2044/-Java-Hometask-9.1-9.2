package ru.netology.domain;

public class PostInfo {
    private int postId;
    private int creatorID;
    private int adminID;
    private int timewhenCreated;
    private boolean recommended; //true - yes, false - no
    private String name;
    private String text;
    private boolean advertisement;
    private ActionsInfo actionsInfo;
    private CommentsInfo commentsInfo;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public int getTimewhenCreated() {
        return timewhenCreated;
    }

    public void setTimewhenCreated(int timewhenCreated) {
        this.timewhenCreated = timewhenCreated;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(boolean advertisement) {
        this.advertisement = advertisement;
    }

    public ActionsInfo getActionsInfo() {
        return actionsInfo;
    }

    public void setActionsInfo(ActionsInfo actionsInfo) {
        this.actionsInfo = actionsInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
    package ru.netology.domain;

}
