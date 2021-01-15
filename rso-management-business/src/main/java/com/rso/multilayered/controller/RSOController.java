package com.rso.multilayered.controller;

import com.rso.multilayered.dto.RsoDTO;
import com.rso.multilayered.dto.mapper.RsoMapper;
import com.rso.multilayered.service.RsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rso")
public class RSOController {

    @Autowired
    private RsoService rsoService;

    @Autowired
    private RsoMapper rsoMapper;

    @GetMapping("v1")
    public ResponseEntity<List<RsoDTO>> getAll() {
        return new ResponseEntity<>(
                rsoMapper.rsosToRsoDtos(
                        rsoService.getAll()
                ), HttpStatus.OK);
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<RsoDTO> get(@PathVariable(value = "id") Integer id) {
        return new ResponseEntity<>(
                rsoMapper.rsoToRsoDto(
                        rsoService.getByKey(id)
                ), HttpStatus.OK);
    }
}
