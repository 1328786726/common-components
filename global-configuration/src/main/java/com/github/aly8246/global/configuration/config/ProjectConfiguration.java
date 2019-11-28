package com.github.aly8246.global.configuration.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

/**
 * @Author ：南有乔木
 * @Email ：1558146696@qq.com
 * @date ：Created in 2019/11/28 下午 12:09
 * @description：
 * @version: ：V
 */
@Data
@Component
@ConfigurationProperties(prefix = "aly8246-config")
@EnableConfigurationProperties({ServerConfig.class})
public class ProjectConfiguration {
/**
 * 我也不知道想干啥
 */
private Integer id;

/**
 * 服务器配置信息
 */
@NestedConfigurationProperty
private ServerConfig serverConfig;

/**
 * 其他配置
 */
@NestedConfigurationProperty
private OtherConfig otherConfig;

}
