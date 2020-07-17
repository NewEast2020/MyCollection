package c46_kalender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class SpelenMetCalendar {
    public static void main(String[] args) {
        LocalDate datum = spelenMetLocalDate_of();

        LocalTime tijd = spelenMetLocalTime_of();

        spelenMetLocalDate_of_plus_min(datum, datum.plusYears(10).plusMonths(-3), 12);

        LocalDate datum1 = spelenMetLocalDate_parse_get();

        LocalDateTime nieuweDatum = SpelenMetLocalDateTime_atTime_arg(datum, tijd);

        spelenMetLocalDate_of_toEpochDay_LocalDate_now_toEpochDay(datum, nieuweDatum);

        spelenMetLocalDate_now_isAfter(datum1);

        spelenMetPeriod();

        spelenMetDateTimeFormatter(datum);

        spelenMetLocalDate_of_minus();
    }

    private static LocalDate spelenMetLocalDate_of() {
        System.out.println(" === spelenMetLocalDate_of() === ");
        //        LocalDate datum = new LocalDate(); // examen instinker. De constructor is private
        LocalDate datum;
        datum = LocalDate.of(2020, 4, 21);
        System.out.println("datum: " + datum);
        datum = LocalDate.of(2040,4, 30);
        datum = LocalDate.of(2040, Month.APRIL, 30);
        System.out.println("datum: " + datum);
        System.out.println(" ");
        return datum;
    }

    private static LocalTime spelenMetLocalTime_of() {
        System.out.println(" === spelenMetLocalTime_of() === ");
        LocalTime tijd = LocalTime.of(14, 35, 45); // geen seconden, dan wordt deze ook niet geprint
        System.out.println("tijd: " + tijd);
        System.out.println(" ");
        return tijd;
    }

    private static void spelenMetLocalDate_of_plus_min(LocalDate datum, LocalDate localDate, int i) {
        System.out.println(" === spelenMetLocalDate_of_plus_min(LocalDate datum, LocalDate localDate, int i) === ");
        //        LocalDateTime test = LocalDate.of(1212,12,12); // Dit zal NOOIT compileren
        System.out.println("localDate.minusDays(i): " + localDate.minusDays(i)); // 18 jan 2050 // methode aanroep levert ALTIJD een nieuwe instantie op
        // datum = datum.plusYears(10);
        // datum = datum.plusMonths(-3);
        System.out.println("datum: " + datum); // immutable, dus originele waarde, want de return value is niet opgevangen in de orv datum
        System.out.println(" ");
    }

    private static LocalDate spelenMetLocalDate_parse_get() {
        System.out.println(" === spelenMetLocalDate_parse_get() === ");
        LocalDate datum1 = LocalDate.parse("2020-12-23"); // "2020-13-23" of "2020-1-23" leveren beiden een DateTimeParseException op.
        System.out.println("datum1: " + datum1);
        System.out.println("datum1.getDayOfWeek(): " + datum1.getDayOfWeek());
        System.out.println("datum1.getDayOfWeek().getValue(): " + datum1.getDayOfWeek().getValue()); // maandag is 1
        System.out.println(" ");
        return datum1;
    }

    private static LocalDateTime SpelenMetLocalDateTime_atTime_arg(LocalDate datum, LocalTime tijd) {
        System.out.println(" === spelenMetLocalDateTime_atTime_arg(LocalDate datum, LocalTime tijd) === ");
        System.out.println("datum: " + datum);
        System.out.println("datum.atTime(tijd): " +  datum.atTime(tijd)); //
        System.out.println(" ");
        return datum.atTime(tijd);
    }

    private static void spelenMetLocalDate_of_toEpochDay_LocalDate_now_toEpochDay(LocalDate datum, LocalDateTime nieuweDatum) {
        System.out.println(" === spelenMetLocalDate_of_toEpochDay_LocalDate_now_toEpochDay(LocalDate datum, LocalDateTime nieuweDatum) === ");
        System.out.println("nieuweDatum: " + nieuweDatum);
        System.out.println("datum.toEpochDay(): " + datum.toEpochDay()); // Bij LocalDate kun je toEopochDay gebruiken => aantal dagen vanaf 1 januari 1970
        System.out.println("LocalDate.now().toEpochDay(): " + LocalDate.now().toEpochDay());
        System.out.println(" ");
    }

    private static void spelenMetLocalDate_now_isAfter(LocalDate datum1) {
        System.out.println(" === spelenMetLocalDate_now_isAfter(LocalDate datum1) === ");
        System.out.println("datum1: " +  datum1);
        System.out.println("LocalDate.now().isAfter(datum1): " + LocalDate.now().isAfter(datum1)); // false, dan ligt datum1 nog in de toekomst
        System.out.println(" ");
    }

    private static void spelenMetPeriod() {
        System.out.println(" === spelenMetPeriod() === ");
        spelenMetPeriod_of_LocalDate_now_plus_min_argperiode();

        spelenMetPeriod_parse();

        spelenMetPeriod_ofYears_ofMonths_ofDays();
        System.out.println(" ");
    }

    private static void spelenMetPeriod_of_LocalDate_now_plus_min_argperiode() {
        System.out.println(" === spelenMetPeriod_of_LocalDate_now_plus_min_argperiode() === ");
        Period periode = Period.of(0, 2, 90);
        System.out.println("Betaaldatum: " + LocalDate.now().plus(periode)); // met plus kan ik een periode bij een datum optellen
        System.out.println("Verzenddatum: " + LocalDate.now().minus(periode));
        System.out.println(" ");
    }

    private static void spelenMetPeriod_parse() {
        System.out.println(" === spelenMetPeriod_parse() === ");
        Period period2 = Period.parse("p2Y33m7d"); //"p2Y7d33m" levert een DateTimeParseException op.
        System.out.println("period2: " + period2);
        period2 = Period.parse("p2Y33m2w7d"); // van W(-eken) maakt hij altijd dagen // volgorde van groot naar klein
        System.out.println("Period.parse(p2Y33m2w7d): " + period2);
        period2 = Period.parse("p234w"); // van W(-eken) maakt hij altijd dagen
        System.out.println("Period.parse(p234w): " + period2);
        period2 = Period.parse("-p-1y2m-3d"); // -y mag niet, moet dan -1y zijn
        System.out.println("Period.parse(-p-1y2m-3d): " + period2);
        System.out.println(" ");
    }

    private static void spelenMetPeriod_ofYears_ofMonths_ofDays() {
        System.out.println(" === spelenMetPeriod_ofYears_ofMonths_ofDays() ===  ");
        Period periode;
        periode = Period.ofYears(12).ofMonths(10).ofDays(2);
        System.out.println("Period.ofYears(12).ofMonths(10).ofDays(2): " + periode); // Wat is hier de uitkomst van? P12Y10M2D P2D
        Period.ofYears(12);
        System.out.println(" ");
    }

    private static void spelenMetDateTimeFormatter(LocalDate datum) {
        System.out.println(" === spelenMetDateTimeFormatter(LocalDate datum) === ");
        //        LocalDate.plus() // compileert niet, want de methode is niet static. Dit MOET vanuit een instantie
        // je gebruikt altijd DateTimeFormatter (geen specifieke DateFormatter of zo)
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG); // gebruik je een ofLocalizedTime of DateTime, dan gaat het mis!!
        System.out.println("dateTimeFormatter.format(datum): " + dateTimeFormatter.format(datum));
        System.out.println("datum.format(dateTimeFormatter): " + datum.format(dateTimeFormatter)); // kan twee kanten op! LocalDate heeft een methode format en DateTimeFormatter dus ook
        // de formatter moet afgestemd zijn op hetgene dat je erin wilt stoppen. Gebruik je ofLocalizesDateTime, dan wordt er ook een DateTime verwacht
        System.out.println(" ");
    }

    private static void spelenMetLocalDate_of_minus() {
        System.out.println(" === spelenMetLocalDate_of_minus() === ");
        LocalDate datum;// De afsluiter
        datum = LocalDate.of(2020, 4, 1); // april 30 dagen, maart 31 dagen, feb 29 dagen
        System.out.println("datum.minusDays(1).minusMonths(1): " + datum.minusDays(1).minusMonths(1)); // van 1 april, naar 31 maart, naar 29 feb.... uitvoeren methodes van links naar rechts
        spelenMetLocalDate_of_plus_min(datum.minusDays(4).minusMonths(1), datum.minusMonths(1), 1);
        System.out.println("datum.minusMonths(1).minusDays(4): " + datum.minusMonths(1).minusDays(4)); // van 1 april, naar 1 maart, naar 26 feb.
        System.out.println(" ");
    }
}

