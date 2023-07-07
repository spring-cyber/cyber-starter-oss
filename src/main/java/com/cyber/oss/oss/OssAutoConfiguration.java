package com.cyber.oss.oss;

import com.cyber.oss.core.FileProperties;
import com.cyber.oss.core.FileTemplate;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * aws 自动配置类
 */
@AllArgsConstructor
public class OssAutoConfiguration {

	private final FileProperties properties;

	@Bean
	@Primary
	@ConditionalOnMissingBean(OssTemplate.class)
	@ConditionalOnProperty(name = "file.oss.enable", havingValue = "true")
	public FileTemplate ossTemplate() {
		return new OssTemplate(properties);
	}

}
