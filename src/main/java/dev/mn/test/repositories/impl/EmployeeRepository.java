package dev.mn.test.repositories.impl;

import dev.mn.test.modals.Employee;
import dev.mn.test.repositories.IRepositories;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.Optional;

public class EmployeeRepository implements IRepositories<Employee> {
    private EntityManager em;
    private EntityTransaction transaction;

    public EmployeeRepository(EntityManager em) {
        this.em = em;
        this.transaction = em.getTransaction();
    }

    @Override
    public boolean insert(Employee employee) {
        try {
            transaction.begin();
            em.persist(employee);
            transaction.commit();
            return true;
        } catch (Exception exception) {
            transaction.rollback();
            exception.printStackTrace();
            return false;
        }
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
        return Optional.of(em.createNamedQuery("Employee.findById", Employee.class).getSingleResult());
    }

    @Override
    public List<Employee> findAll() {
        return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
    }
}
