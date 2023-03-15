class BankAccount extends Exception {

    private double amount;

    public void deposite(double sum) {
        amount += sum;
        return;
    }

    public double getAmount() {
        return amount;
    }

    public double withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("У вас мало денежных средств! ", getAmount());
        }
        amount -= sum;
        System.out.println("Сумма для списания с карты: " + sum);

        return amount;
    }
}