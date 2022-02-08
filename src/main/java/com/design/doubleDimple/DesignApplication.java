package com.design.doubleDimple;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName com.design.doubleDimple.DesignApplication
 * @Description create by renyuanxin at 2022/1/18 5:52 下午
 */
@SpringBootApplication
public class DesignApplication {


    public static void main(String[] args) {
        SpringApplication.run(DesignApplication.class,args);
        System.out.println("启动成功!!!!!");
        System.out.println("启动成功：Sa-Token配置如下：" + SaManager.getConfig());
    }

}
