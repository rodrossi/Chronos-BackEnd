package br.com.chronos.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.chronos")).paths(regex("/users.*")).build()
				.apiInfo(metaInfo());
	}

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Chronos API REST",
                "API REST para controle de horas trabalhadas",
                "1.0",
                "Terms of Service",
                new Contact("Cubo Connect", "http://cuboconnect.com.br/",
                        "contato@cuboconnect.com.br"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
}
