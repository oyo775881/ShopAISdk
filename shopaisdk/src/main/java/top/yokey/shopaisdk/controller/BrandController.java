package top.yokey.shopaisdk.controller;

import java.util.ArrayList;

import top.yokey.shopaisdk.JsonUtil;
import top.yokey.shopaisdk.ShopAISDK;
import top.yokey.shopaisdk.bean.BaseBean;
import top.yokey.shopaisdk.bean.BrandListBean;
import top.yokey.shopaisdk.callback.BaseCallBack;
import top.yokey.shopaisdk.callback.HttpCallBack;

@SuppressWarnings("ALL")
public class BrandController {

    private static final String ACT = "brand";

    public static void recommendList(HttpCallBack<ArrayList<BrandListBean>> httpCallBack) {

        ShopAISDK.get().ready(ACT, "recommend_list").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                String data = JsonUtil.getString(baseBean.getDatas(), "brand_list");
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2ArrayList(data, BrandListBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

}
