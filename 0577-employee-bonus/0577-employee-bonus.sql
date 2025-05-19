SELECT 
Employee.name, Bonus.bonus
From 
Employee
LEFT OUTER JOIN
bonus ON Employee.empid = Bonus.empid
WHERE 
bonus < 1000 OR  bonus IS NULL;