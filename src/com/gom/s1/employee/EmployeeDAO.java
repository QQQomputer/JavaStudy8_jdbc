package com.gom.s1.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gom.s1.util.DBConnector;

public class EmployeeDAO {

	private DBConnector dbc;

	public EmployeeDAO() {
		dbc = new DBConnector();
	}

	public List<EmployeeDTO> getList() throws Exception {

		EmployeeDTO eDTO = null;
		ArrayList<EmployeeDTO> a = new ArrayList<>();

		Connection con = dbc.getConnect();

		String sql = "SELECT * FROM EMPLOYEES";

		PreparedStatement st = con.prepareStatement(sql);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			eDTO = new EmployeeDTO();
			eDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			eDTO.setFirst_name(rs.getString("FIRST_NAME"));
			eDTO.setLast_name(rs.getString("LAST_NAME"));
			eDTO.setEmail(rs.getString("EMAIL"));
			eDTO.setPhone_number(rs.getString("PHONE_NUMBER"));
			eDTO.setHire_date(rs.getString("HIRE_DATE"));
			eDTO.setJob_id(rs.getString("JOB_ID"));
			eDTO.setSalary(rs.getInt("SALARY"));
			eDTO.setCommission_pct(rs.getInt("COMMISSION_PCT"));
			eDTO.setCommission_pct(rs.getDouble("MANAGER_ID"));
			eDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			a.add(eDTO);
		}
		rs.close();
		st.close();
		con.close();
		return a;

	}

	public EmployeeDTO getOne(EmployeeDTO emp) throws Exception {
		EmployeeDTO eDTO = null;

		Connection con = dbc.getConnect();

		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, emp.getEmployee_id());

		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			eDTO = new EmployeeDTO();
			eDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			eDTO.setFirst_name(rs.getString("FIRST_NAME"));
			eDTO.setLast_name(rs.getString("LAST_NAME"));
			eDTO.setEmail(rs.getString("EMAIL"));
			eDTO.setPhone_number(rs.getString("PHONE_NUMBER"));
			eDTO.setHire_date(rs.getString("HIRE_DATE"));
			eDTO.setJob_id(rs.getString("JOB_ID"));
			eDTO.setSalary(rs.getInt("SALARY"));
			eDTO.setCommission_pct(rs.getInt("COMMISSION_PCT"));
			eDTO.setCommission_pct(rs.getDouble("MANAGER_ID"));
			eDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
		}
		rs.close();
		st.close();
		con.close();
		return eDTO;
	}
}
