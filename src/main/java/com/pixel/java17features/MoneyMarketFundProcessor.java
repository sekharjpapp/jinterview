package com.pixel.java17features;

public class MoneyMarketFundProcessor {
    public static String processTransaction(MMFTransaction transaction) {
        return switch (transaction) {
            case Deposit d -> "Depositing £" + d.amount() + " for investor " + maskInvestor(d.investorId());
            case Withdrawal w -> "Withdrawing £" + w.amount() + " for investor " + maskInvestor(w.investorId());
            case InterestCredit i -> "Crediting interest of £" + i.interestAmount() + " for investor " + maskInvestor(i.investorId());
        };
    }

    // Masking the investor ID for privacy
    private static String maskInvestor(String investorId) {
        return "INV-" + investorId.substring(investorId.length() - 4);
    }
    public static void main(String[] args) {
        MMFTransaction deposit = new Deposit("INVESTOR12345", 10000.00);
        MMFTransaction withdrawal = new Withdrawal("INVESTOR12345", 2000.00);
        MMFTransaction interest = new InterestCredit("INVESTOR12345", 50.75);

        System.out.println(processTransaction(deposit));
        System.out.println(processTransaction(withdrawal));
        System.out.println(processTransaction(interest));
    }
}


// Sealed interface defining Money Market Fund transactions
sealed interface MMFTransaction permits Deposit, Withdrawal, InterestCredit {}

// Different transaction types using records
record Deposit(String investorId, double amount) implements MMFTransaction {}
record Withdrawal(String investorId, double amount) implements MMFTransaction {}
record InterestCredit(String investorId, double interestAmount) implements MMFTransaction {}