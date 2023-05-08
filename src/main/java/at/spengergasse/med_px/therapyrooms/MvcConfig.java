package at.spengergasse.med_px.therapyrooms;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/admin/therapyrooms").setViewName("therapyrooms/therapyrooms");
        registry.addViewController("/admin/materialien").setViewName("therapyrooms/materialien");
        registry.addViewController("/admin/information").setViewName("therapyrooms/information");
        registry.addViewController("/admin/mat1").setViewName("therapyrooms/mat1");
        registry.addViewController("/admin/mat2").setViewName("therapyrooms/mat2");
        registry.addViewController("/admin/mat3").setViewName("therapyrooms/mat3");
    }

}