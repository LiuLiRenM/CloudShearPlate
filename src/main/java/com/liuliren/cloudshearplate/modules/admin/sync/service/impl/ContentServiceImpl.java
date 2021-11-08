package com.liuliren.cloudshearplate.modules.admin.sync.service.impl;

import com.liuliren.cloudshearplate.modules.admin.sync.entity.Content;
import com.liuliren.cloudshearplate.modules.admin.sync.mapper.ContentMapper;
import com.liuliren.cloudshearplate.modules.admin.sync.service.IContentService;
import org.springblade.core.mp.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 剪切板内容表 服务实现类
 *
 * @author LiuYaoWen
 * @date 2021/11/1 下午9:19
 */
@Service
public class ContentServiceImpl extends BaseServiceImpl<ContentMapper, Content> implements IContentService {
}
