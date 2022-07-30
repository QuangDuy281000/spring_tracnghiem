package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.service.DethiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/dethi")
public class DethiController {
    @Autowired
    private DethiService dethiService;

    @PreAuthorize("hasRole('USER')")
    @PostMapping(value = "/listdethitheotrinhdo")
    public ResponseEntity<?> getAll()
    {
        return ResponseEntity.ok(dethiService.gellAllDethi());
    }

}
