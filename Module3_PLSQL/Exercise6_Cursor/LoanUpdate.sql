DECLARE
    CURSOR loan_cursor IS
        SELECT LoanID, InterestRate FROM Loans;
    v_loan loan_cursor%ROWTYPE;

BEGIN
    OPEN loan_cursor;
    LOOP
        FETCH loan_cursor INTO v_loan;
        EXIT WHEN loan_cursor%NOTFOUND;
        UPDATE Loans SET InterestRate = InterestRate + 1 WHERE LoanID = v_loan.LoanID;
    END LOOP;
    CLOSE loan_cursor;
    COMMIT;
END;
/