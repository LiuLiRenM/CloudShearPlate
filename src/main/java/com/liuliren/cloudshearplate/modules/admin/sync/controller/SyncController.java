package com.liuliren.cloudshearplate.modules.admin.sync.controller;

import com.liuliren.cloudshearplate.common.config.ApiConfig;
import com.liuliren.cloudshearplate.modules.admin.sync.service.ISyncService;
import lombok.AllArgsConstructor;
import org.springblade.core.boot.ctrl.BladeController;
import org.springblade.core.tool.api.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 同步模块 controller
 *
 * @author LiuYaoWen
 * @date 2021/11/1 下午7:30
 */
@RestController
@ResponseBody
@RequestMapping(ApiConfig.ADMIN_PREFIX)
@AllArgsConstructor()
public class SyncController extends BladeController {

    /**
     * 同步模块 服务类
     */
    private final ISyncService syncService;

    /**
     * 同步剪切板数据到数据库中
     *
     * @param content 剪切板数据
     * @return org.springblade.core.tool.api.R<java.lang.Boolean>
     * @author LiuYaoWen
     * @date 2021/11/1 下午9:31
     */
    @PostMapping("/sync")
    public R<Boolean> sync(String content) {
        return R.data(syncService.sync(content));
    }

}
