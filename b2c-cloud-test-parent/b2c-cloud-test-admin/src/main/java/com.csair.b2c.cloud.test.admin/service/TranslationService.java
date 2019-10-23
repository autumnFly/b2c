package com.csair.b2c.cloud.test.admin.service;

import com.alibaba.fastjson.JSONObject;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * Created on 2019/4/24.
 *
 * @author yudong
 */
public interface TranslationService {
    OkHttpClient client = new OkHttpClient();

    default String translate(String text, Locale from, Locale to) throws Exception {
        RequestBody formBody = RequestBody
                .create(MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8"), "kw=" + text);
        Request request = new Request.Builder()
                .url("https://fanyi.baidu.com/sug")
                .post(formBody)
                .build();
        Response response = client.newCall(request).execute();
        String res = new String(response.body().bytes(), StandardCharsets.UTF_8);
        JSONObject jsonObject = JSONObject.parseObject(res);
        return jsonObject.getJSONArray("data").getJSONObject(0).get("v").toString();
    }
}
