package dev.mn.test.repositories.impl;

import dev.mn.test.modals.Department;
import dev.mn.test.repositories.IRepositories;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.Optional;

public class DepartmentRepository implements IRepositories<Department> {
    private EntityManager em;
    private EntityTransaction transaction;
    public DepartmentRepository(EntityManager em) {
        this.em = em;
        transaction = em.getTransaction();
    }

    @Override
    public boolean insert(Department department) {
        try {
            transaction.begin();
            em.persist(department);
            transaction.commit();
            return true;
        } catch (Exception exception) {
            transaction.rollback();
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Department department) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Optional<Department> findById(String id) {
        return Optional.of(em.createNamedQuery("Department.findById", Department.class).getSingleResult());
    }

    @Override
    public List<Department> findAll() {
        return em.createNamedQuery("Department.findAll", Department.class).getResultList();
    }
}
