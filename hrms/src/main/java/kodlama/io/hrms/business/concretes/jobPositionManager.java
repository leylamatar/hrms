package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.jobPositionService;
import kodlama.io.hrms.dataAccess.abstracts.jobPositionDao;
import kodlama.io.hrms.entities.concretes.jobPosition;

@Service
public class jobPositionManager implements jobPositionService {

	
	private jobPositionDao jobPositionDao;
	@Autowired
	public jobPositionManager(jobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	
	@Override
	public List<jobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
	}

	
}
