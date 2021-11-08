package com.liuliren.cloudshearplate.modules.admin.sync.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.core.mp.base.BaseEntity;

/**
 * 剪切板内容表 实体类
 *
 * @author LiuYaoWen
 * @date 2021/11/1 下午7:38
 */
@Data
@TableName("lyw_content")
@EqualsAndHashCode(callSuper = true)
public class Content extends BaseEntity {

    /**
     * 主键id
     */
    @JsonSerialize(
            using = ToStringSerializer.class
    )
    @TableId(
            value = "id",
            type = IdType.ASSIGN_ID
    )
    private Long id;

    /**
     * 内容
     */
    private String content;

}
