package me.wisdomj;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);

        // 빌더로 실행하기 (커스터 마이징 가능)
/*        new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);*/

        // 인스턴스로 만들기
        SpringApplication app = new SpringApplication(Application.class);

        //배너끄기
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
