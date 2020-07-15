package kalender;

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
        //        LocalDate datum = new LocalDate(); // examen instinker. De constructor is private
        LocalDate datum;
        datum = LocalDate.of(2020, 4, 21);
        System.out.println(datum);
        datum = LocalDate.of(2040,4, 30);
        datum = LocalDate.of(2040, Month.APRIL, 30);
        System.out.println(datum);
        return datum;
    }

    private static LocalTime spelenMetLocalTime_of() {
        LocalTime tijd = LocalTime.of(14, 35, 45); // geen seconden, dan wordt deze ook niet geprint
        System.out.println(tijd);
        return tijd;
    }

    private static void spelenMetLocalDate_of_plus_min(LocalDate datum, LocalDate localDate, int i) {
        //        LocalDateTime test = LocalDate.of(1212,12,12); // Dit zal NOOIT compileren
        System.out.println(localDate.minusDays(i)); // 18 jan 2050 // methode aanroep levert ALTIJD een nieuwe instantie op
        // datum = datum.plusYears(10);
        // datum = datum.plusMonths(-3);
        System.out.println(datum); // immutable, dus originele waarde, want de return value is niet opgevangen in de orv datum
    }

    private static LocalDate spelenMetLocalDate_parse_get() {
        LocalDate datum1 = LocalDate.parse("2020-12-23"); // "2020-13-23" of "2020-1-23" leveren beiden een DateTimeParseException op.
        System.out.println(datum1);
        System.out.println(datum1.getDayOfWeek());
        System.out.println(datum1.getDayOfWeek().getValue()); // maandag is 1
        return datum1;
    }

    private static LocalDateTime SpelenMetLocalDateTime_atTime_arg(LocalDate datum, LocalTime tijd) {
        System.out.println("--------");
        System.out.println(datum);
        System.out.println(datum.atTime(tijd)); //
        return datum.atTime(tijd);
    }

    private static void spelenMetLocalDate_of_toEpochDay_LocalDate_now_toEpochDay(LocalDate datum, LocalDateTime nieuweDatum) {
        System.out.println(nieuweDatum);
        System.out.println(datum.toEpochDay()); // Bij LocalDate kun je toEopochDay gebruiken => aantal dagen vanaf 1 januari 1970
        System.out.println(LocalDate.now().toEpochDay());
    }

    private static void spelenMetLocalDate_now_isAfter(LocalDate datum1) {
        System.out.println("----------------");
        System.out.println(datum1);
        System.out.println(LocalDate.now().isAfter(datum1)); // false, dan ligt datum1 nog in de toekomst
    }

    private static void spelenMetPeriod() {
        System.out.println("Periods");
        Period periode = Period.of(0, 2, 90);
        System.out.println("Betaaldatum: " + LocalDate.now().plus(periode)); // met plus kan ik een periode bij een datum optellen
        System.out.println("Verzenddatum: " + LocalDate.now().minus(periode));

        Period period2 = Period.parse("p2Y33m7d"); //"p2Y7d33m" levert een DateTimeParseException op.
        System.out.println(period2);
        period2 = Period.parse("p2Y33m2w7d"); // van W(-eken) maakt hij altijd dagen // volgorde van groot naar klein
        System.out.println(period2);
        period2 = Period.parse("p234w"); // van W(-eken) maakt hij altijd dagen
        System.out.println(period2);
        period2 = Period.parse("-p-1y2m-3d"); // -y mag niet, moet dan -1y zijn
        System.out.println("-p-1y2m-3d => " + period2);

        periode = Period.ofYears(12).ofMonths(10).ofDays(2);
        System.out.println(periode); // Wat is hier de uitkomst van? P12Y10M2D P2D
        Period.ofYears(12);
    }

    private static void spelenMetDateTimeFormatter(LocalDate datum) {
        //        LocalDate.plus() // compileert niet, want de methode is niet static. Dit MOET vanuit een instantie
        // je gebruikt altijd DateTimeFormatter (geen specifieke DateFormatter of zo)
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG); // gebruik je een ofLocalizedTime of DateTime, dan gaat het mis!!
        System.out.println(dateTimeFormatter.format(datum));
        System.out.println(datum.format(dateTimeFormatter)); // kan twee kanten op! LocalDate heeft een methode format en DateTimeFormatter dus ook
        // de formatter moet afgestemd zijn op hetgene dat je erin wilt stoppen. Gebruik je ofLocalizesDateTime, dan wordt er ook een DateTime verwacht
    }

    private static void spelenMetLocalDate_of_minus() {
        LocalDate datum;// De afsluiter
        datum = LocalDate.of(2020, 4, 1); // april 30 dagen, maart 31 dagen, feb 29 dagen
        System.out.println(datum.minusDays(1).minusMonths(1)); // van 1 april, naar 31 maart, naar 29 feb.... uitvoeren methodes van links naar rechts
        spelenMetLocalDate_of_plus_min(datum.minusDays(4).minusMonths(1), datum.minusMonths(1), 1);
        System.out.println(datum.minusMonths(1).minusDays(4)); // van 1 april, naar 1 maart, naar 26 feb.
    }
}
