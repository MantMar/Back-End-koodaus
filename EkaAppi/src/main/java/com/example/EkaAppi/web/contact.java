package com.example.EkaAppi.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class contact {
 @RequestMapping("/contact")
 public String contacts() {
 return "This is the contact page";
 }
}