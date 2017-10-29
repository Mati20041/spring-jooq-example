package pl.mati.jooqdemo;

import org.jooq.Configuration;
import org.jooq.conf.RenderKeywordStyle;
import org.jooq.conf.Settings;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JooqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JooqDemoApplication.class, args);
	}
}
