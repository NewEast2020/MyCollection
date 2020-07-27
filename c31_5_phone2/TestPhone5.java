package c31_5_phone2;

class TestPhone5 {
    public static void main(String[] args) {
        Phone5 p1 = new Phone5();
        p1.setNumber("987654321");
        System.out.println(p1.phoneNumber); // 123456789
    }
}

class Phone5 {
    String phoneNumber = "123456789";
    void setNumber(String phoneNumber) {
        this.phoneNumber = this.phoneNumber;  // zelf bevestiging. We spreken de instance variabele aan, maar geven die NIET de waarde van de methode variabele!!
        // Krijgt gewoon zijn eigen waarde weer.
    }
}
/*
123456789
 */