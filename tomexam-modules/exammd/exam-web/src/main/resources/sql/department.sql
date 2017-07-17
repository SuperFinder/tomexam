#sql("findAll")
select * from tm_department
#end
#sql("findByDeptCode")
select * from tm_department where dept_code = ?
#end
#sql("findDeptNameAndCode")
select dept_name,dept_code from tm_department
#end