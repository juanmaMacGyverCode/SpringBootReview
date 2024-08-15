package com.firststeps.webapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Controller indica que estamos ante un controlador. Spring boot lo detectará automáticamente con su component
 * scanning y creará una instancia
 */
@Controller
public class HomeController {
    record Video(String name) {}

    List<Video> videos = List.of(
            new Video("Need Help with your Spring Boot"),
            new Video("Dont do this to your own CODE!"),
            new Video("SECRETS to fix BROKEN CODE!")
    );
    /**
     * @GetMapping es un componente para llamar por metodo Get
     * @return
     */
    @GetMapping("/")
    public String index(Model model) {
        /**
         * Pasamos variable hacía el template para que pueda ser leida
         * Nota: En caso de objetos o tipos más complejos, serianlizar JSON.
         */
        model.addAttribute("videos", videos);
        return "index";
    }
}
