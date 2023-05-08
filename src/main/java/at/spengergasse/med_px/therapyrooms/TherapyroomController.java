package at.spengergasse.med_px.therapyrooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class TherapyroomController {

@Autowired
    private ITherapyRepo repository;



    @PostMapping("/posttherapy")
    public TherapyEntitie save(@RequestBody TherapyEntitie t){
        repository.save(t);
        return t;
    }

    @GetMapping("/gettherapy")
    public Collection<TherapyEntitie> allRooms(){return repository.findAll();}

}
