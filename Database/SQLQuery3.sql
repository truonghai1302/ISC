--Câu 1: Liệt kê nhân viên có lương từ $5,000 đến $12,000 và làm việc trong phòng ban có mã 20 hoặc 50. Tên
--cột được định danh theo thứ tự như sau : Employee’s Name (last_name+ first_name), Monthly Salary
select concat(first_name,' ', last_name) as 'Employee Name', nv.salary as 'Montly Salary'
from Employees nv, Departments dpt
where (nv.salary >= 5000 and nv.salary <= 12000) and (dpt.department_id=20 or dpt.department_id=50)

--Câu 2:Liệt kê nhân viên ( last_name + firstname ), tên công việc (job_title) của những nhân viên không có người quản lý
select concat(first_name,' ', last_name) as 'Employee Name', job_title as 'Ten Cong Viec'
from Employees nv join jobs jb on nv.job_id = jb.job_id 
where manager_id is NULL

--Câu 3:Liệt kê employee_id, last_name,firstname, salary , <New Salary> , Increase, commision_pct (phần trăm hoa hồng). Trường hợp nhân viên không có hoa hồng thì hiển thị “No commision” .
select 

--Câu 4:Cho biết tên công việc và lương trung bình lớn hơn 10000$ cho các nhân viên có công việc trong quá khứ
select *
from  ((employees emp join job_history jbh on emp.employee_id = jbh.employee_id) join jobs jb on jb.job_id = jbh.job_id) 
where 0=0


--Câu 5: 

