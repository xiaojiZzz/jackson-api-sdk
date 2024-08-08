package com.jackson.apiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * 签名工具
 *
 * @author jackson
 */
public class SignUtils {

    /**
     * 生成签名
     *
     * @param body      请求体内存
     * @param secretKey 密钥
     * @return 生成的签名字符串
     */
    public static String genSign(String body, String secretKey) {
        // 使用 SHA256 算法的 Digester
        Digester digester = new Digester(DigestAlgorithm.SHA256);
        // 构建签名内容，将哈希映射转换为字符串并拼接密钥
        String content = body + "." + secretKey;
        // 计算签名的摘要并返回摘要的十六进制表示形式
        return digester.digestHex(content);
    }
}
