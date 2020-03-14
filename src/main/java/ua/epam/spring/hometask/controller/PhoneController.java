package ua.epam.spring.hometask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ua.epam.spring.hometask.repositories.PhoneRepository;

/**
 * @author Vitalii Latysh
 * Created: 10.03.2020
 */
@Controller
public class PhoneController {

    @Autowired
    private PhoneRepository phoneRepository;

    @GetMapping("/phones")
    public String showAllPhones() {
        phoneRepository.findAll();
        return "index";
    }
}
