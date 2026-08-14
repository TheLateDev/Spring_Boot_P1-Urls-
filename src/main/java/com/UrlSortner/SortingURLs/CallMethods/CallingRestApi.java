package com.UrlSortner.SortingURLs.CallMethods;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallingRestApi {

    @GetMapping("/api/hello")
    public String getHello() {
        return "Hello , its vishal";
    }

    @PostMapping("/api/greet")
    public String greetUser(@RequestParam(value = "name", defaultValue = "buddy") String name) {
        return "Hello " + name;
    }
}
