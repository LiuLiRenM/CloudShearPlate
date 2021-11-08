package com.liuliren.cloudshearplate.modules.admin.sync.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liuliren.cloudshearplate.modules.admin.sync.entity.ShearPlateRecord;
import com.liuliren.cloudshearplate.modules.admin.sync.form.ShearPlateRecordSearchForm;
import com.liuliren.cloudshearplate.modules.admin.sync.response.ShearPlateRecordResponse;
import org.springblade.core.mp.base.BaseService;

/**
 * 剪切板记录表 服务类
 *
 * @author LiuYaoWen
 * @date 2021/11/1 下午9:18
 */
public interface IShearPlateRecordService extends BaseService<ShearPlateRecord> {

    /**
     * 剪切板记录查询
     *
     * @param form 查询表单
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.liuliren.cloudshearplate.modules.admin.sync.response.ShearPlateRecordResponse>
     * @author LiuYaoWen
     * @date 2021/11/8 下午8:40
     */
    IPage<ShearPlateRecordResponse> list(ShearPlateRecordSearchForm form);
}
