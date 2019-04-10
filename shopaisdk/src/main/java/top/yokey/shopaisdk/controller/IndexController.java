package top.yokey.shopaisdk.controller;

import java.util.ArrayList;

import top.yokey.shopaisdk.JsonUtil;
import top.yokey.shopaisdk.bean.AndroidConfigBean;
import top.yokey.shopaisdk.bean.ApkVersionBean;
import top.yokey.shopaisdk.bean.AppAdvertBean;
import top.yokey.shopaisdk.bean.ArticleListBean;
import top.yokey.shopaisdk.bean.BaseBean;
import top.yokey.shopaisdk.bean.SearchKeyBean;
import top.yokey.shopaisdk.bean.SearchShowBean;
import top.yokey.shopaisdk.bean.SpecialBean;
import top.yokey.shopaisdk.bean.SpecialListBean;
import top.yokey.shopaisdk.callback.BaseCallBack;
import top.yokey.shopaisdk.callback.HttpCallBack;
import top.yokey.shopaisdk.ShopAISDK;

@SuppressWarnings("ALL")
public class IndexController {

    private static final String ACT = "index";

    public static void index(HttpCallBack<SpecialBean> httpCallBack) {

        ShopAISDK.get().ready(ACT, "index").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                String data = JsonUtil.getString(baseBean.getDatas(), "index");
                data = JsonUtil.getArrayString(data, 0);
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2Object(data, SpecialBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

    public static void apkVersion(HttpCallBack<ApkVersionBean> httpCallBack) {

        ShopAISDK.get().ready(ACT, "get_android").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2Object(baseBean.getDatas(), ApkVersionBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

    public static void getAndroid(HttpCallBack<AndroidConfigBean> httpCallBack) {

        ShopAISDK.get().ready(ACT, "get_android").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                String data = JsonUtil.getString(baseBean.getDatas(), "android_config");
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2Object(data, AndroidConfigBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

    public static void searchKeyList(HttpCallBack<SearchKeyBean> httpCallBack) {

        ShopAISDK.get().ready(ACT, "search_key_list").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2Object(baseBean.getDatas(), SearchKeyBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

    public static void searchShow(HttpCallBack<SearchShowBean> httpCallBack) {

        ShopAISDK.get().ready(ACT, "search_show").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2Object(baseBean.getDatas(), SearchShowBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

    public static void getGG(String acId, HttpCallBack<ArrayList<ArticleListBean>> httpCallBack) {

        ShopAISDK.get().ready(ACT, "getgg").add("ac_id", acId).get(new BaseCallBack() {
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

    public static void getSpecialList(HttpCallBack<ArrayList<SpecialListBean>> httpCallBack) {

        ShopAISDK.get().ready(ACT, "get_special_list").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                String data = JsonUtil.getString(baseBean.getDatas(), "special_list");
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2ArrayList(data, SpecialListBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

    public static void getAppAdvert(HttpCallBack<AppAdvertBean> httpCallBack) {

        ShopAISDK.get().ready(ACT, "get_app_advert").get(new BaseCallBack() {
            @Override
            public void onSuccess(String result, BaseBean baseBean) {
                String data = JsonUtil.getString(baseBean.getDatas(), "app_advert");
                httpCallBack.onSuccess(result, baseBean, JsonUtil.json2Object(data, AppAdvertBean.class));
            }

            @Override
            public void onFailure(String reason) {
                httpCallBack.onFailure(reason);
            }
        });

    }

}
