package com.entity.base;

import java.io.Serializable;

/**
 * Created by LK on 2017/5/7.
 */
public abstract class BaseTag implements Serializable {
    private int tagId;
    private String tagName;
    private String tagDescription;

    public BaseTag() {
        super();
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }
}
