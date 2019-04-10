package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class AndroidConfigBean implements Serializable {

    @SerializedName("android_advert_link")
    private String androidAdvertLink = "";
    @SerializedName("android_advert_url")
    private String androidAdvertUrl = "";
    @SerializedName("android_apk_url")
    private String androidApkUrl = "";
    @SerializedName("android_app_version")
    private String androidAppVersion = "";
    @SerializedName("android_update_content")
    private String androidUpdateContent = "";
    @SerializedName("android_version_control")
    private String androidVersionControl = "";

    public String getAndroidAdvertLink() {
        return androidAdvertLink;
    }

    public void setAndroidAdvertLink(String androidAdvertLink) {
        this.androidAdvertLink = androidAdvertLink;
    }

    public String getAndroidAdvertUrl() {
        return androidAdvertUrl;
    }

    public void setAndroidAdvertUrl(String androidAdvertUrl) {
        this.androidAdvertUrl = androidAdvertUrl;
    }

    public String getAndroidApkUrl() {
        return androidApkUrl;
    }

    public void setAndroidApkUrl(String androidApkUrl) {
        this.androidApkUrl = androidApkUrl;
    }

    public String getAndroidAppVersion() {
        return androidAppVersion;
    }

    public void setAndroidAppVersion(String androidAppVersion) {
        this.androidAppVersion = androidAppVersion;
    }

    public String getAndroidUpdateContent() {
        return androidUpdateContent;
    }

    public void setAndroidUpdateContent(String androidUpdateContent) {
        this.androidUpdateContent = androidUpdateContent;
    }

    public String getAndroidVersionControl() {
        return androidVersionControl;
    }

    public void setAndroidVersionControl(String androidVersionControl) {
        this.androidVersionControl = androidVersionControl;
    }

}
