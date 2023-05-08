package at.spengergasse.med_px.symptomlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/symptomlist")
@CrossOrigin
public class SymptomController {

@Autowired
private SymptomlistRepository repository;

@GetMapping("/")
public List<Symptomlist> allSymptoms(){
return repository.findAll();
}

@PostMapping("/add")
    public Symptomlist save(@RequestBody Symptomlist s){
    repository.save(s);
    return s;
}

}
