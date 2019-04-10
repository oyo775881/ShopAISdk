package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class AreaListBean implements Serializable {

    @SerializedName("area_id")
    private String areaId;
    @SerializedName("area_name")
    private String areaName;
    private boolean select;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

}
