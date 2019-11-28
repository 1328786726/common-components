package com.github.aly8246.global.configuration.testConfig;

import com.github.aly8246.global.configuration.config.ProjectConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author ：南有乔木
 * @Email ：1558146696@qq.com
 * @date ：Created in 2019/11/28 下午 12:15
 * @description：
 * @version: ：V
 */
@RestController
@RequestMapping("test")
public class TestController {
@Resource
ProjectConfiguration projectConfiguration;

@GetMapping
public Object getConfig() {
	return this.projectConfiguration;
}
}
