package com.liuliren.cloudshearplate.modules.admin.sync.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liuliren.cloudshearplate.modules.admin.sync.entity.ShearPlateRecord;
import com.liuliren.cloudshearplate.modules.admin.sync.form.ShearPlateRecordSearchForm;
import com.liuliren.cloudshearplate.modules.admin.sync.mapper.ShearPlateRecordMapper;
import com.liuliren.cloudshearplate.modules.admin.sync.response.ShearPlateRecordResponse;
import com.liuliren.cloudshearplate.modules.admin.sync.service.IShearPlateRecordService;
import org.springblade.core.mp.base.BaseServiceImpl;
import org.springblade.core.mp.support.Condition;
import org.springframework.stereotype.Service;

/**
 * 剪切板记录表 服务实现类
 *
 * @author LiuYaoWen
 * @date 2021/11/1 下午9:21
 */
@Service
public class ShearPlateRecordServiceImpl extends BaseServiceImpl<ShearPlateRecordMapper, ShearPlateRecord> implements IShearPlateRecordService {

    /**
     * 剪切板记录查询
     *
     * @param form 查询表单
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.liuliren.cloudshearplate.modules.admin.sync.response.ShearPlateRecordResponse>
     * @author LiuYaoWen
     * @date 2021/11/8 下午8:23
     */
    @Override
    public IPage<ShearPlateRecordResponse> list(ShearPlateRecordSearchForm form) {
        IPage<ShearPlateRecordResponse> page = Condition.getPage(form);
        page.setRecords(baseMapper.list(page, 1123598821738675201L, form));
        return page;
    }
}
