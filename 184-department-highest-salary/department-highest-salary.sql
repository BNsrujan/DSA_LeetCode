select d.name AS Department,
       e.name AS Employee,
       e.salary as Salary
from Employee e
JOIN Department d ON e.departmentID = d.id
where e.salary = (
    Select Max(salary)
    From Employee
    where departmentId = e.departmentId
)
