package br.com.letscode.java;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        String beContinue = "S";

        int indivOrCorpAccount;
        int savCheckOrInvestAccount;
        int checkOrInvestAccount;

        int corpCheckAccountNumber = 0;
        int corpInvestAccountNumber = 0;

        int indivCheckAccountNumber = 0;
        int savingsAccountNumber = 0;
        int indivInvestAccountNumber = 0;

        CorporateAccount[] chekingCorpAccounts = new CorporateAccount[10];
        CorporateAccount[] investCorpAccounts = new CorporateAccount[10];

        IndividualAccount[] checkingIndividualAccounts = new IndividualAccount[10];
        IndividualAccount[] savingsAccounts = new IndividualAccount[10];
        IndividualAccount[] investIndividualAccounts = new IndividualAccount[10];

        do {
            System.out.println("BANCO LET'S CODE.");
            System.out.println("Menu:\n");
            System.out.println("1 para criar conta.");
            System.out.println("2 para sacar.");
            System.out.println("3 para deposito.");
            System.out.println("4 para transferir.");
            System.out.println("5 para investir.\n");
            System.out.println("6 para consultar saldo.\n");
            System.out.println("Digite a ação desejada:");
            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();

            if (menu >= 1 && menu <= 5) {

                switch (menu) {
                    case (1):
                        do {
                            verifyType();
                            indivOrCorpAccount = input.nextInt();
                        } while (indivOrCorpAccount < 0 && indivOrCorpAccount >= 2);
                        if (indivOrCorpAccount == 1) {
                            do {
                                verifyCorpAccount();
                                checkOrInvestAccount = input.nextInt();
                            } while (checkOrInvestAccount < 0 && checkOrInvestAccount >= 2);
                            if (checkOrInvestAccount == 1) {
                                CorporateAccount checkingCorp = new CheckingCorpAccount();
                                String name = input.nextLine();
                                checkingCorp.setName(name);
                                checkingCorp.setNumberAccount(corpCheckAccountNumber);
                                chekingCorpAccounts[corpCheckAccountNumber] = checkingCorp;
                                corpCheckAccountNumber++;
                            } else {
                                CorporateAccount investmentCorp = new InvestCorpAccount();
                                String name = input.nextLine();
                                investmentCorp.setName(name);
                                investmentCorp.setNumberAccount(corpInvestAccountNumber);
                                investCorpAccounts[corpInvestAccountNumber] = investmentCorp;
                                corpInvestAccountNumber++;
                            }
                        } else {
                            do {
                                verifyIndivAccount();
                                savCheckOrInvestAccount = input.nextInt();
                            } while (savCheckOrInvestAccount < 0 && savCheckOrInvestAccount >= 3);
                            if (savCheckOrInvestAccount == 1) {
                                IndividualAccount checking = new CheckingIndivAccount();
                                String name = input.nextLine();
                                checking.setName(name);
                                checking.setNumberAccount(indivCheckAccountNumber);
                                checkingIndividualAccounts[indivCheckAccountNumber] = checking;
                                indivCheckAccountNumber++;
                            } else if (savCheckOrInvestAccount == 2) {
                                IndividualAccount savings = new SavingsAccount();
                                String name = input.nextLine();
                                savings.setName(name);
                                savings.setNumberAccount(savingsAccountNumber);
                                savingsAccounts[savingsAccountNumber] = savings;
                                savingsAccountNumber++;
                            } else {
                                IndividualAccount investment = new SavingsAccount();
                                String name = input.nextLine();
                                investment.setName(name);
                                investment.setNumberAccount(indivInvestAccountNumber);
                                investIndividualAccounts[indivInvestAccountNumber] = investment;
                                indivInvestAccountNumber++;
                            }
                        }
                        break;

                    case (2):
                        do {
                            verifyType1();
                            indivOrCorpAccount = input.nextInt();
                        } while (indivOrCorpAccount < 0 && indivOrCorpAccount >= 2);
                        if (indivOrCorpAccount == 1) {
                            do {
                                verifyCorpAccount();
                                checkOrInvestAccount = input.nextInt();
                            } while (checkOrInvestAccount < 0 && checkOrInvestAccount >= 2);
                            float rate = 0.005f;
                            if (checkOrInvestAccount == 1) {
                                receiveCash();
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                chekingCorpAccounts[numberAccount].cashWithdrawalCorp(rate, cash);
                            } else {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                investCorpAccounts[numberAccount].cashWithdrawalCorp(rate, cash);
                            }
                        } else {
                            do {
                                verifyIndivAccount();
                                savCheckOrInvestAccount = input.nextInt();
                            } while (savCheckOrInvestAccount < 0 && savCheckOrInvestAccount >= 3);
                            if (savCheckOrInvestAccount == 1) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                checkingIndividualAccounts[numberAccount].cashWithdrawal(cash);
                            } else if (savCheckOrInvestAccount == 2) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                savingsAccounts[numberAccount].cashWithdrawal(cash);
                            } else {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                investIndividualAccounts[numberAccount].cashWithdrawal(cash);
                            }
                        }
                        break;

                    case 3:
                        do {
                            verifyType1();
                            indivOrCorpAccount = input.nextInt();
                        } while (indivOrCorpAccount < 0 && indivOrCorpAccount >= 2);
                        if (indivOrCorpAccount == 1) {
                            do {
                                verifyCorpAccount();
                                checkOrInvestAccount = input.nextInt();
                            } while (checkOrInvestAccount < 0 && checkOrInvestAccount >= 2);
                            if (checkOrInvestAccount == 1) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                chekingCorpAccounts[numberAccount].cashDeposit(cash);

                            } else {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                investCorpAccounts[numberAccount].cashDeposit(cash);
                            }
                        } else {
                            do {
                                verifyIndivAccount();
                                savCheckOrInvestAccount = input.nextInt();
                            } while (savCheckOrInvestAccount < 0 && savCheckOrInvestAccount >= 3);
                            if (savCheckOrInvestAccount == 1) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                checkingIndividualAccounts[numberAccount].cashDeposit(cash);
                            } else if (savCheckOrInvestAccount == 2) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                savingsAccounts[numberAccount].cashDeposit(cash);
                            } else {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                investIndividualAccounts[numberAccount].cashDeposit(cash);
                            }
                        }
                        break;

                    case 4:
                        do {
                            verifyType1();
                            indivOrCorpAccount = input.nextInt();
                        } while (indivOrCorpAccount < 0 && indivOrCorpAccount >= 2);
                        if (indivOrCorpAccount == 1) {
                            do {
                                verifyCorpAccount();
                                checkOrInvestAccount = input.nextInt();
                            } while (checkOrInvestAccount < 0 && checkOrInvestAccount >= 2);
                            float rate = 0.005f;
                            if (checkOrInvestAccount == 1) {
                                int numberAccount = input.nextInt();
                                int accountReceives = input.nextInt();
                                float cash = input.nextFloat();
                                chekingCorpAccounts[numberAccount].cashTransferCorp(rate, accountReceives, cash);

                            } else {
                                int numberAccount = input.nextInt();
                                int accountReceives = input.nextInt();
                                float cash = input.nextFloat();
                                investCorpAccounts[numberAccount].cashTransferCorp(rate, accountReceives, cash);
                            }
                        } else {
                            do {
                                verifyIndivAccount();
                                savCheckOrInvestAccount = input.nextInt();
                            } while (savCheckOrInvestAccount < 0 && savCheckOrInvestAccount >= 3);
                            if (savCheckOrInvestAccount == 1) {
                                int numberAccount = input.nextInt();
                                int accountReceives = input.nextInt();
                                float cash = input.nextFloat();
                                checkingIndividualAccounts[numberAccount].cashTransfer(accountReceives, cash);
                            } else if (savCheckOrInvestAccount == 2) {
                                int numberAccount = input.nextInt();
                                int accountReceives = input.nextInt();
                                float cash = input.nextFloat();
                                savingsAccounts[numberAccount].cashTransfer(accountReceives, cash);
                            } else {
                                int numberAccount = input.nextInt();
                                int accountReceives = input.nextInt();
                                float cash = input.nextFloat();
                                investIndividualAccounts[numberAccount].cashTransfer(accountReceives, cash);
                            }
                        }
                        break;

                    case 5:
                        do {
                            verifyType1();
                            indivOrCorpAccount = input.nextInt();
                        } while (indivOrCorpAccount < 0 && indivOrCorpAccount >= 2);
                        if (indivOrCorpAccount == 1) {
                            do {
                                verifyCorpAccount();
                                checkOrInvestAccount = input.nextInt();
                            } while (checkOrInvestAccount < 0 && checkOrInvestAccount >= 2);
                            if (checkOrInvestAccount == 1) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                chekingCorpAccounts[numberAccount].cashInvest(cash);
                            } else {
                                float financialIncomming = 0.02f;
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                investCorpAccounts[numberAccount].cashInvestCorp(financialIncomming, cash);
                            }
                        } else {
                            do {
                                verifyIndivAccount();
                                savCheckOrInvestAccount = input.nextInt();
                            } while (savCheckOrInvestAccount > 0 && savCheckOrInvestAccount <= 3);
                            if (savCheckOrInvestAccount == 1) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                checkingIndividualAccounts[numberAccount].cashInvest(cash);
                            } else if (savCheckOrInvestAccount == 2) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                savingsAccounts[numberAccount].cashInvest(cash);
                            } else {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                investIndividualAccounts[numberAccount].cashInvest(cash);
                            }
                        }
                        break;

                    case 6:
                        do {
                            verifyType1();
                            indivOrCorpAccount = input.nextInt();
                        } while (indivOrCorpAccount < 0 && indivOrCorpAccount >= 2);
                        if (indivOrCorpAccount == 1) {
                            do {
                                verifyCorpAccount();
                                checkOrInvestAccount = input.nextInt();
                            } while (checkOrInvestAccount < 0 && checkOrInvestAccount >= 2);
                            if (checkOrInvestAccount == 1) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                chekingCorpAccounts[numberAccount].balanceInquiry();

                            } else {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                investCorpAccounts[numberAccount].balanceInquiry();
                            }
                        } else {
                            do {
                                verifyIndivAccount();
                                savCheckOrInvestAccount = input.nextInt();
                            } while (savCheckOrInvestAccount < 0 && savCheckOrInvestAccount >= 3);
                            if (savCheckOrInvestAccount == 1) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                checkingIndividualAccounts[numberAccount].balanceInquiry();
                            } else if (savCheckOrInvestAccount == 2) {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                savingsAccounts[numberAccount].balanceInquiry();
                            } else {
                                int numberAccount = input.nextInt();
                                float cash = input.nextFloat();
                                investIndividualAccounts[numberAccount].balanceInquiry();
                            }
                        }
                        break;

                    default:
                        System.out.println("Opção invalida!!!");
                        break;
                }
            }
            System.out.println("Deseja continuar? S/N");
            beContinue = input.next().toUpperCase();
        } while (beContinue.equals("S"));
    }

    public static void verifyType() {
        System.out.println("Para que tipo de pessoa será sua conta?");
        System.out.println("Digite 1 para pessoa jurídica.");
        System.out.println("Digite 2 para pessoa física.");
    }

    public static void verifyType1() {
        System.out.println("Digite 1 para pessoa jurídica.");
        System.out.println("Digite 2 para pessoa física.");
    }

    public static void verifyCorpAccount() {
        System.out.println("Digite o tipo de conta:");
        System.out.println("1 para conta corrente.");
        System.out.println("2 para conta investimento.");
    }

    public static void verifyIndivAccount() {
        System.out.println("Digite o tipo de conta:");
        System.out.println("1 para conta corrente.");
        System.out.println("2 para conta poupança.");
        System.out.println("3 para conta investimento.");

    }

    public static void receiveCash() {
        System.out.println("Digite a quantia em dinheiro:");
    }

    public void receiveAccountAndCash() {
        System.out.println("Digite o número da conta e a quantia em dinheiro:");
    }
}

