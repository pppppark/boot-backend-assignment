package dev.park.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local") //어떤 Bean을 사용할건지 작성하는 어노테이션
public class ProfileComponent {
    private final Logger logger = LoggerFactory.getLogger(ProfileComponent.class);
    public  ProfileComponent(){
        logger.info("profile component profile : local");
    }
}
