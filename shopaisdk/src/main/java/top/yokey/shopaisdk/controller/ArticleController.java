package top.yokey.shopaisdk.controller;

import java.util.ArrayList;

import top.yokey.shopaisdk.JsonUtil;
import top.yokey.shopaisdk.ShopAISDK;
import top.yokey.shopaisdk.bean.ArticleBean;
import top.yokey.shopaisdk.bean.ArticleListBean;
import top.yokey.shopaisdk.bean.BaseBean;
import top.yokey.shopaisdk.callback.BaseCallBack;
import top.yokey.shopaisdk.callback.HttpCallBack;

@SuppressWarnings("ALL")
public class ArticleController {

    private static final String ACT = "article";

    public static void articleList(String acId, String keyword, HttpCallBack<ArrayList<ArticleListBean>> httpCallBack) {

        ShopAISDK.get().ready(ACT, "article_list").add("ac_id", acId).add("keyword", keyword).get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                String data = JsonUtil.getString(baseBean.getDatas(), "article_list");
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2ArrayList(data, ArticleListBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

    public static void articleShow(String articleId, HttpCallBack<ArticleBean> httpCallBack) {

        ShopAISDK.get().ready(ACT, "article_show").add("article_id", articleId).get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2Object(baseBean.getDatas(), ArticleBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

}
