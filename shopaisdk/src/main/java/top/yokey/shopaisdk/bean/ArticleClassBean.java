package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class ArticleClassBean implements Serializable {

    @SerializedName("ac_id")
    private String acId = "";
    @SerializedName("ac_code")
    private String acCode = "";
    @SerializedName("ac_name")
    private String acName = "";
    @SerializedName("ac_parent_id")
    private String acParentId = "";
    @SerializedName("ac_sort")
    private String acSort = "";

    public String getAcId() {
        return acId;
    }

    public void setAcId(String acId) {
        this.acId = acId;
    }

    public String getAcCode() {
        return acCode;
    }

    public void setAcCode(String acCode) {
        this.acCode = acCode;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public String getAcParentId() {
        return acParentId;
    }

    public void setAcParentId(String acParentId) {
        this.acParentId = acParentId;
    }

    public String getAcSort() {
        return acSort;
    }

    public void setAcSort(String acSort) {
        this.acSort = acSort;
    }

}
