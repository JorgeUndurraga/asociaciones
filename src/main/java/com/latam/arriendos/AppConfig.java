package com.latam.arriendos;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("cl.desafiolatam.asociaciones")
@PropertySource("classpath:database.properties")
public class AppConfig {

}
