package com.liuliren.cloudshearplate.modules.admin.sync.service;

/**
 * 同步模块 服务类
 *
 * @author LiuYaoWen
 * @date 2021/11/1 下午8:30
 */
public interface ISyncService {

    /**
     * 将用户剪切板上的内容同步到数据库中
     *
     * @param content 剪切板内容
     * @return java.lang.Boolean true：同步成功，false：同步失败
     * @author LiuYaoWen
     * @date 2021/11/1 下午8:42
     */
    Boolean sync(String content);
}
