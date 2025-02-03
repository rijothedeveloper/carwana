package com.carwana.vehicle.service.impl;

import com.carwana.vehicle.dto.MakeDto;
import com.carwana.vehicle.mapper.MakeMapper;
import com.carwana.vehicle.model.Make;
import com.carwana.vehicle.repository.MakeRepository;
import com.carwana.vehicle.service.MakeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MakeServiceImpl implements MakeService {

    private MakeRepository makeRepository;

    public MakeServiceImpl(MakeRepository makeRepository) {
        this.makeRepository = makeRepository;
    }


    @Override
    public MakeDto addMake(MakeDto makeDto) {
        Make make = MakeMapper.makeDtoToMake(makeDto);
        Make savedMake = makeRepository.save(make);
        return MakeMapper.makeToMakeDto(savedMake);
    }

    @Override
    public void deleteMake(MakeDto makeDto) {
        Make make = MakeMapper.makeDtoToMake(makeDto);
        makeRepository.delete(make);
    }

    @Override
    public MakeDto updateMake(MakeDto makeDto) {
        Make make = MakeMapper.makeDtoToMake(makeDto);
        Make savedMake =  makeRepository.save(make);
        return MakeMapper.makeToMakeDto(savedMake);
    }

    @Override
    public MakeDto getMake(String name) {
        Make make =  makeRepository.findByName(name);
        return MakeMapper.makeToMakeDto(make);
    }

    @Override
    public List<MakeDto> getAllMakes() {
        return makeRepository.findAll()
                .stream()
                .map(MakeMapper::makeToMakeDto)
                .toList();
    }
}
