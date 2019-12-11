package cn.harmonycloud.demo.task;

/**
 * Created by Huan Wei on 16-10-27.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    @Value("${demo.name}")
    private String name;

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("info: The time is now {}, name is {}", dateFormat.format(new Date()), name);
    }

    //@Scheduled(fixedRate = 1000)
    public void writeWarn() {
        log.warn("warn: The time is now {}, name is {}", dateFormat.format(new Date()), name);
    }

   //@Scheduled(fixedRate = 1000)
    public void writeError() {
        log.error("error: The time is now {}, name is {}", dateFormat.format(new Date()), name);
    }

}
