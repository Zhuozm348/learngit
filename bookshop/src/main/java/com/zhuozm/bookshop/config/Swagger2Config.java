package com.zhuozm.bookshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestaApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhuozm.bookshop.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());

    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Mastiff Admin文档（swagger2）")
                .description("Mastiff Admin工程api文档，主要用于测试接口")
                .contact("wangsch@youshi-inc.com")
                .version("1.0").build();
    }
}
