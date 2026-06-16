--Package specification
CREATE OR REPLACE PACKAGE EmployeeManagement AS

    PROCEDURE HireEmployee( p_id NUMBER,p_name VARCHAR2, p_salary NUMBER);

    PROCEDURE UpdateEmployee( p_id NUMBER, p_salary NUMBER);

    FUNCTION AnnualSalary( p_id NUMBER ) RETURN NUMBER;
    
END EmployeeManagement;
/



--This is package Body
CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee( p_id NUMBER, p_name VARCHAR2,p_salary NUMBER )
    IS
    BEGIN
        INSERT INTO Employees(EmployeeID,Name, Salary)
        VALUES( p_id, p_name, p_salary );
    END;

    PROCEDURE UpdateEmployee(p_id NUMBER,p_salary NUMBER
    )
    IS
    BEGIN 
     UPDATE Employees SET Salary = p_salary WHERE EmployeeID = p_id;

    END;

    FUNCTION AnnualSalary( p_id NUMBER ) RETURN NUMBER
    IS
        v_salary NUMBER;
    BEGIN

        SELECT Salary INTO v_salary  FROM Employees WHERE EmployeeID = p_id;
        RETURN v_salary * 12;
    END;
END EmployeeManagement;
/