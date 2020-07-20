package c21_primitive_variables;

public class Primitive_Variables {
    public static void main(String[] args) {
//        byte b = 524; // Dit kan niet, want 412 valt buiten de byte range
// byte range loopt van -128 t/m 127 (-2^7 t/m 2^7-1). byte = 8 bits, dus 2^8 = 256 combinaties.
        byte b = 125; // 125 wordt herkend als int
        System.out.println("b = " + b);
        b++;
        System.out.println("b = " + b);
        b++;
        System.out.println("b = " + b);
        b++; // b was 127, 1 erbij optellen zorgt ervoor dat b -128 wordt. Geen error, maar verhaal begint van voor af aan
        System.out.println("b = " + b);

        short s = 32767; // 2^16; -32.768 t/m 32.767 => dit wordt NIET gevraagd, wel 16 bits!
        // buiten de range => compile error
//        int i = 5247892787; // 2^32; // valt buiten de range
//        long l = 5247892787; // valt binnen range, dit is dus geen geldige int, maar met toevoeging van l of L maak ik er een long van.
        long l = 5247892787L;
        l = 123l;
//         byte bb = 125l; // Een long waarde past niet in een byte of int, ook al zou het qua waarde wel passen, want 125 valt binnen de byte range
//        int ii = 125l; // compileert niet

        byte bbb = 0b0111_1111; // dit is een integer literal in binaire vorm. de _ is voor de leesbaarheid. 0b geeft aan dat het om een binaire waarde gaat)
        System.out.println("bbb = " + bbb); //127 in binaire vorm, maar wordt altijd decimaal getoond!
        bbb = -0b1000_0000; // -128
        short s2 = 0b1000_0000;
        System.out.println("s2 = " + s2);

        bbb = 010;  // de 1e 0 geeft aan dat het octaal is!
        System.out.println("bbb = " + bbb);

        bbb = 0x1a; // 10 hexadecimaal is 16 decimaal en a hexadecimaal is 10 decimaal. 16 + 10 = 26.
        System.out.println("bbb = " + bbb);

        int getal = 1__5;

        long var1 = 0_100_267_760;
//        long var2 = 0_x_4_13;
//        long var3 = 0b_x10_B_75;
//        long var4 = 0b_100000_10_11;
//        long var5 = 0xa10_AG_75;
        long var6 = 0x1_0000_10;
        long var7 = 100__12_12;
        int mijnSalaris = 10_0_0_00_0_000;

//        float f = 2.4; // Dit compileert niet!!! moet f zijn. double past als type niet in de float, ook al zou het qua waarde wel passen.
        // 2.4 wordt gezien door de compiler als een double!!
        float f = 24;
        f = 2.f;  // 2.f is voldoende. is gelijk aan 2.0f. 2 => int 2. => double (gaat niet) 2.f => float
        f = 234567899; // we raken nauwkeurigheid kwijt!!
        System.out.println("f = " + f);

        double d = 24.23789D; // D mag, maar hoeft niet!!
        d = 24f;

        char c = 'D';
        System.out.println("c = " + c);

        c = '\u0a5c';
        System.out.println("c = " + c);

        c = '\u0122'; // hexadecimaal!
        System.out.println("c = " + c);

        c = 122; // 122e plek uit unicode tabel
        System.out.println("c = " + c);
        c--;
        System.out.println("c = " + c);
        c = '\u007a'; // z via unicode tabel verwijzing
        System.out.println("c = " + c);

        c = 122;
        System.out.println("c = " + c);

        int getal1 = 12;
        char char1 = 12;
        getal1 = char1; // char is 16 bits (unsigned, oftewel kan niet negatief zijn), past altijd wel in een int variabele
//         char1 = getal1; // int past niet in een char

        c = 5;
        System.out.println("c = " + c);
        c = '5';
        System.out.println("c = " + c);
        int plekInTabel = '5'; // Dit mag, want alle char velden worden direct omgezet naar een int waarde;
        System.out.println("plekInTabel = " + plekInTabel);

        int kleinGetal = 10;
        char teken = 10;
//        short s3 = kleinGetal;
//        teken = kleinGetal;

        final int kleinGetalAlsFinal = 10; // !Final waarde! Dus kan niet gewijzigd worden, dus compiler zal overal waar kleinGetalAlsFinal
        // staat, dit vervangen door 10;
        teken = kleinGetalAlsFinal;

        short s4 = 14;
        char c4 = 14;
//         s4 = c4; // short & char zijn beiden 16 bits, maar bereik overlapt voor de helft niet! Compiler weet het dus niet, dus compileert niet.
//         c4 = s4;

//        c4 = b; compileert ook niet! (Zie plaatje) byte kan negatief zijn en negatieve waarden passen niet in een char (unsigned)
    }
}

/* output
b = 125
b = 126
b = 127
b = -128
bbb = 127
s2 = 128
bbb = 8
bbb = 26
f = 2.34567904E8
c = D
c = ੜ
c = Ģ
c = z
c = y
c = z
c = z
c = 
c = 5
plekInTabel = 53
*/