CREATE OR REPLACE PROCEDURE UpdateBonus(
    p_department VARCHAR2,
    p_bonus_percent NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary =Salary +(Salary * p_bonus_percent / 100)
    WHERE Department = p_department;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE( 'Bonus Updated Successfully');
END;
/


EXEC UpdateBonus('IT',10) -- parameters are dept name and bonus percent by executing this above Query can be called....