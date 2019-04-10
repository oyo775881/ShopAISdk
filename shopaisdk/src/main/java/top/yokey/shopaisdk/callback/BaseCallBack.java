package top.yokey.shopaisdk.callback;

import top.yokey.shopaisdk.bean.BaseBean;

@SuppressWarnings("ALL")
public interface BaseCallBack {

    void onSuccess(String result, BaseBean baseBean);

    void onFailure(String reason);

}
