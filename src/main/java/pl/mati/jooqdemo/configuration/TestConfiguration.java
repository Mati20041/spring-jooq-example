package pl.mati.jooqdemo.configuration;

import org.jooq.conf.RenderNameStyle;
import org.jooq.conf.Settings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public Settings jooqSettings() {
        return new Settings()
                .withRenderNameStyle(RenderNameStyle.UPPER);
    }
}
