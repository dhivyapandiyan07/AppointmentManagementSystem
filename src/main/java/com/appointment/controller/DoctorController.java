
package com.appointment.controller;
import org.springframework.web.bind.annotation.*; @RestController @RequestMapping("/api/doctors")
public class DoctorController { @GetMapping public String all(){ return "Doctors API"; } }
