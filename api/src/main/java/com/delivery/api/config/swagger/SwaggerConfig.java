package com.delivery.api.config.swagger;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.core.jackson.ModelResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//이 설정을 안해주면 Swagger UI에서 CamelCase로 보여줌
@Configuration
public class SwaggerConfig {
    //스프링이 ObjectMapper라는 bean을 자동으로 찾아주다
    @Bean
    public ModelResolver modelResolver(ObjectMapper objectMapper){
        return new ModelResolver(objectMapper);
    }
}
