package at.spengergasse.med_px.protokolApplied.entities;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class VaccinesController implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/doctor/vaccines").setViewName("protokollApplied/vaccines");
        registry.addViewController("/doctor/vaccines/add").setViewName("protokollApplied/new_vaccines");
    }
}


