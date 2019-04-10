package top.yokey.shopaisdk.controller;

import java.util.ArrayList;

import top.yokey.shopaisdk.JsonUtil;
import top.yokey.shopaisdk.ShopAISDK;
import top.yokey.shopaisdk.bean.AreaListBean;
import top.yokey.shopaisdk.bean.BaseBean;
import top.yokey.shopaisdk.callback.BaseCallBack;
import top.yokey.shopaisdk.callback.HttpCallBack;

@SuppressWarnings("ALL")
public class AreaController {

    private static final String ACT = "area";

    public static void areaList(HttpCallBack<ArrayList<AreaListBean>> httpCallBack) {

        ShopAISDK.get().ready(ACT, "area_list").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                String data = JsonUtil.getString(baseBean.getDatas(), "area_list");
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2ArrayList(data, AreaListBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

}
