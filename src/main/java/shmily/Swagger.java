package shmily;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: ShmilyDS
 * @description:
 * @author: ShmilyLSC
 * @create: 2019-11-01 12:11
 **/
@Configuration//加载配置
@EnableSwagger2//启动swagger
public class Swagger {
/*
 * @Author shmily
 * @Description //TODO
 * @Date  2019/11/1
 * @Param 
 * @return 
 **/
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.shmily"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2构建RESTful APIs")
                .description("Shmily")
                .termsOfServiceUrl("https://blog.csdn.net/qq_44741038")
.version(".version(\"\")\n")
.build();
    }
}

