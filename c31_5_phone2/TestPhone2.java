package c31_5_phone2;

class TestPhone2 {
    public static void main(String[] args) {
        Phone2 p1 = new Phone2();
        p1.setNumber();
        System.out.println(p1.phoneNumber); // 987654321
    }
}

class Phone2 {
    String phoneNumber = "123456789";
    void setNumber() {
//        String phoneNumber;
        phoneNumber = "987654321"; // setten van de instance variabele
    }
}
/*
987654321
 */