package com.groupeisi.githubactionscicd.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class DemoController {
    @GetMapping
    public String message(){
        return "Vous avez réussi votre test ";
    }
}
