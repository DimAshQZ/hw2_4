package pro.sky.hw2_4;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName) throws EmpIntServErrException;

    Employee deleteEmployee(String firstName, String lastName) throws EmpNotFoundException;

    Employee findEmployee(String firstName, String lastName) throws EmpNotFoundException;
}
