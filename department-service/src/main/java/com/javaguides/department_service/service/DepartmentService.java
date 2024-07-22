package com.javaguides.department_service.service;

import com.javaguides.department_service.dto.DepartmentDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    DepartmentDto saveDepartmentDto(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);
}
