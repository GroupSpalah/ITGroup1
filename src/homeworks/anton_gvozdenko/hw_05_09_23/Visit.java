package homeworks.anton_gvozdenko.hw_05_09_23;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Visit {
    private List<Employee> employees;
    private Patient patient;
    private LocalDate date;
    private ProcedureType procedureType;

    public Visit(Patient patient, LocalDate date, ProcedureType procedureType) {
        this.employees = new ArrayList<>();
        this.patient = patient;
        this.date = date;
        this.procedureType = procedureType;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public ProcedureType getProcedureType() {
        return procedureType;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);

    }


    }
