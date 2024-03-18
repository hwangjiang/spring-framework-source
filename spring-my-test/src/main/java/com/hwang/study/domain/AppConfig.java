package com.hwang.study.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName AppConfig
 * @Description //TODO
 * @Author huangjiang07
 * @Date 2024/3/16
 */
@Configuration
@ComponentScan("com.hwang")
@PropertySource("classpath:app.properties")
public class AppConfig {
}
