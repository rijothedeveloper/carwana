package com.carwana.vehicle.controllers;

import com.carwana.vehicle.dto.MakeDto;
import com.carwana.vehicle.service.MakeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/make")
public class MakeController {
    private MakeService makeService;
    public MakeController(MakeService makeService) {
        this.makeService = makeService;
    }

    @GetMapping
    public ResponseEntity<List<MakeDto>> getMakes() {
        List<MakeDto> makeDtos = makeService.getAllMakes();
        return ResponseEntity.ok(makeDtos);
    }

    @PostMapping
    public ResponseEntity<MakeDto> addMake(@RequestBody MakeDto makeDto) {
        makeService.addMake(makeDto);
        return ResponseEntity.ok(makeDto);
    }
}
