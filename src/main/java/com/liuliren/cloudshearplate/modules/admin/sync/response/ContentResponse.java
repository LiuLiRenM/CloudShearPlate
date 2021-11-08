package com.liuliren.cloudshearplate.modules.admin.sync.response;

import lombok.Data;

import java.util.Date;

/**
 * 剪切板内容表 response
 *
 * @author LiuYaoWen
 * @date 2021/11/8 下午8:15
 */
@Data
public class ContentResponse {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 内容
     */
    private String content;
}
