CREATE OR REPLACE PROCEDURE AddNewCustomer(p_customerid NUMBER,p_name VARCHAR2,
    p_dob DATE,
    p_balance NUMBER)
IS
BEGIN
    INSERT INTO Customers(CustomerID,Name,DOB, Balance,LastModified)
    VALUES( p_customerid, p_name, p_dob,p_balance, SYSDATE);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE(
        'Customer Added Successfully'
    );
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE(
            'Customer ID Already Exists'
        );
    WHEN OTHERS THEN
        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE('Error: '|| SQLERRM
        );
END;
/