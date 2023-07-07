package com.cyber.oss.local;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 本地文件配置信息
 */
@Data
@ConfigurationProperties(prefix = "local")
public class LocalFileProperties {

	/**
	 * 是否开启
	 */
	private boolean enable;

	/**
	 * 默认路径
	 */
	private String basePath;

}
