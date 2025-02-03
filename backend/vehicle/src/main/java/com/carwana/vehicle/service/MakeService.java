package com.carwana.vehicle.service;

import com.carwana.vehicle.dto.MakeDto;
import com.carwana.vehicle.model.Make;

import java.util.List;

public interface MakeService {
    public MakeDto addMake(MakeDto name);
    public void deleteMake(MakeDto name);
    public MakeDto updateMake(MakeDto name);
    public MakeDto getMake(String name);
    public List<MakeDto> getAllMakes();
}
