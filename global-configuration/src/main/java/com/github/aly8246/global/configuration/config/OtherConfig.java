package com.github.aly8246.global.configuration.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author ：南有乔木
 * @Email ：1558146696@qq.com
 * @date ：Created in 2019/11/28 下午 12:11
 * @description：
 * @version: ：V
 */
@Data
@Component
@ConfigurationProperties(prefix = "other-config")
public class OtherConfig {
private String msg;
}
