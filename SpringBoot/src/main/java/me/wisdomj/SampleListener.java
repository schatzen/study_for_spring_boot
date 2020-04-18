package me.wisdomj;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//Bean으로 등록
@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {

    //public class SampleListener implements ApplicationListener<ApplicationStartingEvent>
    //ApplicationContext가 만들어지기 생성되는 이벤트 (ApplicationStartingEvent)같은 경우,
    //Bean으로 등록한다하더라도 동작하지 않는다. 따라서 수동실행 시켜준다.
/*
   @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
            System.out.println("=======================");
            System.out.println("Application is Starting");
            System.out.println("=======================");
    }*/

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("=======");
        System.out.println("Started");
        System.out.println("=======");
    }
}
