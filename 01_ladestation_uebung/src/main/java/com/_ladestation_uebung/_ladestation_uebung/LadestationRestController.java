package com._ladestation_uebung._ladestation_uebung;

import org.springframework.web.bind.annotation.*;

//REST API (Multiple Outputs.)
@RestController
@RequestMapping(path = "/ladestationen")
public class LadestationRestController {
    @GetMapping(path = "/ladevorgaenge")
    public Ladevorgang ladevorgang() {
            return new Ladevorgang(100000000000L);
    }
}
