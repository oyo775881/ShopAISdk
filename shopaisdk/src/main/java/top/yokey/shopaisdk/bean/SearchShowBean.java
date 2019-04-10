package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("ALL")
public class SearchShowBean implements Serializable {

    @SerializedName("area_list")
    private ArrayList<AreaListBean> areaList = new ArrayList<>();
    @SerializedName("contract_list")
    private ArrayList<ContractListBean> contractList = new ArrayList<>();

    public ArrayList<AreaListBean> getAreaList() {
        return areaList;
    }

    public void setAreaList(ArrayList<AreaListBean> areaList) {
        this.areaList = areaList;
    }

    public ArrayList<ContractListBean> getContractList() {
        return contractList;
    }

    public void setContractList(ArrayList<ContractListBean> contractList) {
        this.contractList = contractList;
    }

    public static class AreaListBean {

        @SerializedName("area_id")
        private String areaId = "";
        @SerializedName("area_name")
        private String areaName = "";

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
    }

    public static class ContractListBean {

        @SerializedName("id")
        private String id = "";
        @SerializedName("name")
        private String name = "";

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
