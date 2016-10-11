package gfi.service;

import gfi.entities.Config;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Biel on 9/10/2016.
 */
@RestController()
@RequestMapping()
public class ConfigService {
    Config config;
    @RequestMapping()
    Config getConfig(){
        return config;
    }
}
