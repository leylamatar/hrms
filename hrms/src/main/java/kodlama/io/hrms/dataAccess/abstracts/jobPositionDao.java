package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.jobPosition;

public interface jobPositionDao extends JpaRepository <jobPosition ,Integer>{

}
