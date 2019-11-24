package com.hexy.libs;

import android.os.Bundle;

import com.hexy.hexylibs.base.BaseActivity;
import com.hexy.hexylibs.network.NetRequest;
import com.hjq.toast.ToastUtils;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.Request;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://www.baidu.com";
        HashMap<String, String> params = new HashMap<>();
        // 添加请求参数
//        params.put("key", "value");
        NetRequest.getFormRequest(url, params, new NetRequest.DataCallBack() {
            @Override
            public void requestSuccess(String result){
                // 请求成功的回调
                ToastUtils.show("成功："+result);
            }

            @Override
            public void requestFailure(Request request, IOException e) {
                // 请求失败的回调
                ToastUtils.show("失败："+e.getMessage());
            }
        });
    }
}
