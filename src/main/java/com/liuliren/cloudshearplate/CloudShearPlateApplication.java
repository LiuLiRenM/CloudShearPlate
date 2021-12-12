package com.liuliren.cloudshearplate;

import com.liuliren.cloudshearplate.common.constant.CommonConstant;
import org.mybatis.spring.annotation.MapperScan;
import org.springblade.core.launch.BladeApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LiuYaoWen
 * @date 2021/10/29 下午8:34
 */
@SpringBootApplication
@MapperScan("com.liuliren.cloudshearplate.**.mapper")
public class CloudShearPlateApplication {

    public static void main(String[] args) {
        // 解决 java.awt.HeadlessException
        System.setProperty("java.awt.headless","false");
        BladeApplication.run(CommonConstant.APPLICATION_NAME, CloudShearPlateApplication.class, args);
    }

}
