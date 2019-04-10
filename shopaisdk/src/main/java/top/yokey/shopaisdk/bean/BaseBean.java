package top.yokey.shopaisdk.bean;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class BaseBean implements Serializable {

    private int code = 0;
    private String datas = "";
    private int pageTotal = 0;
    private boolean hasmore = false;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDatas() {
        return datas;
    }

    public void setDatas(String datas) {
        this.datas = datas;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public boolean isHasmore() {
        return hasmore;
    }

    public void setHasmore(boolean hasmore) {
        this.hasmore = hasmore;
    }

}
