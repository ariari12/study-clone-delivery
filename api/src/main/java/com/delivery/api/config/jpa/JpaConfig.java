package com.delivery.api.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//다른 모듈이나 프로젝트는 api패키지 안에있는 객체가 아니므로 외부객체를 빈으로 등록해주기 위한 설정
@Configuration
@EntityScan(basePackages = "com.delivery.db")
@EnableJpaRepositories(basePackages = "com.delivery.db")
public class JpaConfig {

}
