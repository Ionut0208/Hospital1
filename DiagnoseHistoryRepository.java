package com.siit.hospital_manager.repository;

import com.siit.hospital_manager.model.DiagnoseHistory;
import com.siit.hospital_manager.model.MedicationHistory;
import com.siit.hospital_manager.model.dto.DiagnoseHistoryDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiagnoseHistoryRepository extends JpaRepository<DiagnoseHistoryDto, Integer> {

     List<DiagnoseHistoryDto> findAllByPatient(Integer id);



}
