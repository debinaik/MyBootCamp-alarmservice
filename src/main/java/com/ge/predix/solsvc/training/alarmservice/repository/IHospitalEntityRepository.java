package com.ge.predix.solsvc.training.alarmservice.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ge.predix.solsvc.training.alarmservice.entity.HospitalEntity;

@Repository
public interface IHospitalEntityRepository extends PagingAndSortingRepository<HospitalEntity, Integer> {
	
	
//	 @SuppressWarnings("unchecked")
//	 @Override
//	 @Transactional(propagation=Propagation.REQUIRED)
	 //HospitalEntity save(HospitalEntity hospitalEntityRef);
	 
	 @Override
	 List<HospitalEntity> findAll();

}
