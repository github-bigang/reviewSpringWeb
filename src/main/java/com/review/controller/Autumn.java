package com.review.controller;/*thinkpad
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Autumn {
    @RequestMapping("info")
    public String info() {
        return "String info";
    }
}
