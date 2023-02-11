package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.service.DiagnoseHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/diagnose")
@Controller
@RequiredArgsConstructor

public class DiagnoseController  {

    public List<DiagnoseController> findAll () {
        return DiagnoseHistoryService.findAll();

    }
    @GetMapping("/viewAll")
    public String findAllByPatient(Model model) {
        List<DiagnoseController> diagnoseController = findAll();
        model.addAttribute("diagnose", diagnoseHistory );

        return "/diagnose/viewAll";
    }
}
