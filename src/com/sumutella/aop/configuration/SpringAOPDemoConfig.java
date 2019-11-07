package com.sumutella.aop.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author sumutella
 * @time 9:47 AM
 * @since 11/4/2019, Mon
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.sumutella.aop")
public class SpringAOPDemoConfig {

}
