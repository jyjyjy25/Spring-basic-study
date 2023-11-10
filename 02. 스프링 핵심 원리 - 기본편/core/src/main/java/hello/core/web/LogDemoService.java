package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final ObjectProvider<MyLogger> myLoggerProvider; // myLogger를 찾을 수 있는 ObjectProvider 주입

    public void logic(String id) {
        MyLogger myLogger = myLoggerProvider.getObject(); // ObjectProvider로 myLogger 조회(DL)
        myLogger.log("service id = " + id);
    }
}
