package c31_5_phone2;

class TestPhone1 {
    public static void main(String[] args) {
        Phone1 p1 = new Phone1();
        p1.setNumber();
        System.out.println(p1.phoneNumber); // 123456789
    }
}

class Phone1 {
    String phoneNumber = "123456789";
    void setNumber() {
        String phoneNumber;
        phoneNumber = "987654321"; // setten van de lokale variabele, die eindigt na regel 8
    }
}
/* output
123456789
*/