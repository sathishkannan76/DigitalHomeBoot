package com.digital.home.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.digital.home.model.LabourType;
import com.digital.home.repository.LabourTypeRepository;

@Service
public class LabourService {

	public List<LabourType> getAllLabourTypes(LabourTypeRepository labourTypeRepo) {
		return labourTypeRepo.findAll();
	}
	
	public List<LabourType> addLabourType(LabourTypeRepository labourTypeRepo, LabourType labourType) {
		labourTypeRepo.save(labourType);
		return labourTypeRepo.findAll();
	}

	public List<LabourType> deleteLabourType(LabourTypeRepository labourTypeRepo, LabourType labourType) {
		labourTypeRepo.delete(labourType);
		return labourTypeRepo.findAll();
	}
}
