package com.example.combo.combo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HealtController {
    @GetMapping("/status")
    public String getStatus() {
        return "Servidor en funcionamiento";
    }
}
