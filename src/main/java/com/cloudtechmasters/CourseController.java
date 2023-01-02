package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
//create two endpoints getUpcomingSeriesInternational and getUpcomingSeriesDomestic
    @GetMapping("/upcoming-series/international")
    public List<String> getUpcomingSeriesInternational(){
        logger.info("added for failing sonar build");
        return Arrays.asList("Cricket International Schedule", "MON, JAN 02 2023", "New Zealand tour of Pakistan, 2022-23", "2 Tests , 3 ODIs . Dec 26 - Jan 13");
    }

    @GetMapping("/upcoming-series/domestic")
    public List<String> getUpcomingSeriesDomestic(){
        return Arrays.asList("Cricket Domestic Schedule", "TUE, JAN 03 2023", "Ranji Trophy 2022-23", "139 Tests . Dec 13 - Feb 20");
    }

}
