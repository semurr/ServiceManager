package com.semurr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.semurr")
@ImportResource("classpath:/ws-config.xml")
public class WsConfig {

}
