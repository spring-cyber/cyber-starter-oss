package com.cyber.oss;

import com.cyber.oss.oss.OssAutoConfiguration;
import com.cyber.oss.core.FileProperties;
import com.cyber.oss.local.LocalFileAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

/**
 * aws 自动配置类
 */
@Import({ LocalFileAutoConfiguration.class, OssAutoConfiguration.class })
@EnableConfigurationProperties({ FileProperties.class })
public class FileAutoConfiguration {

}
