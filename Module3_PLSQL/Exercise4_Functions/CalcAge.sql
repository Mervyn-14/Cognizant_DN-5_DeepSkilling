CREATE OR REPLACE FUNCTION CalculateAge(dob DATE)
RETURN NUMBER
IS
    v_age NUMBER;
BEGIN
    v_age := FLOOR( MONTHS_BETWEEN(  SYSDATE, dob ) / 12 );
    RETURN v_age;
END;
/


--For testing above function iam using the below query.
-- dual is special one row table provided by oracle for testing purpose.

SELECT CalculateAge( TO_DATE( '1985-05-15',  'YYYY-MM-DD'  ))
FROM dual;