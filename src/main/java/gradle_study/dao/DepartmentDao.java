package gradle_study.dao;

import java.util.List;

import gradle_study.dto.Department;

/**
 * C(insert)
 * R(select, select where)
 * U(update)
 * D(delete)
 */

public interface DepartmentDao {
	List<Department> selectDepartmentByAll();
	Department selectDepartmentByNo(Department department);
	
	int insertDepartment(Department department);
	int updateDepartment(Department newdepartment);
	int deleteDepartment(int deptNo);
}
