package com.canyan7n.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestUpAndDown
 * @date ：2023/4/11 10:44
 * @description：TODO
 */
@Controller
public class TestUpAndDown {

    @RequestMapping("/test/down")
    public ResponseEntity<byte[]> testDown(HttpSession session) throws IOException {
        //获取servletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取资源的真实路径
        String realPath = servletContext.getRealPath("img");
        realPath = realPath + File.separator + "1.jpg";
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组,available()输入流文件的字节数
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组
        is.read(bytes);
        //创建httpHeaders设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Content-Disposition","attachment;filename=1.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }
}
