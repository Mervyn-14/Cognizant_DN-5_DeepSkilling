-- Here this is my Package Specification....

CREATE OR REPLACE PACKAGE CustomerManagement AS
    PROCEDURE AddCustomer( p_id NUMBER,  p_name VARCHAR2, p_balance NUMBER );

    PROCEDURE UpdateCustomer( p_id NUMBER, p_name VARCHAR2);

    FUNCTION GetCustomerBalance(p_id NUMBER) RETURN NUMBER;

END CustomerManagement;
/

-- Package Body

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS
    PROCEDURE AddCustomer( p_id NUMBER,p_name VARCHAR2, p_balance NUMBER )
    IS
    BEGIN
        INSERT INTO Customers(CustomerID, Name,Balance, LastModified )
        VALUES(p_id, p_name,p_balance,SYSDATE );
    END;

    PROCEDURE UpdateCustomer( p_id NUMBER, p_name VARCHAR2 )
    IS
    BEGIN
        UPDATE Customers SET Name = p_name  WHERE CustomerID = p_id;
    END;

    FUNCTION GetCustomerBalance( p_id NUMBER ) RETURN NUMBER
    IS
        v_balance NUMBER;
    BEGIN
        SELECT Balance INTO v_balance FROM Customers WHERE CustomerID = p_id;
        RETURN v_balance;
    END;
END CustomerManagement;
/


--Example calling will be like
EXEC CustomerManagement.AddCustomer( 3,'David', 2000);

-- Helps to add customer using the predefined package and its body...