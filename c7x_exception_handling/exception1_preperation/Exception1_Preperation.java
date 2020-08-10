package c7x_exception_handling.exception1_preperation;

import java.io.IOException;
import java.util.Random;

//public
class Exception1_Preperation {

    static long count;

    public static void main(String[] args) throws OcaException {
        // perpetuumMobile();
        voorbereidenAanvraagOcaExamen();
    }

    static void perpetuumMobile() {
        System.out.println("count = " + ++count);
        //perpetuumMobile();
        throw new StackOverflowError();
    }

    static void voorbereidenAanvraagOcaExamen() throws OcaException {
//        Account oracleAccount = maakOracleAccount("www.oracle.com/account", "erik,bsn");
//        Account pearsonVueAccount = maakPearsonVueAccount("www.pearsonvue.com/account", "erik,wachtwoord");
//        boolean resultaat = koppelAccounts("www.oracle.com/testing", oracleAccount, pearsonVueAccount.identificatie);
        String naam = null;
        boolean resultaat = false;
//        try {
//            Account oracleAccount = maakOracleAccount("www.oracle.com/account", "erik,bsn");  // stopt met verdere uitvoering block bij 1e exception
//            Account pearsonVueAccount = maakPearsonVueAccount("www.pearsonvue.com/account", naam);
//            resultaat = koppelAccounts("www.oracle.com/testing", oracleAccount, pearsonVueAccount.identificatie);
//        } catch (OracleException e) {       // er wordt altijd maar één van de catches uitgevoerd
//            System.out.println("OracleException: bel Cor!");
//        } catch (PearsonVueException e) {          // mag geen subclass zijn van bovenliggende Exception
//            System.out.println("PearsonVueException: bel Cor!");
//        } catch (IOException e) {           // Exception moet vooraf gedefinieerd zijn, want IOException is checked exception
//            System.out.println("IOException");
//        } finally {
//            System.out.println("Maar laat Erik met rust!");
//        }

        try {
            Account oracleAccount = maakOracleAccount("www.oracle.com/account", "erik,bsn");  // stopt met verdere uitvoering block bij 1e exception
            Account pearsonVueAccount = maakPearsonVueAccount("www.pearsonvue.com/account", naam);
            //resultaat = koppelAccounts("www.oracle.com/testing", oracleAccount, pearsonVueAccount.identificatie);
        } finally {
            System.out.println("Maar laat Erik met rust!");
        }
        System.out.println("regel na try-finally");        // exception in protected block => finally wordt altijd uitgevoerd; regel na try-finally wordt niet uitgevoerd want programma stop bij (un-catched) exception


        String boodschap = resultaat ? "goed" : "fout";
        System.out.println("Het proces is " + boodschap + " verlopen.");

    }

    static Account maakOracleAccount(String url, String persoonsGegevens) throws OracleException, RuntimeException {
        if (true) throw new OracleException();
        Account account = new Account("Oracle", persoonsGegevens);
        account.organisatie = "Oracle";
        account.persoonsGegevens = persoonsGegevens.toLowerCase();
        System.out.println("Oracle account aangemaakt voor: " + persoonsGegevens);
        return account;
    }

    static Account maakPearsonVueAccount(String url, String naam) throws OcaException {
        Account account = new Account();
        try {
            account = new Account("Pearson Vue", naam.substring(0, naam.indexOf(',')));             // alles tussen {} heet 'protected block'
        } catch (NullPointerException variable) {
//            System.out.println("Onbekende fout opgetreden :" + variable.getStackTrace());
            System.out.println("Onbekende fout opgetreden ");
            throw new PearsonVueException();
        }

        account.identificatie = "ID-" + new Random().nextInt(9999);

        System.out.println("Pearson Vue account aangemaakt voor: " + account.persoonsGegevens + " met OracleTestID: " + account.identificatie);
        return account;
    }

    static boolean koppelAccounts(String oracleUrl, Account oracleAccount, String oracleTestingId) throws IOException {
        oracleAccount.identificatie = oracleTestingId;
        System.out.println("OracleTestID gekoppeld aan Oracle account van gebruiker: " + oracleAccount.persoonsGegevens);
        return true;
    }

}