/* output
 === spelenMetLocalDate_of() ===
datum: 2020-04-21
datum: 2040-04-30

 === spelenMetLocalTime_of() ===
tijd: 14:35:45

 === spelenMetLocalDate_of_plus_min(LocalDate datum, LocalDate localDate, int i) ===
localDate.minusDays(i): 2050-01-18
datum: 2040-04-30

 === spelenMetLocalDate_parse_get() ===
datum1: 2020-12-23
datum1.getDayOfWeek(): WEDNESDAY
datum1.getDayOfWeek().getValue(): 3

 === spelenMetLocalDateTime_atTime_arg(LocalDate datum, LocalTime tijd) ===
datum: 2040-04-30
datum.atTime(tijd): 2040-04-30T14:35:45

 === spelenMetLocalDate_of_toEpochDay_LocalDate_now_toEpochDay(LocalDate datum, LocalDateTime nieuweDatum) ===
nieuweDatum: 2040-04-30T14:35:45
datum.toEpochDay(): 25687
LocalDate.now().toEpochDay(): 18458

 === spelenMetLocalDate_now_isAfter(LocalDate datum1) ===
datum1: 2020-12-23
LocalDate.now().isAfter(datum1): false

 === spelenMetPeriod() ===
 === spelenMetPeriod_of_LocalDate_now_plus_min_argperiode() ===
Betaaldatum: 2020-12-14
Verzenddatum: 2020-02-15

 === spelenMetPeriod_parse() ===
period2: P2Y33M7D
Period.parse(p2Y33m2w7d): P2Y33M21D
Period.parse(p234w): P1638D
Period.parse(-p-1y2m-3d): P1Y-2M3D

 === spelenMetPeriod_ofYears_ofMonths_ofDays() ===
Period.ofYears(12).ofMonths(10).ofDays(2): P2D


 === spelenMetDateTimeFormatter(LocalDate datum) ===
dateTimeFormatter.format(datum): 30 april 2040
datum.format(dateTimeFormatter): 30 april 2040

 === spelenMetLocalDate_of_minus() ===
datum.minusDays(1).minusMonths(1): 2020-02-29
 === spelenMetLocalDate_of_plus_min(LocalDate datum, LocalDate localDate, int i) ===
localDate.minusDays(i): 2020-02-29
datum: 2020-02-28

datum.minusMonths(1).minusDays(4): 2020-02-26
 */