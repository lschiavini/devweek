package com.skiraindustries.dio_class.devweek.Controller;

import com.skiraindustries.dio_class.devweek.Entity.Region;
import com.skiraindustries.dio_class.devweek.Repository.RegionRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerRegion {

    private final RegionRepo repository;

    public ControllerRegion(RegionRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/region")
    public List<Region> getRegion() {
        return repository.findAll();
    }

    @GetMapping("/region/{id}")
    public ResponseEntity<Region> findById(@PathVariable Long id) {
        try {
            Optional<Region> regionChosenOptional =  repository.findById(id);
            if(regionChosenOptional.isPresent()) {
                Region regionChosen = regionChosenOptional.get();
                return new ResponseEntity<Region>(regionChosen, HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/region/new")
    public Region putRegion(Region newRegion) {
        return repository.save(newRegion);
    }

    @PostMapping("/region/new")
    public Region postRegion(@RequestBody Region newRegion) {
        return repository.save(newRegion);
    }

    @DeleteMapping("/region/delete/{id}")
    public void deleteRegion(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
