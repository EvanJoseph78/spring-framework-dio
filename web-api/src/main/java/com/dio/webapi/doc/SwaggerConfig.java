// package com.dio.webapi.doc;
//
// import java.util.Arrays;
// import java.util.HashSet;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.Contact;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
// @Configuration
// @EnableSwagger2
// public class SwaggerConfig {
// private Contact contato() {
// return new Contact("Seu nome", "http://localhost:8080",
// "evan@gmail.com");
// }
//
// private ApiInfoBuilder infomacoesApi() {
// ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
// apiInfoBuilder.title("Title - Rest API");
// apiInfoBuilder.description("API de exemplo de uso de SpringBoot REST
// API"); apiInfoBuilder.version("1.0");
// apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
// apiInfoBuilder.license("Licença - 7EVEN");
// apiInfoBuilder.licenseUrl("http://www.7even.com.br");
// apiInfoBuilder.contact(this.contato());
//
// return apiInfoBuilder;
// }
//
// @Bean
// public Docket detalheApi() {
// Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
// docket.select()
// .apis(RequestHandlerSelectors.basePackage("dio.webapi.controller"))
// .paths(PathSelectors.any())
// .build()
// .apiInfo(this.infomacoesApi().build())
// .consumes(new HashSet<String>(Arrays.asList("application/json")))
// .produces(new HashSet<String>(Arrays.asList("application/json")));
//
// return docket;
// }
// }
