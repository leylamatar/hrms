package kodlama.io.hrms.business.abstracts;
import java.util.List;

import kodlama.io.hrms.entities.concretes.jobPosition;


public interface jobPositionService {
	List<jobPosition> getAll();
}
