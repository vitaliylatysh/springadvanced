package ua.epam.spring.hometask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ua.epam.spring.hometask.repositories.CompanyRepository;

/**
 * @author Vitalii Latysh
 * Created: 10.03.2020
 */
@Controller
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/companies")
    public String showAllCompanies() {
        companyRepository.findAll();
        return "index";
    }
}
