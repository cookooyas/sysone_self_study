package springFw.ex05.jdbc01;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:config/jdbc01/application-config.xml");

		IEmpService empService = context.getBean(IEmpService.class);
		System.out.println("사원 조회");
		System.out.println("=========================================");
		System.out.println("총원 : " + empService.getEmpCount());
		System.out.println("103번 사원 조회 : " + empService.getEmpInfo(103));

//		System.out.println("사원수정: 200");
//		System.out.println("기존 200번 사원 조회 : " + empService.getEmpInfo(200));
//		
//		EmpVO emp = new EmpVO();
//		emp.setEmployeeId(200);
//		emp.setFirstName("FirstName");
//		emp.setLastName("LastName");
//		emp.setEmail("Email");
//		emp.setPhoneNumber("PhoneNumber");
//		emp.setJobId("AD_PRES");
//		emp.setSalary(1000);
//		emp.setCommissionPct(0.0);
//		emp.setManagerId(100);
//		emp.setDepartmentId(90);
//		emp.setHireDate(java.sql.Date.valueOf("2020-01-01"));
//		
//		empService.updateEmp(emp);
//		
//		System.out.println("변경 200번 사원 조회 : " + empService.getEmpInfo(200));

		System.out.println("-- 사원입력: 210");
		EmpVO emp = new EmpVO();
		emp.setEmployeeId(210);
		emp.setFirstName("FirstName");
		emp.setLastName("LastName");
		emp.setEmail("Email@email.com");
		emp.setPhoneNumber("PhoneNumber");
		emp.setJobId("IT_PROG");
		emp.setSalary(10000);
		emp.setCommissionPct(0.0);
		emp.setManagerId(100);
		emp.setDepartmentId(90);

		try {
			empService.insertEmp(emp);
			System.out.println("inserted.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		EmpVO emp210 = empService.getEmpInfo(210);
		System.out.println("210사원 연봉 수정 10% 인상");
		System.out.println("기존정보 : "+emp210.toString());
		emp210.setSalary(emp210.getSalary()*1.1);
		try {
			empService.updateEmp(emp210);
			System.out.println("수정정보 : "+
					empService.getEmpInfo(210));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		empService.deleteEmp(210, "Email@email.com");
		context.close();
	}

}
