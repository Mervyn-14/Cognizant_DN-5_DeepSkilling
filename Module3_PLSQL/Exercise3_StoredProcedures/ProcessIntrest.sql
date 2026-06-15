CREATE OR REPLACE PROCEDURE ProcessInterest
IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance+(Balance*0.01)
    WHERE AccountType = 'Savings';
    COMMIT;
    DBMS_OUTPUT.PUT_LINE( 'Interest Processed Successfully...........');
END;
/


EXEC ProcessInterest  --By running this line the stored Procedures may executed
 