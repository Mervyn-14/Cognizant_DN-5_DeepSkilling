BEGIN
    FOR cus IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF cus.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cus.CustomerID;
            DBMS_OUTPUT.PUT_LINE('Customer ' || cus.CustomerID || ' promoted to VIP');
    END IF;
    END LOOP;
    COMMIT;
END;
/