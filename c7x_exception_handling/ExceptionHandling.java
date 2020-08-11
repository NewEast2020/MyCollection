package c7x_exception_handling;

public class ExceptionHandling {

    public static void main(String[] args) {

    }
}
//        ==========
//        Exceptions
//        ==========
// =============================================================================================
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
//==================
//STUKJE INHERITANCE
//==================
//extends vs implements
//●	een class extends AnotherClass en implements AnInterface (let op volgorde: extends komt vóór implements)
//●	een Interface extends AnotherInterface
//●	een Interface kan niet een andere interface implementeren
// ========================================================================================================
