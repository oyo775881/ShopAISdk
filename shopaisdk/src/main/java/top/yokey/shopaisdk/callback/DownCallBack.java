package top.yokey.shopaisdk.callback;

import java.io.File;

@SuppressWarnings("ALL")
public interface DownCallBack {

    void onStart();

    void onProgress(float progress);

    void onSuccess(File file);

    void onFailure(String reason);

}
