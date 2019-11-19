package com.model.dynamic.module.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {

	@GetMapping
	public String version() {
		return "1.0.0";
	}
	
}
