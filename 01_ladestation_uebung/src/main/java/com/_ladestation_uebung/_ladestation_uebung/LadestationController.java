package com._ladestation_uebung._ladestation_uebung;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//REST API (Multiple Outputs.)
@RestController
public class LadestationController {
    @GetMapping(path = "/lade-station-bean")
    public LadestationBean ladestationBean() {
            return new LadestationBean(100000000000L);
    }
}
