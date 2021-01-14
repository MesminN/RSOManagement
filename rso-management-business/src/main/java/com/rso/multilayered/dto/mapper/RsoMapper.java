package com.rso.multilayered.dto.mapper;

import com.rso.multilayered.dto.RsoDTO;
import com.rso.multilayered.model.RSO;

import java.util.ArrayList;
import java.util.List;

public class RsoMapper {


    public RsoDTO rsoToRsoDto(RSO rso) {
        if (rso == null) {
            return null;
        }

        RsoDTO rsoDto = new RsoDTO();

        if (rso.getId() != null) {
            rsoDto.setId(rso.getId());
        }
        if (rso.getName() != null) {
            rsoDto.setName(rso.getName());
        }
        if (rso.getNotes() != null) {
            rsoDto.setNotes(rso.getNotes());
        }
        if (rso.getAddress() != null) {
            rsoDto.setAddress(rso.getAddress());
        }
        if (rso.getStatus() != null) {
            rsoDto.setStatus(rso.getStatus());
        }

        return rsoDto;
    }

    public List<RsoDTO> rsosToRsoDtos(List<RSO> rsos) {
        if (rsos == null) {
            return null;
        }

        List<RsoDTO> list = new ArrayList<>();
        for (RSO rso : rsos) {
            list.add(rsoToRsoDto(rso));
        }

        return list;
    }

}
