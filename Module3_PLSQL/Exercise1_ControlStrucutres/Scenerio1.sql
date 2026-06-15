DECLARE
    v_age NUMBER;
BEGIN
    FOR cust IN (
        SELECT c.CustomerID,
               FLOOR(MONTHS_BETWEEN(SYSDATE,c.DOB)/12) age
        FROM Customers c
    )
    LOOP

        IF cust.age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to Customer ID '
                || cust.CustomerID
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/