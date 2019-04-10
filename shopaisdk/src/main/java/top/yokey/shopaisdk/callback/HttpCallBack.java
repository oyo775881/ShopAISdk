package top.yokey.shopaisdk.callback;

import top.yokey.shopaisdk.bean.BaseBean;

@SuppressWarnings("ALL")
public interface HttpCallBack<ResultType> {

    void onSuccess(String result, BaseBean baseBean, ResultType resultType);

    void onFailure(String reason);

}
