package com.firststeps.webapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    private final VideoService videoService;

    public ApiController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/api/videos")
    public List<Video> all() {
        return videoService.getVideos();
    }

    /**
     * Only postman
     * @param newVideo
     * @return
     */
    @PostMapping(value = "/api/videos", consumes = "application/json")
    public Video newVideo(@RequestBody Video newVideo){
        return videoService.create(newVideo);
    }
}
