SELECT * FROM employees.employees;

SELECT * FROM employees.salaries;

SELECT COUNT(gender) as QTDEdeFuncionario
from employees.employees
group by
    gender;

SELECT
    gender,
    hire_date,
    birth_date,
    COUNT(DISTINCT emp_no) AS QTDE
FROM employees.employees
GROUP BY
    gender
ORDER BY hire_date, birth_date;

SELECT gender, AVG(salary) AS media, MIN(salary) AS min, MAX(salary) AS max
FROM employees.employees
GROUP BY
    gender;

SELECT a.gender, AVG(b.salary) AS media, MIN(b.salary) AS min, MAX(b.salary) AS max
FROM employees.employees a
    inner join employees.salaries b on a.emp_no = b.emp_no
GROUP BY
    gender;