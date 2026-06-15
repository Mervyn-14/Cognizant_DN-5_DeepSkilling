BEGIN
    FOR lr IN (
        SELECT l.LoanID,c.Name, l.EndDate FROM Loans l
        JOIN Customers c
        ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || lr.Name || ', your loan ' 
        || lr.LoanID || ' is due on '
        || TO_CHAR(lr.EndDate,'DD-MON-YYYY'));
    END LOOP;
END;
/