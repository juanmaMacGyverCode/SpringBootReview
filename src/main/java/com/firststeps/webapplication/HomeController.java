package com.firststeps.webapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Controller indica que estamos ante un controlador. Spring boot lo detectará automáticamente con su component
 * scanning y creará una instancia
 */
@Controller
public class HomeController {
    private final VideoService videoService;

    public HomeController(VideoService videoService) {
        this.videoService = videoService;
    }

    /**
     * @GetMapping es un componente para llamar por metodo Get
     * @return
     */
    @GetMapping("/")
    public String index(Model model) {
        /**
         * Pasamos variable hacía el template para que pueda ser leida
         * Nota: En caso de objetos o tipos más complejos, serianlizar JSON.
         * Nota2: Lo normal es no desarrollar codigo en un controlador, sino en los servicios
         */
        model.addAttribute("videos", videoService.getVideos());
        return "index";
    }

    @PostMapping("/new-video")
    public String newVideo(@ModelAttribute Video newVideo) {
        videoService.create(newVideo);
        return "redirect:/";
    }
}
