package com.ge.predix.solsvc.training.alarmservice.jpa.init;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ge.predix.solsvc.training.alarmservice.entity.AlarmEventEntity;
import com.ge.predix.solsvc.training.alarmservice.entity.HospitalEntity;
import com.ge.predix.solsvc.training.alarmservice.entity.PatientEntity;
import com.ge.predix.solsvc.training.alarmservice.repository.IAlarmEventEntityRepository;
import com.ge.predix.solsvc.training.alarmservice.repository.IHospitalEntityRepository;
import com.ge.predix.solsvc.training.alarmservice.repository.IPatientEntityRepository;

@Component
public class InitAlarmServiceData {
	
	@Autowired
	private IAlarmEventEntityRepository alarmService;

	@Autowired
	private IPatientEntityRepository patientService;
	
	@Autowired
	private IHospitalEntityRepository hospitalEntityRepository;
	
	
	@PostConstruct
	public void initAlarmServiceData(){
		HospitalEntity hospitalEntity = new HospitalEntity();
		hospitalEntity.setAddress("100, 2305 Camino Ramon, San Ramon, CA 94583");
		hospitalEntity.setPhone("925 234 2345");
		hospitalEntity.setHospitalName("John Muir Medical Group");
		hospitalEntity.setEmail("mike.waldman@ge.com");
		hospitalEntityRepository.save(hospitalEntity);
		
		HospitalEntity hospitalEntity1 = new HospitalEntity();
		hospitalEntity1.setAddress("Plot nu 119, RaiDurgam, Hyderabad");
		hospitalEntity1.setPhone("9866609442");
		hospitalEntity1.setHospitalName("Apollo");
		hospitalEntity1.setEmail("DebiPrasad.Naik@cognizant.com");
		hospitalEntityRepository.save(hospitalEntity1);
	
		PatientEntity pe = new PatientEntity(1, "Mike", "", "Waldman", "mike.waldman@ge.com", "", null);
		patientService.save(pe);
		
		List<AlarmEventEntity> eList = new ArrayList<AlarmEventEntity>();
		AlarmEventEntity e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "COUPLET", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "COUPLET", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 MOTION DET", "TECHNICAL", 0);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 MOTION DET", "TECHNICAL", 0);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "CHNGE BATTERY", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 MOTION DET", "TECHNICAL", 0);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 MOTION DET", "TECHNICAL", 0);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);	
		alarmService.save(eList);
	}
}
