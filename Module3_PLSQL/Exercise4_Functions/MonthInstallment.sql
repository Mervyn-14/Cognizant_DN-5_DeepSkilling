CREATE OR REPLACE FUNCTION
CalculateMonthlyInstallment( p_loan_amount NUMBER, p_interest_rate NUMBER,p_years NUMBER)
RETURN NUMBER
IS
    v_total_amount NUMBER;
    v_monthly_installment NUMBER;
BEGIN
    v_total_amount := p_loan_amount +(p_loan_amount * p_interest_rate / 100 *  p_years);
    v_monthly_installment := v_total_amount / (p_years * 12);
    RETURN v_monthly_installment;
END;
/


--To Test the fuction i have use this in ORacle engine
SELECT CalculateMonthlyInstallment(12000,5, 1) FROM dual;