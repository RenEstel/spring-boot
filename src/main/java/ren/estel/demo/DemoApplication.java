package ren.estel.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoApplication.class)
                .registerShutdownHook(true)
                .bannerMode(Banner.Mode.OFF)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
