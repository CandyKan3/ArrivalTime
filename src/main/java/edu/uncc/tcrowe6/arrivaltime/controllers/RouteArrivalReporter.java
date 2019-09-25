package edu.uncc.tcrowe6.arrivaltime.controllers;

import edu.uncc.tcrowe6.arrivaltime.models.Route;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RouteArrivalReporter {

    @GetMapping("/reportArrival")
    public String sendForm(Route route) {

        return "reportArrival";
    }

    @PostMapping("/reportArrival")
    public String processForm(Route route) {

        return "reportReceived";
    }

}