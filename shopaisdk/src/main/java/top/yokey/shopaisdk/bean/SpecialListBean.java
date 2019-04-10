package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class SpecialListBean implements Serializable {

    @SerializedName("special_id")
    private String specialId = "";
    @SerializedName("special_desc")
    private String specialDesc = "";

    public String getSpecialId() {
        return specialId;
    }

    public void setSpecialId(String specialId) {
        this.specialId = specialId;
    }

    public String getSpecialDesc() {
        return specialDesc;
    }

    public void setSpecialDesc(String specialDesc) {
        this.specialDesc = specialDesc;
    }

}
