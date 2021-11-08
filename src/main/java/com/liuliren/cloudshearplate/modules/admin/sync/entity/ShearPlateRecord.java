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
 * 剪切板记录表 实体类
 *
 * @author LiuYaoWen
 * @date 2021/11/1 下午7:38
 */
@Data
@TableName("lyw_shear_plate_record")
@EqualsAndHashCode(callSuper = true)
public class ShearPlateRecord extends BaseEntity {

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
     * 用户id
     */
    private Long userId;

    /**
     * 内容id
     */
    private Long contentId;

}
