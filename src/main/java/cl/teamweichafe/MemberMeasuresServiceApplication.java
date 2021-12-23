package cl.teamweichafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
@EnableEurekaClient
public class MemberMeasuresServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberMeasuresServiceApplication.class, args);
	}

}
