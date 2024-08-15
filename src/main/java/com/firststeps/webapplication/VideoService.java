package com.firststeps.webapplication;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    private List<Video> videos = List.of(
            new Video("Need Help with your Spring Boot"),
            new Video("Dont do this to your own CODE!"),
            new Video("SECRETS to fix BROKEN CODE!")
    );

    public List<Video> getVideos() {
        return videos;
    }
}
