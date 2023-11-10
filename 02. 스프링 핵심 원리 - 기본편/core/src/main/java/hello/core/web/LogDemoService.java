package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger; // myLogger를 찾을 수 있는 ObjectProvider 주입

    public void logic(String id) {
        myLogger.log("service id = " + id);
    }
}
