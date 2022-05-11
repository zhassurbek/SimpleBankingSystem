class Account {

    private long balance;
    private String ownerName;
    private boolean locked;


    public long getBalance() {
        return balance;
    }

    public long setBalance(long balance) {
        return this.balance = balance;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public String setOwnerName(String ownerName) {
        return this.ownerName = ownerName;
    }


    public boolean isLocked() {
        return locked;
    }

    public boolean setLocked(boolean locked) {
        return this.locked = locked;
    }
}