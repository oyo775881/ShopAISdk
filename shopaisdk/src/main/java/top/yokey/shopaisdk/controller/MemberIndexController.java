package top.yokey.shopaisdk.controller;

import top.yokey.shopaisdk.JsonUtil;
import top.yokey.shopaisdk.ShopAISDK;
import top.yokey.shopaisdk.bean.BaseBean;
import top.yokey.shopaisdk.bean.MemberBean;
import top.yokey.shopaisdk.callback.BaseCallBack;
import top.yokey.shopaisdk.callback.HttpCallBack;

@SuppressWarnings("ALL")
public class MemberIndexController {

    private static final String ACT = "member_index";

    public static void index(HttpCallBack<MemberBean> httpCallBack) {

        ShopAISDK.get().ready(ACT, "index").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                String data = JsonUtil.getString(baseBean.getDatas(), "member_info");
                data = JsonUtil.getArrayString(data, 0);
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2Object(data, MemberBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

}
