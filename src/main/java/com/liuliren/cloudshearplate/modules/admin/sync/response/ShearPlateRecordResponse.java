package com.liuliren.cloudshearplate.modules.admin.sync.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 剪切板记录表 response
 *
 * @author LiuYaoWen
 * @date 2021/11/8 下午8:10
 */
@Data
public class ShearPlateRecordResponse implements Serializable {

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
     * 剪切板内容
     */
    private ContentResponse content;
}
