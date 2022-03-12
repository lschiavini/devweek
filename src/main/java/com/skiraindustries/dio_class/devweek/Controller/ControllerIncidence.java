package com.skiraindustries.dio_class.devweek.Controller;

import com.skiraindustries.dio_class.devweek.Entity.AgeGroup;
import com.skiraindustries.dio_class.devweek.Entity.Incidence;
import com.skiraindustries.dio_class.devweek.Repository.IncidenceRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerIncidence {
    private final IncidenceRepo repository;

    public ControllerIncidence(IncidenceRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/incidence")
    public ResponseEntity<?> findAll() {
        try {
            List<Incidence> list = repository.findAll();
            if(list.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/incidence/{id}")
    public ResponseEntity<Incidence> findById(@PathVariable Long id) {
        try {
            Optional<Incidence> incidenceChosenOptional =  repository.findById(id);
            if(incidenceChosenOptional.isPresent()) {
                Incidence incidenceChosen = incidenceChosenOptional.get();
                return new ResponseEntity<Incidence>(incidenceChosen, HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/incidence/new")
    public Incidence putIncidence(Incidence newIncidence) {
        return repository.save(newIncidence);
    }

    @PostMapping("/incidence/new")
    public Incidence postIncidence(@RequestBody Incidence newIncidence) {
        return repository.save(newIncidence);
    }

    @DeleteMapping("/incidence/delete/{id}")
    public void deleteIncidence(@PathVariable Long id) {
        repository.deleteById(id);
    }


}


