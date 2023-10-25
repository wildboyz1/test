package dev.mn.test.controllers;

import dev.mn.test.modals.Department;
import dev.mn.test.repositories.impl.DepartmentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ProcessAction", value = "/process-action-controller")
public class ProcessAction extends HttpServlet {

    private static EntityManager em;
    static {
        em = Persistence.createEntityManagerFactory("employee").createEntityManager();
    }

    public static EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/home.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("action").equalsIgnoreCase("Thêm Phòng Ban")) {
            String getDeptName = req.getParameter("inputDeptName");
            new DepartmentRepository(em).insert(new Department(getDeptName));

            req.getServletContext().getRequestDispatcher("/list_department.jsp").forward(req, resp);
        }
    }
}
