package com.git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
@GetMapping("/hi")
public String sayHello()
{
	return "hello";
}
public String hi()
{
	return "hi";


}
