package org.gassion.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.gassion.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
