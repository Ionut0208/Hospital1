package com.siit.hospital_manager.service;

import com.siit.hospital_manager.model.DiagnoseHistory;
import com.siit.hospital_manager.model.dto.DiagnoseHistoryDto;
import com.siit.hospital_manager.repository.DiagnoseHistoryRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DiagnoseHistoryService  {

    private final DiagnoseHistoryRepository diagnoseHistoryRepository;

    public List<DiagnoseHistoryDto> findAll() {
        return diagnoseHistoryRepository.findAll().stream().map(DiagnoseHistoryDto::new).toList();

    }

    public List<DiagnoseHistoryDto> findAllByPatient(Integer id){
        return diagnoseHistoryRepository.findAllByPatient(id).stream().map(DiagnoseHistoryDto::new).toList();
    }


}
