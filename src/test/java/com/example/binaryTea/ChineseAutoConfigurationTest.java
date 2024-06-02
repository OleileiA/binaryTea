package com.example.binaryTea;

import com.example.binaryTea.config.AutoConfiguration;
import com.example.binaryTea.speaker.Speaker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig(AutoConfiguration.class)
@TestPropertySource(properties = {
        "spring.speaker.enable=true",
        "spring.speaker.language=Chinese"
})
public class ChineseAutoConfigurationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testHasChineseSpeaker() {
        Speaker speaker = applicationContext.getBean("speaker", Speaker.class);
        speaker.speak();
    }
}
