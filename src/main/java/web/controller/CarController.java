package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(required = false, defaultValue = "10000") int count,Model model) {
        CarService carService = new CarService();

        model.addAttribute("justtest", "This is list of cars:");
        model.addAttribute("carsTable", carService.getCars(count));

        return "cars_page";
    }
}
