package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {

    @GetMapping("/")
        public ModelAndView karticka() {
            ModelAndView result = new ModelAndView("card");

            result.addObject("person", new Person("Jan", "Palach", LocalDate.of(1948, 8, 11)));
            result.addObject("address", new Address("Smetanova 337", "Všetaty", "27716"));
            return result;
    }
}
