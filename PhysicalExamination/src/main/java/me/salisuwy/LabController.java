package me.salisuwy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController {
  @Autowired
    LabRepository itemsRespository;


    @GetMapping("/LabResult")
    public List<Lab> findAll()
    {
    	return itemsRespository.findAll();
    }
}
