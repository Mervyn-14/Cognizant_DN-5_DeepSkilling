CREATE OR REPLACE TRIGGER CheckTransactRules
BEFORE INSERT
ON Transactions
FOR EACH ROW
DECLARE
    v_balance NUMBER;
BEGIN
    IF :NEW.TransactionType = 'Withdrawal' THEN
        SELECT Balance
        INTO v_balance
        FROM Accounts
        WHERE AccountID = :NEW.AccountID;
        IF :NEW.Amount > v_balance THEN
            RAISE_APPLICATION_ERROR( -20001,'Insufficient Balance' );
        END IF;
    END IF;
END;
/