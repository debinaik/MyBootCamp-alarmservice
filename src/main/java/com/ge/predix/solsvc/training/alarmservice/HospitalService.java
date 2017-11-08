package com.ge.predix.solsvc.training.alarmservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ge.predix.solsvc.training.alarmservice.dto.HospitalDTO;
import com.ge.predix.solsvc.training.alarmservice.entity.HospitalEntity;
import com.ge.predix.solsvc.training.alarmservice.repository.IHospitalEntityRepository;

@RestController
public class HospitalService {
	
	@Autowired
	private IHospitalEntityRepository hospitalEntityRepository;
	
	@RequestMapping("/hospitalservice")
	public @ResponseBody List<HospitalDTO> helloWorld() {
		List<HospitalDTO> hospitalDTOList = new ArrayList<HospitalDTO>();
		List<HospitalEntity> hospitalEntityList = this.hospitalEntityRepository.findAll();
		for (HospitalEntity hospitalEntity:hospitalEntityList) {
			HospitalDTO hospitalDTO = new HospitalDTO();
			BeanUtils.copyProperties(hospitalEntity, hospitalDTO);
			hospitalDTOList.add(hospitalDTO);
		}
		return hospitalDTOList;
	}

}
