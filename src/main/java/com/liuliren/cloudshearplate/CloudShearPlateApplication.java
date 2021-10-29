package com.liuliren.cloudshearplate;

import com.liuliren.cloudshearplate.common.constant.CommonConstant;
import org.springblade.core.launch.BladeApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LiuYaoWen
 * @date 2021/10/29 下午8:34
 */
@SpringBootApplication
public class CloudShearPlateApplication {

    public static void main(String[] args) {
        BladeApplication.run(CommonConstant.APPLICATION_NAME, CloudShearPlateApplication.class, args);
    }

}
