package dev.mn.test.services.impl;

import dev.mn.test.modals.Employee;
import dev.mn.test.repositories.impl.EmployeeRepository;
import dev.mn.test.services.IServices;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class EmployeeService implements IServices<Employee> {
    private EntityManager em;

    public EmployeeService(EntityManager em) {
        this.em = em;
    }

    @Override
    public boolean insert(Employee employee) {
        return new EmployeeRepository(em).insert(employee);
    }

    @Override
    public boolean update(Employee employee) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Optional<Employee> findById(String id) {
        return Optional.of(new EmployeeRepository(em).findById(id).get());
    }

    @Override
    public List<Employee> findAll() {
        return new EmployeeRepository(em).findAll();
    }
}
