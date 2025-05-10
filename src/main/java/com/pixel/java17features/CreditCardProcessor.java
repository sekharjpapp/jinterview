package com.pixel.java17features;

// Sealed interface restricting the types of transactions
sealed interface CreditCardTransaction permits Purchase, Refund, CashWithdrawal {}

// Different transaction types using records
record Purchase(String cardNumber, double amount) implements CreditCardTransaction {}
record Refund(String cardNumber, double amount) implements CreditCardTransaction {}
record CashWithdrawal(String cardNumber, double amount) implements CreditCardTransaction {}

public class CreditCardProcessor {
    public static String processTransaction(CreditCardTransaction transaction) {
        return switch (transaction) {
            case Purchase p -> "Processing purchase of $" + p.amount() + " on card " + maskCard(p.cardNumber());
            case Refund r -> "Processing refund of $" + r.amount() + " to card " + maskCard(r.cardNumber());
            case CashWithdrawal c -> "Processing cash withdrawal of $" + c.amount() + " from card " + maskCard(c.cardNumber());
        };
    }

    // Masking the credit card number for security
    private static String maskCard(String cardNumber) {
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }

    public static void main(String[] args) {
        CreditCardTransaction purchase = new Purchase("1234567812345678", 200.50);
        CreditCardTransaction refund = new Refund("1234567812345678", 50.75);
        CreditCardTransaction withdrawal = new CashWithdrawal("1234567812345678", 500.00);

        System.out.println(processTransaction(purchase));
        System.out.println(processTransaction(refund));
        System.out.println(processTransaction(withdrawal));
    }
}
