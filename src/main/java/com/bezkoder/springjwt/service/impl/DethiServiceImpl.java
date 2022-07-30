package com.bezkoder.springjwt.service.impl;

import com.bezkoder.springjwt.models.Dethi;
import com.bezkoder.springjwt.payload.response.DethiResponse;
import com.bezkoder.springjwt.repository.DethiRepository;
import com.bezkoder.springjwt.service.DethiService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Cài đặt các phương thức liên quan đến Dethi
 *
 * @author Duy
 */
@Service
//@Transactional
public class DethiServiceImpl implements DethiService {
    @Autowired
    private DethiRepository dethiRepository;

    @Override
    public List<Dethi> gellAllDethi() {
        return dethiRepository.findAll();
    }
}
