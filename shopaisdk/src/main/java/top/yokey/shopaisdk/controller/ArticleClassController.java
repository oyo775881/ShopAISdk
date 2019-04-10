package top.yokey.shopaisdk.controller;

import java.util.ArrayList;

import top.yokey.shopaisdk.JsonUtil;
import top.yokey.shopaisdk.ShopAISDK;
import top.yokey.shopaisdk.bean.ArticleClassBean;
import top.yokey.shopaisdk.bean.BaseBean;
import top.yokey.shopaisdk.callback.BaseCallBack;
import top.yokey.shopaisdk.callback.HttpCallBack;

@SuppressWarnings("ALL")
public class ArticleClassController {

    private static final String ACT = "article_class";

    public static void index(HttpCallBack<ArrayList<ArticleClassBean>> httpCallBack) {

        ShopAISDK.get().ready(ACT, "index").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                String data = JsonUtil.getString(baseBean.getDatas(), "article_class");
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2ArrayList(data, ArticleClassBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

}
