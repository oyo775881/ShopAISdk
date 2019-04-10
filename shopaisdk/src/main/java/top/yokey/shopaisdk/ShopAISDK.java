package top.yokey.shopaisdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.FileCallback;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

import org.json.JSONObject;

import java.io.File;

import top.yokey.shopaisdk.bean.BaseBean;
import top.yokey.shopaisdk.callback.BaseCallBack;
import top.yokey.shopaisdk.callback.DownCallBack;

@SuppressWarnings("ALL")
public class ShopAISDK {

    private String op;
    private String act;
    private String url;
    private String param;
    private String apiUrl;
    private HttpParams httpParams;
    private HttpParams commonParams;
    private static volatile ShopAISDK instance;

    public static ShopAISDK get() {
        if (instance == null) {
            synchronized (ShopAISDK.class) {
                if (instance == null) {
                    instance = new ShopAISDK();
                }
            }
        }
        return instance;
    }

    public void init(Application application, String url, String act, String op, String key) {
        this.url = url;
        this.act = act;
        this.op = op;
        this.url = url;
        commonParams = new HttpParams();
        commonParams.put("key", key);
        OkGo.getInstance().init(application).addCommonParams(commonParams);
    }

    public ShopAISDK ready(String act, String op) {
        param = url + "?" + this.act + "=" + act + "&" + this.op + "=" + op;
        apiUrl = param;
        httpParams = new HttpParams();
        return this;
    }

    public ShopAISDK add(String key, String value) {
        param = param + "&" + key + "=" + value;
        httpParams.put(key, value);
        return this;
    }

    public ShopAISDK add(String key, File value) {
        param = param + "&" + key + "=FILE";
        httpParams.put(key, value);
        return this;
    }

    public void get(BaseCallBack baseCallBack) {

        Log.i("yokey_tag", "HttpGetParams:" + param);

        OkGo.<String>get(apiUrl).tag(this).params(httpParams).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                try {
                    String result = response.body();
                    Log.i("yokey_tag", "HttpGetResult:" + result);
                    BaseBean baseBean = new BaseBean();
                    JSONObject jsonObject = new JSONObject(result);
                    if (jsonObject.has("code"))
                        baseBean.setCode(jsonObject.getInt("code"));
                    if (jsonObject.has("datas"))
                        baseBean.setDatas(jsonObject.getString("datas"));
                    if (jsonObject.has("hasmore"))
                        baseBean.setHasmore(jsonObject.getBoolean("hasmore"));
                    if (jsonObject.has("page_total"))
                        baseBean.setPageTotal(jsonObject.getInt("page_total"));
                    if (TextUtils.isEmpty(baseBean.getDatas())) {
                        if (baseCallBack != null) {
                            baseCallBack.onFailure("empty");
                        }
                        return;
                    }
                    jsonObject = new JSONObject(baseBean.getDatas());
                    if (jsonObject.has("error")) {
                        if (baseCallBack != null) {
                            baseCallBack.onFailure(jsonObject.getString("error"));
                        }
                        return;
                    }
                    if (baseCallBack != null) {
                        baseCallBack.onSuccess(result, baseBean);
                    }
                } catch (Exception e) {
                    if (baseCallBack != null) {
                        baseCallBack.onFailure(e.getMessage());
                    }
                }
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                if (baseCallBack != null) {
                    baseCallBack.onFailure(response.getException().getMessage());
                }
            }
        });

    }

    public void post(BaseCallBack baseCallBack) {

        Log.i("yokey_tag", "HttpPostParams:" + param);

        OkGo.<String>post(apiUrl).tag(this).params(httpParams).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                try {
                    String result = response.body();
                    Log.i("yokey_tag", "HttpPostResult:" + result);
                    BaseBean baseBean = new BaseBean();
                    JSONObject jsonObject = new JSONObject(result);
                    if (jsonObject.has("code"))
                        baseBean.setCode(jsonObject.getInt("code"));
                    if (jsonObject.has("datas"))
                        baseBean.setDatas(jsonObject.getString("datas"));
                    if (jsonObject.has("hasmore"))
                        baseBean.setHasmore(jsonObject.getBoolean("hasmore"));
                    if (jsonObject.has("page_total"))
                        baseBean.setPageTotal(jsonObject.getInt("page_total"));
                    if (TextUtils.isEmpty(baseBean.getDatas())) {
                        if (baseCallBack != null) {
                            baseCallBack.onFailure("empty");
                        }
                        return;
                    }
                    jsonObject = new JSONObject(baseBean.getDatas());
                    if (jsonObject.has("error")) {
                        if (baseCallBack != null) {
                            baseCallBack.onFailure(jsonObject.getString("error"));
                        }
                        return;
                    }
                    if (baseCallBack != null) {
                        baseCallBack.onSuccess(result, baseBean);
                    }
                } catch (Exception e) {
                    if (baseCallBack != null) {
                        baseCallBack.onFailure(e.getMessage());
                    }
                }
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                if (baseCallBack != null) {
                    baseCallBack.onFailure(response.getException().getMessage());
                }
            }
        });

    }

    public void down(String url, DownCallBack downCallBack) {

        Log.i("yokey_tag", "HttpDownParams:" + url);

        OkGo.<File>get(url).tag(this).execute(new FileCallback() {
            @Override
            public void onStart(Request<File, ? extends Request> request) {
                super.onStart(request);
                if (downCallBack != null) {
                    downCallBack.onStart();
                }
            }

            @Override
            public void downloadProgress(Progress progress) {
                super.downloadProgress(progress);
                if (downCallBack != null) {
                    downCallBack.onProgress(progress.fraction);
                }
            }

            @Override
            public void onSuccess(Response<File> response) {
                if (downCallBack != null) {
                    downCallBack.onSuccess(response.body());
                }
            }

            @Override
            public void onError(Response<File> response) {
                super.onError(response);
                if (downCallBack != null) {
                    downCallBack.onFailure(response.message());
                }
            }
        });

    }

    public void updateKey(String key) {
        commonParams.put("key", key);
        OkGo.getInstance().addCommonParams(commonParams);
    }

}
