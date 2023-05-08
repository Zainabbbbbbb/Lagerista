package at.spengergasse.med_px.symptomlist;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfigurationSymptomlistController implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/admin/symptomlist").setViewName("symptoms/symptomlist");
        registry.addViewController("/admin/symptomlist/add").setViewName("symptoms/new_symptom");
    }

}
