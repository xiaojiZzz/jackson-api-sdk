package com.jackson.apiclientsdk.model.response;

import lombok.Data;

import java.io.Serializable;

/**
 * 随机壁纸响应
 *
 * @author jackson
 */
@Data
public class RandomWallpaperResponse implements Serializable {

    /**
     * 图片的 url
     */
    private String imgurl;
}
