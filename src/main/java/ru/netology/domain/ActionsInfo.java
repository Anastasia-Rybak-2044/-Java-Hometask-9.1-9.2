package ru.netology.domain;

public class ActionsInfo {
    private int canHide;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canComplain;
    private boolean canPin;
    private int isPinned;

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

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }
}
