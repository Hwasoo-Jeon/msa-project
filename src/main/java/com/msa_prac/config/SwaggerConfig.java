package com.msa_prac.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi group1() {
    	String[] packagesToScan = {"com.example.project.admin"};
        
        return GroupedOpenApi.builder()
        		     .group("admin")
                             .packagesToScan(packagesToScan)
                             .build();
    }
    
    @Bean
    public GroupedOpenApi group2() {
    	String[] pathsToMatch = {"/customer/**"};
        String[] pathsToExclude = {"/customer/mypage/**", "/customer/login/**"};
        
        return GroupedOpenApi.builder()
        		     .group("customer")
                             .pathsToMatch(pathsToMatch)	// group에 포함시킬 paths
                             .pathsToExclude(pathsToExclude) // group에서 제외시킬 paths
                             .build();
    }
    
    @Bean
    public OpenAPI springOpenApi() {
    	return new OpenAPI().info(new Info()
        			        .title("forB's API")
                                        .description("Swagger API 설정 프로젝트")
                                        .version("v0.0.1"));
        								
    }
	
}