package com.entity.base;

import com.entity.Content;

import java.io.Serializable;

/**
 * 内容拓展实体抽象类
 * Created by LK on 2017/5/7.
 */
public abstract class BaseContentExt implements Serializable {
    private int contentId;
    private String title;
    private String text;
    private Content content;

    public BaseContentExt() {
        super();
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
