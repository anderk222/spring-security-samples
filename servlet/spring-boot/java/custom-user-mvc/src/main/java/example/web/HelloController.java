package example.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anderson Macias
 */

@Controller
public class HelloController {
    
    @GetMapping
    public String index(Model model){
        model.addAttribute("greating", "Welcome Messilover");
        
        return "index";
    }
    
    @GetMapping("/otra")
    public String otra(Model model){
        
       model.addAttribute("greating", "Esta con otro");
        
        return  "otra";
        
    }
    
}
