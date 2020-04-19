package me.wisdomj;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//Bean으로 등록
@Component
public class SampleListener implements CommandLineRunner {

    //public class SampleListener implements ApplicationListener<ApplicationStartingEvent>
    //ApplicationContext가 만들어지기 생성되는 이벤트 (ApplicationStartingEvent)같은 경우,
    //Bean으로 등록한다하더라도 동작하지 않는다. 따라서 수동실행 시켜준다.
  /*
   @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
            System.out.println("=======================");
            System.out.println("Application is Starting");
            System.out.println("=======================");
    }

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("=======");
        System.out.println("Started");
        System.out.println("=======");
    }
    */

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(args).forEach(System.out::println);
    }
}
