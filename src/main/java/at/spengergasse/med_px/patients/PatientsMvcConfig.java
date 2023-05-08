/**
 * Created: 2022-12-10
 * Author: Rudolf Radlbauer
 */

package at.spengergasse.med_px.patients;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * define routes for patient administration
 */
@Configuration
public class PatientsMvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/doctor/patients").setViewName("/patients/patients");
    }

}
