package com.javaguides.employee_service.service;

import com.javaguides.employee_service.dto.APIResponseDto;
import com.javaguides.employee_service.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
