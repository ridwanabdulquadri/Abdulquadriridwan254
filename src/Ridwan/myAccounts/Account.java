package Ridwan.myAccounts;

public class Account {
    private String name;
    private String address;
    private int day;
    private int month;
    private int year;
    private int nationality;
    private int deposit;
    private int withdraw;

    public Account(String name, String address, int day, int month, int year, int nationality) {
        this.name = name;
        this.address = address;
        this.day = day;
        this.month = month;
        this.year = year;
        this.nationality = nationality;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public Account(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNationality() {
        return nationality;
    }

    public void setNationality(int nationality) {
        nationality = nationality;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getDeposit() {
        return deposit;
    }
    public void setWithdraw(int withdraw){
        this.withdraw = withdraw;
    }

    public int getWithdraw() {
        return withdraw;
    }
}
