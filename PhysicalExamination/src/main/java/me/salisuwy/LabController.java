package me.salisuwy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController {
  @Autowired
    LabRepository labRepository;


    @GetMapping("/LabResult")
    public List<Lab> findAll()
    {
    	return labRepository.findAll();
    }
    
    @GetMapping("/LabResult/{id}")
    public List<Lab> show(@PathVariable String id){
    	int pID = Integer.parseInt(id);
    	return labRepository.findById(pID);
    }
    
}
