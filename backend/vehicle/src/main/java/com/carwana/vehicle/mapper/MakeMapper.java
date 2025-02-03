package com.carwana.vehicle.mapper;

import com.carwana.vehicle.dto.MakeDto;
import com.carwana.vehicle.model.Make;

public class MakeMapper {
    public static Make makeDtoToMake(MakeDto makeDto) {
        return new Make(null,makeDto.name());
    }

    public static MakeDto makeToMakeDto(Make make) {
        return new MakeDto(make.getName());
    }
}
