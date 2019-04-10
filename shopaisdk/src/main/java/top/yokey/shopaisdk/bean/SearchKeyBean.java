package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("ALL")
public class SearchKeyBean implements Serializable {

    @SerializedName("list")
    private ArrayList<String> list = new ArrayList<>();
    @SerializedName("his_list")
    private ArrayList<String> hisList = new ArrayList<>();

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public ArrayList<String> getHisList() {
        return hisList;
    }

    public void setHisList(ArrayList<String> hisList) {
        this.hisList = hisList;
    }

}
