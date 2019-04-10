package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class ArticleBean implements Serializable {

    @SerializedName("article_id")
    private String articleId = "";
    @SerializedName("ac_id")
    private String acId = "";
    @SerializedName("article_url")
    private String articleUrl = "";
    @SerializedName("article_show")
    private String articleShow = "";
    @SerializedName("article_position")
    private String articlePosition = "";
    @SerializedName("article_sort")
    private String articleSort = "";
    @SerializedName("article_title")
    private String articleTitle = "";
    @SerializedName("article_content")
    private String articleContent = "";
    @SerializedName("article_time")
    private String articleTime = "";
    @SerializedName("ac_name")
    private String acName = "";

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getAcId() {
        return acId;
    }

    public void setAcId(String acId) {
        this.acId = acId;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getArticleShow() {
        return articleShow;
    }

    public void setArticleShow(String articleShow) {
        this.articleShow = articleShow;
    }

    public String getArticlePosition() {
        return articlePosition;
    }

    public void setArticlePosition(String articlePosition) {
        this.articlePosition = articlePosition;
    }

    public String getArticleSort() {
        return articleSort;
    }

    public void setArticleSort(String articleSort) {
        this.articleSort = articleSort;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(String articleTime) {
        this.articleTime = articleTime;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

}
