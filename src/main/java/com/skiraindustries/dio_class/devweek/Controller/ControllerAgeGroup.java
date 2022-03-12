package com.skiraindustries.dio_class.devweek.Controller;

import com.skiraindustries.dio_class.devweek.Entity.AgeGroup;
import com.skiraindustries.dio_class.devweek.Entity.Region;
import com.skiraindustries.dio_class.devweek.Repository.AgeGroupRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerAgeGroup {

    private AgeGroupRepo repository;

    public ControllerAgeGroup(AgeGroupRepo ageGroupRepository) {
        this.repository = ageGroupRepository;
    }

    @PostMapping("/agegroup/new")
    public AgeGroup postAgeGroup(@RequestBody AgeGroup newRegion) {
        return repository.save(newRegion);
    }

    @DeleteMapping("/agegroup/delete/{id}")
    public void deleteAgeGroup(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/agegroup")
    public ResponseEntity<?> findAllAgeGroups() {
        try {
            List<AgeGroup> list = repository.findAll();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/agegroup/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        try {
            Optional<AgeGroup> optional = repository.findById(id);
            if(optional.isPresent()) {
                AgeGroup ageGroup = optional.get();
                return new ResponseEntity<>(ageGroup, HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
