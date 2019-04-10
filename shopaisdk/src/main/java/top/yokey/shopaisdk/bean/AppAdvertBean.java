package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class AppAdvertBean implements Serializable {

    @SerializedName("app_cate_advert_link")
    private String appCateAdvertLink = "";
    @SerializedName("app_cate_advert_url")
    private String appCateAdvertUrl = "";
    @SerializedName("app_mine_advert_link")
    private String appMineAdvertLink = "";
    @SerializedName("app_mine_advert_url")
    private String appMineAdvertUrl = "";

    public String getAppCateAdvertLink() {
        return appCateAdvertLink;
    }

    public void setAppCateAdvertLink(String appCateAdvertLink) {
        this.appCateAdvertLink = appCateAdvertLink;
    }

    public String getAppCateAdvertUrl() {
        return appCateAdvertUrl;
    }

    public void setAppCateAdvertUrl(String appCateAdvertUrl) {
        this.appCateAdvertUrl = appCateAdvertUrl;
    }

    public String getAppMineAdvertLink() {
        return appMineAdvertLink;
    }

    public void setAppMineAdvertLink(String appMineAdvertLink) {
        this.appMineAdvertLink = appMineAdvertLink;
    }

    public String getAppMineAdvertUrl() {
        return appMineAdvertUrl;
    }

    public void setAppMineAdvertUrl(String appMineAdvertUrl) {
        this.appMineAdvertUrl = appMineAdvertUrl;
    }

}
