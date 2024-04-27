package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "volga", 0));
        cars.add(new Car(2, "jeep", 99999));
        cars.add(new Car(3, "mercedes", 12345));
        cars.add(new Car(4, "oka", 2033));
        cars.add(new Car(5, "tesla", 326235));

        int request = 0;

        if (count == null || count > cars.size()) {
            request = cars.size();
        } else if (count > 0) {
            request = count;
        }


        List<Car> requestingCars = new ArrayList<>();

        for (int i = 0; i < request; i++) {

            requestingCars.add(cars.get(i));
        }

        model.addAttribute("cars", requestingCars);

        return "cars";
    }
}
