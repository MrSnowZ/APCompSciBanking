10.4 AP Computer Science A Homework...

In order to practice using statics, we are going to create a Bank with a variety of bank accounts. Every instance of the class will represent a bank account, and the overall class will hold the totals for the bank.


1. Create a Bank class that holds a balance, an account type, a username, and an account number. Every account will hold an initial amount. The three types of accounts are savings, checking, and loan. It should also have a deposit and withdrawal. The deposit function should add money to a savings or checking account and reduce the amount of money in a loan account. The withdraw function will remove money from the account if it is checking or savings, but should be disabled loans.

2. The bank should start with an amount of money it has access to as a static. When people put money in to checking and savings this amount should go up (including in the constructor) when they loan out money, the amount of money should go down. The bank can never loan money or withdraw money if there is none left.