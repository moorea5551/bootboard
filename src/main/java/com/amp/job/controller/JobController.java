package com.amp.job.controller;

import com.amp.job.entity.Job;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @RequestMapping("/job")
    public Job index() {
        return new Job("test job", "testing spring boot", "andrew moore", "samuel jackson");
    }
}
