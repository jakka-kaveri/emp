package mvcSpring.DAO;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvcSpring.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<Employee> getAllEmp() {
        return hibernateTemplate.loadAll(Employee.class);
    }

    public Employee getById(int id) {
        return hibernateTemplate.get(Employee.class, id);
    }

    public void save(Employee emp) {
        hibernateTemplate.saveOrUpdate(emp);
    }

	
}
