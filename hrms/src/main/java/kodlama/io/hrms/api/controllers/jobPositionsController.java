package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.entities.concretes.jobPosition;
import kodlama.io.hrms.business.abstracts.jobPositionService;


@RestController
@RequestMapping("/api/jobPosition")
public class jobPositionsController {
	
	private jobPositionService jobPositionService;

	@Autowired
	public jobPositionsController(kodlama.io.hrms.business.abstracts.jobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getall")
	public List<jobPosition> getAll(){
		return this.jobPositionService.getAll();
		
	}
}
