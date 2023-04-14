package com.canyan7n.configure;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :WebInit
 * @date ：2023/4/14 15:46
 * @description：TODO
 */

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    //设置配置类代替spring的配置文件
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfigure.class};
    }

    @Override
    //设置配置类代替spring mvc的配置文件
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfigure.class};
    }

    @Override
    //设置前端控制器
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
