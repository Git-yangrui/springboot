package com.yangrui;


import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
public class App extends WebMvcConfigurerAdapter {

    //fast json  配置
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

        FastJsonHttpMessageConverter fastJsonHttpMessageConverter=new FastJsonHttpMessageConverter();

        FastJsonConfig fastJsonConfig=new FastJsonConfig();

        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);

        converters.add(fastJsonHttpMessageConverter);

        super.configureMessageConverters(converters);

    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
