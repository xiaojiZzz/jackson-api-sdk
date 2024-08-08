package com.jackson.apiclientsdk.model.response;

import lombok.Data;

import java.io.Serializable;

/**
 * 微博热搜
 *
 * @author jackson
 */
@Data
public class WeiboHotSearch implements Serializable {

    private Integer hotNum;

    private Integer index;

    private String hotType;

    private String title;

    private String url;

}
