package cn.mn.os.controller;

import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@GetMapping
    public Map<String, Object>  toIndex(){
        Map<String, Object> json = Maps.newHashMap();
        json.put("name","mi");
        LOGGER.debug("{}",json.get("name"));
        return json;
	}
}
