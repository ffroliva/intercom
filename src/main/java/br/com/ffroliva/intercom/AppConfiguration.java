package br.com.ffroliva.intercom;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "br.com.*" })
public class AppConfiguration {}