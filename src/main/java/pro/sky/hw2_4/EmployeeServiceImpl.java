package pro.sky.hw2_4;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Employee[] employee = {
            new Employee("Джефф", "Безос"),
            new Employee("Илон", "Маск"),
            new Employee("Бернар", "Арно"),
            new Employee("Билл", "Гейтс"),
            new Employee("Марк", "Цукерберг"),
            new Employee("Уоррен", "Баффет"),
            new Employee("Ларри", "Эллисон"),
            new Employee("Сергей", "Брин"),
            new Employee("Ларри", "Пейдж"),
            new Employee("Мукеш", "Амбани")
    };

    @Override
    public Employee addEmployee(String firstName, String lastName) throws EmpIntServErrException {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = new Employee(firstName, lastName);
                return employee[i];
            }
        }
        throw new EmpIntServErrException();
    }

    @Override
    public Employee deleteEmployee(String firstName, String lastName) throws EmpNotFoundException {
        Employee delEmp = new Employee(firstName, lastName);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].equals(delEmp)) {
                employee[i] = null;
                return delEmp;
            }
        }
        throw new EmpNotFoundException();
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) throws EmpNotFoundException {
        Employee findEmp = new Employee(firstName, lastName);
        for (Employee value : employee) {
            if (value.equals(findEmp)) {
                return findEmp;
            }
        }
        throw new EmpNotFoundException();
    }
}