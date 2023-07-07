package com.cyber.oss.core;

import com.cyber.oss.local.LocalFileProperties;
import com.cyber.oss.oss.OssProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 文件配置信息
 */
@Data
@ConfigurationProperties(prefix = "file")
public class FileProperties {

	/**
	 * 默认的存储桶名称
	 */
	private String bucketName = "local";

	/**
	 * 本地文件配置信息
	 */
	private LocalFileProperties local;

	/**
	 * oss 文件配置信息
	 */
	private OssProperties oss;

}
