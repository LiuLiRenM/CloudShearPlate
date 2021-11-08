package com.liuliren.cloudshearplate.modules.admin.sync.service.impl;

import com.liuliren.cloudshearplate.modules.admin.sync.entity.Content;
import com.liuliren.cloudshearplate.modules.admin.sync.entity.ShearPlateRecord;
import com.liuliren.cloudshearplate.modules.admin.sync.service.IContentService;
import com.liuliren.cloudshearplate.modules.admin.sync.service.IShearPlateRecordService;
import com.liuliren.cloudshearplate.modules.admin.sync.service.ISyncService;
import com.liuliren.cloudshearplate.modules.auth.utils.Func;
import lombok.RequiredArgsConstructor;
import org.springblade.core.log.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 同步模块 服务实现类
 *
 * @author LiuYaoWen
 * @date 2021/11/1 下午8:31
 */
@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class SyncServiceImpl implements ISyncService {

    /**
     * 剪切板内容表 服务类
     */
    private final IContentService contentService;

    /**
     * 剪切板记录表 服务类
     */
    private final IShearPlateRecordService shearPlateRecordService;

    /**
     * 将用户剪切板上的内容同步到数据库中
     *
     * @param contentStr 剪切板内容
     * @return java.lang.Boolean true：同步成功，false：同步失败
     * @author LiuYaoWen
     * @date 2021/11/1 下午8:42
     */
    @Override
    public Boolean sync(String contentStr) {
        if (Func.isNull(contentStr)) {
            throw new ServiceException("剪切板内容不能为空");
        }
        //TODO 获取用户id
        Content content = new Content();
        content.setContent(contentStr);
        boolean isSuccess = contentService.save(content);
        if (!isSuccess) {
            throw new ServiceException("剪切板内容保存失败");
        }
        ShearPlateRecord record = new ShearPlateRecord();
        record.setUserId(1123598821738675201L);
        record.setContentId(content.getId());
        return shearPlateRecordService.save(record);
    }
}
