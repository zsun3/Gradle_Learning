package com.gradlehero.themepark;

import com.gradlehero.themepark.RideStatusService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThemeParkApplication {
    public static void main(String[] args) {
        System.out.println(RideStatusService.getRideStatus("rollercoaster"));
        SpringApplication.run(ThemeParkApplication.class);
    } }
