package top.yokey.example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import top.yokey.shopaisdk.ShopAISDK;
import top.yokey.shopaisdk.bean.BaseBean;
import top.yokey.shopaisdk.bean.SpecialBean;
import top.yokey.shopaisdk.callback.HttpCallBack;
import top.yokey.shopaisdk.controller.IndexController;

public class MainActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        ShopAISDK.get().init(getApplication(), "https://shopai.yokey.top/api/mobile/index.php?", "w", "t", "");
        IndexController.index(new HttpCallBack<SpecialBean>() {
            @Override
            public void onSuccess(String result, BaseBean baseBean, SpecialBean specialBean) {
                Log.i("ShopSDK", specialBean.getShowList().getItem().get(0).getImage());
            }

            @Override
            public void onFailure(String reason) {
                Log.i("ShopSDK", reason);
            }
        });
    }

}
