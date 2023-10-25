package dev.mn.test.services.impl;

import dev.mn.test.modals.Department;
import dev.mn.test.repositories.impl.DepartmentRepository;
import dev.mn.test.services.IServices;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class DepartmentService implements IServices<Department> {
    private EntityManager em;

    public DepartmentService(EntityManager em) {
        this.em = em;
    }

    @Override
    public boolean insert(Department department) {
        return new DepartmentRepository(em).insert(department);
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
        return Optional.of(new DepartmentRepository(em).findById(id).get());
    }

    @Override
    public List<Department> findAll() {
        return new DepartmentRepository(em).findAll();
    }

    public String getDataRowsTable(){
        List<Department> departmentList = findAll();
        String dataRows = "";
        int i = 1;
        for(Department target : departmentList) {
            dataRows += "<tr><td>"+ target.getId() +"</td><td>"+ target.getName() +"</td><td><form><input type='submit' name='action' value='Update Department "+(i)+"'></form></td><td><form><input type='submit' name='action' value='Delete Department "+(i)+"'/></form></td></tr>";
            ++i;
        }
        return dataRows;
    }
}
