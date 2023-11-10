package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greetings greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greetings(counter.incrementAndGet(), String.format(template, name));
	}
}
