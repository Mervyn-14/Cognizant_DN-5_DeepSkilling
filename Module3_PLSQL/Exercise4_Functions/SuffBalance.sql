CREATE OR REPLACE FUNCTION
SuffBalance( p_account_id NUMBER, p_amount NUMBER)
RETURN BOOLEAN
IS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_account_id;

    IF v_balance >= p_amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;
END;
/

--To test i have used the below query..

DECLARE
    result BOOLEAN;
BEGIN
    result := HasSufficientBalance(1, 500);
    IF result THEN
        DBMS_OUTPUT.PUT_LINE('Enough Balance');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
    END IF;
END;
/