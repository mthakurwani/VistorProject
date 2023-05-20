package com.example.visitorsystem.controller;

import com.example.visitorsystem.model.VisitorSystem;
import com.example.visitorsystem.repository.VisitorSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitors")
public class VisitorSystemController {

    @Autowired
    private VisitorSystemRepository visitorSystemRepository;

    @GetMapping
    public List<VisitorSystem> getAllVisitors() {
        return visitorSystemRepository.findAll();
    }

    @GetMapping("/{id}")
    public VisitorSystem getVisitorById(@PathVariable long id) {
        return visitorSystemRepository.findById(id).orElse(null);
    }

    @PostMapping
    public VisitorSystem createVisitor(@RequestBody VisitorSystem visitorSystem) {
        return visitorSystemRepository.save(visitorSystem);
    }

    @PutMapping("/{id}")
    public VisitorSystem updateVisitor(@PathVariable Long id, @RequestBody VisitorSystem visitorSystemDetails){
        VisitorSystem visitorSystem = visitorSystemRepository.findById(id).orElse(null);
        if (visitorSystem!= null){
            visitorSystem.setFirstName(visitorSystemDetails.getFirstName());
            visitorSystem.setLastName(visitorSystemDetails.getLastName());
            visitorSystem.setEmail(visitorSystemDetails.getEmail());
            visitorSystem.setPhoneNumber(visitorSystemDetails.getPhoneNumber());
            visitorSystem.setPostalCode(visitorSystemDetails.getPostalCode());
            return visitorSystemRepository.save(visitorSystem);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteVistorSystem(@PathVariable Long id){
        visitorSystemRepository.deleteById(id);
    }


}
