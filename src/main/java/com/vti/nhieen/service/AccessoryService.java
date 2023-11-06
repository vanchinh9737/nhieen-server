package com.vti.nhieen.service;

import com.vti.nhieen.dto.AccessoryDto;
import com.vti.nhieen.entity.Accessory;
import com.vti.nhieen.form.AccessoryCreateForm;
import com.vti.nhieen.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    AccessoryDto create(AccessoryCreateForm form);
    Page<AccessoryDto> findAll(Pageable pageable);
    AccessoryDto update(Long id,AccessoryUpdateForm form);
    void  deleteById(Long id);
}
