package string5_component_scan_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import string5_component_scan_study.spring.VersionPrinter;

@Configuration
@ComponentScan(basePackages = {"string5_component_scan_study.spring"})  //이렇게 경로 적어주면 이 패키지안에 있는거만 스캔한다
public class AppCtx {

	
	

	
	@Bean
	public VersionPrinter vertionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}

}
