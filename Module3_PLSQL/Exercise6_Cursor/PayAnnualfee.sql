DECLARE
    CURSOR acc_cursor IS SELECT AccountID, Balance FROM Accounts;
    v_acc acc_cursor%ROWTYPE;

BEGIN
    OPEN acc_cursor;
    LOOP
        FETCH acc_cursor INTO v_acc;
        EXIT WHEN acc_cursor%NOTFOUND;
        UPDATE Accounts SET Balance = Balance - 100 WHERE AccountID = v_acc.AccountID;
    END LOOP;
    CLOSE acc_cursor;
    COMMIT;
END;
/