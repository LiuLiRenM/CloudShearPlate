package com.liuliren.cloudshearplate.modules.admin.sync.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liuliren.cloudshearplate.modules.admin.sync.entity.ShearPlateRecord;
import com.liuliren.cloudshearplate.modules.admin.sync.form.ShearPlateRecordSearchForm;
import com.liuliren.cloudshearplate.modules.admin.sync.response.ShearPlateRecordResponse;

import java.util.List;

/**
 * 剪切板记录表 Mapper接口
 *
 * @author LiuYaoWen
 * @date 2021/11/1 下午8:38
 */
public interface ShearPlateRecordMapper extends BaseMapper<ShearPlateRecord> {

    /**
     * 剪切板记录查询
     *
     * @param page   分页page
     * @param userId 用户id
     * @param form   查询表单
     * @return java.util.List<com.liuliren.cloudshearplate.modules.admin.sync.response.ShearPlateRecordResponse>
     * @author LiuYaoWen
     * @date 2021/11/8 下午8:25
     */
    List<ShearPlateRecordResponse> list(IPage<ShearPlateRecordResponse> page, Long userId, ShearPlateRecordSearchForm form);
}
