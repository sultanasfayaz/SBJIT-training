CREATE TABLE Department (
    departmentId INT PRIMARY KEY,
    departmentName VARCHAR(50) NOT NULL
);

INSERT INTO Department (departmentId, departmentName) 
VALUES 
    (1, 'IT'),
    (2, 'HR'),
    (3, 'Finance');
    
    SELECT * FROM Department;
    
    CREATE TABLE Employee (
    employeeId INT PRIMARY KEY,
    employeeName VARCHAR(50) NOT NULL,
    salary INT,
    departmentId INT,
    FOREIGN KEY (departmentId) REFERENCES Department(departmentId)
);

INSERT INTO Employee (employeeId, employeeName, salary, departmentId) 
VALUES 
    (101, 'Rahul', 50000, 1),
    (102, 'Anita', 60000, 2),
    (103, 'Vijay', 55000, 1);
    
Select * from Employee where Salary>55000;

Update Employee
Set Salary=58000
Where employeeId=101;

Select * from Employee;

Delete from Employee where employeeId=103;

Select * from Employee where departmentId=1;

SELECT 
    e.employeeName, 
    d.departmentName
FROM 
    Employee e
JOIN 
    Department d
ON 
    e.departmentId = d.departmentId;
    
    
UPDATE Employee
SET departmentId = 3
WHERE employeeId = 102;

SELECT MAX(salary) AS HighestSalary
FROM Employee;

SELECT *
FROM Employee
ORDER BY salary ASC;

DELETE FROM Employee
WHERE departmentId = (
    SELECT departmentId 
    FROM Department 
    WHERE departmentName = 'HR'
);

SELECT *
FROM Employee
WHERE employeeName LIKE 'R%';


SELECT *
FROM Employee
WHERE salary = (SELECT MIN(salary) FROM Employee);


SET SQL_SAFE_UPDATES=0;

Update Employee
set employeeName='Rahul Sharma'
Where employeeName='Rahul';

UPDATE Employee
SET employeeName = 'Rahul Sharma'
WHERE employeeName = 'Rahul';

Select * from Employee;

SELECT 
    d.departmentName,
    COUNT(e.employeeId) AS NumberOfEmployees
FROM 
    Department d
LEFT JOIN 
    Employee e ON d.departmentId = e.departmentId
GROUP BY 
    d.departmentName;
    
    
DELETE FROM Employee
WHERE employeeName LIKE '%a%';

Select * from Employee;



INSERT INTO Employee (employeeId, employeeName, salary, departmentId) 
VALUES 
    (101, 'Rahul', 50000, 1),
    (102, 'Anita', 60000, 2),
    (104, 'Sumati', 55000, 1),
    (105, 'Vinita', 55000, 2),
    (106, 'Akhil', 55000, 3),
    (107, 'Sanjay', 55000, 2),
    (108, 'Raja', 55000, 1),
    (109, 'Vijay', 55000, 3);
    
DELETE FROM Employee
WHERE salary < 52000;

Select * from Employee
where Salary between 50000 AND 65000;
