package com.microServiceCvs.microServiceCvs;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;








@RestController
public class CvController {
	
	@Autowired
	private CvService cvService; 
	
	@PostMapping("/newCv")
    public Cv createNote(@RequestBody  Cv cv) {
	     return cvService.save(cv);
	    }
	@GetMapping(path="/allCv")
	  public Iterable<Cv> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return cvService.findAll();
	  }
	@GetMapping(path="cv/byId/{id}")
	  public Cv  getById(@PathVariable(value = "id") String id) throws CvNotFoundException  {
	    // This returns a JSON or XML with the users
		 return cvService.findOne(id).orElseThrow(() -> new CvNotFoundException("CV with Id"+id+" not found")) ;
		 
		 
		
		 
	  }


}
