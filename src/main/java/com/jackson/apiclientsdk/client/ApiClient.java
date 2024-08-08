package com.jackson.apiclientsdk.client;


import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;

import java.util.HashMap;
import java.util.Map;

import static com.jackson.apiclientsdk.utils.SignUtils.genSign;

/**
 * 调用第三方接口的客户端
 *
 * @author jackson
 */
public class ApiClient {

    private static final String GATEWAY_HOST = "http://localhost:8103";

    private final String accessKey;

    private final String secretKey;

    public ApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    /**
     * 创建一个私有方法，用于构造请求头
     *
     * @return
     */
    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey", accessKey);
        // 注意：不能直接发送密钥
        // 生成随机数，长度为 4
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        // 请求体内容
        hashMap.put("body", body);
        // 当前时间戳
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        // 生成签名
        hashMap.put("sign", genSign(body, secretKey));
        return hashMap;
    }

    /**
     * 使用 GET 方法向服务器发送请求，随机获取毒鸡汤
     *
     * @param param
     * @return
     */
    public String getPoisonousChickenSoup(String param) {
        // 使用 HttpRequest 工具发起 GET 请求，并获取服务器的响应
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST + "/jacksonapi/poisonousChickenSoup")
                .addHeaders(getHeaderMap(param))
                .body(param)
                .execute();
        // 打印服务器返回的状态码
        System.out.println(httpResponse.getStatus());
        // 获取服务器返回的结果
        String result = httpResponse.body();
        // 打印服务器返回的结果
        System.out.println(result);
        // 返回服务器返回的结果
        return result;
    }

    /**
     * 使用 GET 方法向服务器发送请求，获取实时微博热搜
     *
     * @param param
     * @return
     */
    public String getWeiboHotSearch(String param) {
        // 使用 HttpRequest 工具发起 GET 请求，并获取服务器的响应
        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST + "/jacksonapi/weiboHotSearch")
                .addHeaders(getHeaderMap(param))
                .body(param)
                .execute();
        // 打印服务器返回的状态码
        System.out.println(httpResponse.getStatus());
        // 获取服务器返回的结果
        String result = httpResponse.body();
        // 打印服务器返回的结果
        System.out.println(result);
        // 返回服务器返回的结果
        return result;
    }

    /**
     * 使用 POST 方法向服务器发送请求，获取随机壁纸
     *
     * @param param
     * @return
     */
    public String getRandomWallpaper(String param) {
        // 使用 HttpRequest 工具发起 POST 请求，并获取服务器的响应
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/jacksonapi/randomWallpaper")
                .addHeaders(getHeaderMap(param))
                .body(param)
                .execute();
        // 打印服务器返回的状态码
        System.out.println(httpResponse.getStatus());
        // 获取服务器返回的结果
        String result = httpResponse.body();
        // 打印服务器返回的结果
        System.out.println(result);
        // 返回服务器返回的结果
        return result;
    }
}
