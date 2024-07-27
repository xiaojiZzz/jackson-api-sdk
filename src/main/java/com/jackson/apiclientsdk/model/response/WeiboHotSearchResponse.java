package com.jackson.apiclientsdk.model.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 微博热搜查询响应
 */
@Data
public class WeiboHotSearchResponse implements Serializable {

    private List<WeiboHotSearch> weiboHotSearch;
}

