package com.firststeps.webapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Controller indica que estamos ante un controlador. Spring boot lo detectará automáticamente con su component
 * scanning y creará una instancia
 */
@Controller
public class HomeController {
    /**
     * @GetMapping es un componente para llamar por metodo Get
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
