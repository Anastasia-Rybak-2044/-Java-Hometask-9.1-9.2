
package ru.netology.domain;

public class PostInfo {
    private int postId;
    private int creatorID;
    private int adminID;
    private int ownerId; //идентификатор владельца стены, на которой размещена запись
    private  int fromId; //идентификатор автора записи (от чьего имени опубликована запись)
    private intreplyOwnerId; //идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; //идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly; //eсли запись была создана с опцией «Только для друзей».
    private int timewhenCreated;
    private boolean recommended; //true - yes, false - no
    private String name;
    private String text;
    private string copyright; //источник материала
    private string postType; //тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
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

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
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

    public string getCopyright() {
        return copyright;
    }

    public void setCopyright(string copyright) {
        this.copyright = copyright;
    }

    public string getPostType() {
        return postType;
    }

    public void setPostType(string postType) {
        this.postType = postType;
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
