package com.jackson.apiclientsdk.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取随机壁纸请求
 *
 * @author jackson
 */
@Data
public class RandomWallpaperRequest implements Serializable {

    private String lx;
    private String method;
    private static final long serialVersionUID = 3815188540434269370L;
}
