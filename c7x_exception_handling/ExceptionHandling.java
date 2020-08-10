package c7x_exception_handling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class ExceptionHandling {

    public static void main(String[] args) {

    }
}

//        ===================================
//        Exceptions
//        ===================================

//public
class PrepExceptions {

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

    static Account maakOracleAccount(String url, String persoonsGegevens) throws OracleException,RuntimeException{
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

class OcaException extends Exception {
}
class OracleException extends OcaException{}
class PearsonVueException extends OcaException {}

class Account {
    String organisatie;
    String persoonsGegevens;
    String identificatie;

    public Account() {
    }

    public Account(String organisatie, String persoonsGegevens) {
        this.organisatie = organisatie;
        this.persoonsGegevens = persoonsGegevens;
    }
}
// =============================================================================================
// =============================================================================================
//
//        Exceptions zijn Java classes/objecten, immers alles in Java is (afgeleid van) een object!
//        ●	 Figuur 7.9 pag 477 uit je hoofd kennen!
//        ●	Herken a) welke exceptions to welk type behoren en b) welke exceptions een parent-child relatie hebben!
//
//        try {
//        statement1;
//        statement2;
//        …
//        } catch (Exception1 e ) {
//        statementA;
//        statementB;
//        } catch (Exception2 e ) {
//        statementA;
//        statementB;
//        } finally {
//        statementY;
//        statementZ;
//        }
//
//        SYNTAX:
//        ● try heeft minimaal 0 of meerdere catch blocks EN/OF 1 finally 	block
//
//        ○	 meerdere catch blocks toegestaan
//
//        ■	 er zal maar 1 catch block worden uitgevoerd
//        ■	exception on onderliggende catch mag geen subclass zijn van checked exception in bovenliggende catch
//        => “unreachable” code! => compiler error
//
//        ○	beperkte toegevoegde_waarde voor gebruik enkel try-finally 		constructie: finally zorgt voor “clean-up”die altijd wordt uitgevoerd
//        ●	Volgorde try – catch – finally is vast!
//        ●	Finally block wordt altijd uitgevoerd (m.u.v. System.exit() ; mag je voor nu vergeten)
//        ●	{ } verplicht
//        GEDRAG
//    @code: demonstreer onderstaande gedrag in codevoorbeelden
//        ●	op het moment dat er zich een exception voordoet, stopt 	onmiddellijk de uitvoering (evaluatie) van het vervolg van de 	regel(s).
//        ○	 int method1() throws Exception { throw new Exception; return 1;}
//        ■	“covers” for missing return ; return would be 			unreachable code
//        ●	indien meerdere exceptions are thrown, the laatste is zichtbaar
//        ●	indien return <waarde> statement in zowel 	try-catch-finally block, laatste is zichtbaar
//        ●	indien exception en return (of omgekeerd) achtereenvolgens in catch/finally block worden uitgevoerd, dan is de laatste zichtbaar
//        ●	let op variabelen die binnen try-catch-finally block 	gedefinieerd zijn; zijn LOKALE variabelen enkel bekend binnen eigen block; daarbuiten out-of-scope
//        ●	indien catch op “checked exceptions” test, dan moeten in het try-block (=protected block) statements voorkomen waarvan minstens 1 de betreffende exception gedeclareerd heeft (throws exception). Dit geldt voor alle subclasses van Exception, maar niet voor Exception of Throwable zelf.
//        ●
        // ========================================================================================================
        // ========================================================================================================

//public
class DemoExceptions {

    public static void main(String[] args) {
        onmiddellijkStoppen();
    }

    static void onmiddellijkStoppen() {
        int a = 1, b = 0, c = 1;
        try {
            // boolean resultaat = a / b > ++c;  // als een exception optreedt, stopt de verdere evaluatie van de regel onmiddellijk! dus c wordt niet opgehoogd
            //boolean resultaat = ++c < a / b;
            getal2();
        } catch (ArithmeticException e) {
            System.out.println("c: " + c);
        } catch (Exception e) {
            System.out.println("getal2 gevangen" + e.getMessage());
        }
    }

    static int getal() throws Exception {
        throw new Exception();
        //return 1;   // deze is unreachable geworden => compiler error
    }

    static int getal2() throws Exception {
        throw new Exception("test in getal2");
        // alles wat hierna zou staan zou unrechable code zijn!
    }  // andere schijfwijze voor hierboven. Eigenlijk vreemd dat geen returnwaarde gegeven is  = valkuil
}

//public
class DemoReturnValues {

    public static void main(String[] args) {

        System.out.println(demoInt1());
        System.out.println("==============");
        System.out.println(demoInt2());
        System.out.println("==============");
        System.out.println(demoStringBuilder());
    }

    static int demoInt1() {
        int var = 1;
        try {
            throw new Exception("demoInt1 exception");
        } catch (Exception e) {      // handle OR declare
            return ++var;   // pass by value
        } finally {
            ++var;
        }
        /*
         *   int a =1
         *    b=a
         *   a=2
         *   b is dan nog steeds 1
         */
    }

    static int demoInt2() {
        int var = 1;
        try {
            return ++var;
            //throw new Exception("demoInt2 exception");
        } catch (Exception e) {      // handle OR declare
            return ++var;
        } finally {
            return ++var;   // bij meerdere returns in verschillende blokken/clauses, geldt de laatst uitgevoerde return!
        }
    }

    static StringBuilder demoStringBuilder() {
        StringBuilder sb = new StringBuilder();
        try {
            throw new Exception("exception in stringbuilder");
        } catch (Exception e) {
            return sb.append(" catch ");
        } finally {
            sb.append(" finally ");
        }
    }
}

//public
class DemoExceptionInInitializer {

    static {
        if (true) throw new RuntimeException("blabla");  // geeft geen RuntimeException maar vormt dit om naar een => ExceptionInInitializerError
        /* /1 vindt plaats als er een RuntimeException optredt in static initializer block
         *  /2 fout optreedt bij initializatie van static variabele
         *  /3 fout optreedt bij uitvoering van een method in static block
         */
    }

    public static void main(String[] args) {
        System.out.println("voer programma uit");
    }
}

class DemoOverriding {

    public static void main(String[] args) {

    }

    int delen(int getal1, int getal2) throws IOException {
        return getal1 / getal2;
    }
}

class DemoSubClass extends DemoOverriding {

    public int delen(int getal1, int getal2) throws FileNotFoundException {
        return 10 * getal1 / getal2;
    }

//   * overriding regels:
//   * /0 er moet een child <=> parent relatie zijn
//   * /1 zelfde signature (methodeNaam + aantal/type/volgorde parameters zelfde)
//   * /2 access child >= access parent
//   * /3 primitive: return type gelijk zijn; object: child moet covariant zijn van de parent
//   * /4a exception child moet "smaller"/subclass zijn dan/van checked exception in parent; overriding methode kan niet een checked exception introduceren als die niet in the oorspronkelijke methode aanwezig was
}

//========
//STUKJE INHERITANCE
//========
//extends vs implements
//●	een class extends AnotherClass en implements AnInterface (let op volgorde: extends komt vóór implements)
//●	een Interface extends AnotherInterface
//●	een Interface kan niet een andere interface implementeren
