package com.skiraindustries.dio_class.devweek.Controller;

import com.skiraindustries.dio_class.devweek.Entity.Region;
import com.skiraindustries.dio_class.devweek.Repository.RegionRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerRegion {

    private final RegionRepo repository;

    public ControllerRegion(RegionRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/regiao")
    public List<Region> getRegion() {
        return repository.findAll();
    }

    @GetMapping("/regiao/{id}")
    public ResponseEntity<Region> getRegionById(@PathVariable Long id) {
        Optional<Region> regionChosenOptional =  repository.findById(id);
        if(regionChosenOptional.isPresent()) {
            Region regionChosen = regionChosenOptional.get();
            return new ResponseEntity<Region>(regionChosen, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/regiao/novo")
    public void putRegiao(Region newRegion) {
        repository.save(newRegion);
    }


}
