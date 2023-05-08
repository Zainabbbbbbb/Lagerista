package at.spengergasse.med_px.protokolApplied;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vaccines")
public class pAController {
    @Autowired
    IprotokollApplied repository;

    @GetMapping("/all")
    public Iterable<protokollApplied> allVaccines(){
        return repository.findAll();
    }

    @PostMapping("/save")
    public protokollApplied Save(@RequestBody protokollApplied d){
        repository.save(d);
        return d;
    }

}
