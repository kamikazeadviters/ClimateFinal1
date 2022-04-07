package controller;

import model.GetClimateByGeographicCoordinate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GetClimateByGeographicCoordinate")
public class ClimateController {
    @GetMapping
    public GetClimateByGeographicCoordinate getClimateByGeographicCoordinate(){
        GetClimateByGeographicCoordinate c = new GetClimateByGeographicCoordinate();
        c.setApikey("e62f256cf80b4f49b3bc5b4c2fbcf2d5");
        c.setLatitude(38.4161);
        c.setLongitude(63.6167);
        return c;
    }
}
