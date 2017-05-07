package com.entity;

import java.sql.Timestamp;

/**
 * Created by LK on 2017/5/7.
 */
public class Content {
    private Integer contentId;
    private Integer categoryId;
    private Timestamp createDate;
    private Timestamp pubDate;
    private Timestamp lastModifyDate;
    private Integer contentType;
    private Integer status;
    private Integer editorType;
    private User userByUserId;

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public void setContentType(Byte contentType) {
        this.contentType = contentType;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setEditorType(Byte editorType) {
        this.editorType = editorType;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getPubDate() {
        return pubDate;
    }

    public void setPubDate(Timestamp pubDate) {
        this.pubDate = pubDate;
    }

    public Timestamp getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Timestamp lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEditorType() {
        return editorType;
    }

    public void setEditorType(Integer editorType) {
        this.editorType = editorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Content content = (Content) o;

        if (contentId != null ? !contentId.equals(content.contentId) : content.contentId != null) return false;
        if (categoryId != null ? !categoryId.equals(content.categoryId) : content.categoryId != null) return false;
        if (createDate != null ? !createDate.equals(content.createDate) : content.createDate != null) return false;
        if (pubDate != null ? !pubDate.equals(content.pubDate) : content.pubDate != null) return false;
        if (lastModifyDate != null ? !lastModifyDate.equals(content.lastModifyDate) : content.lastModifyDate != null) return false;
        if (contentType != null ? !contentType.equals(content.contentType) : content.contentType != null) return false;
        if (status != null ? !status.equals(content.status) : content.status != null) return false;
        if (editorType != null ? !editorType.equals(content.editorType) : content.editorType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contentId != null ? contentId.hashCode() : 0;
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (pubDate != null ? pubDate.hashCode() : 0);
        result = 31 * result + (lastModifyDate != null ? lastModifyDate.hashCode() : 0);
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (editorType != null ? editorType.hashCode() : 0);
        return result;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
