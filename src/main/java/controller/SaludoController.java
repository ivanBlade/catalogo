package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/catalogo")
public class SaludoController {
    @GetMapping()
    public String list() {
        return "hola";
    }
}
