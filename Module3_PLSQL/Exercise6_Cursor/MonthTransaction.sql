DECLARE
    CURSOR trans_cursor IS
        SELECT TransactionID, AccountID, Amount,   TransactionType FROM Transactions
        WHERE EXTRACT(MONTH FROM TransactionDate)= EXTRACT(MONTH FROM SYSDATE);
    v_trans trans_cursor%ROWTYPE;

BEGIN
    OPEN trans_cursor;
    LOOP
        FETCH trans_cursor INTO v_trans;
        EXIT WHEN trans_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Transaction ID: '|| v_trans.TransactionID || ' Amount: ' || v_trans.Amount );
    END LOOP;
    CLOSE trans_cursor;
END;
/