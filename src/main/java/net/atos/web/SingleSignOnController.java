package net.atos.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SingleSignOnController {

    @GetMapping("/public")
    String permitAll() {
        return "Permit for All users!";
    }

    @GetMapping("/private")
    String secured() {
        return "Secured only for authenticated!";
    }

}
