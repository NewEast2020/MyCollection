package c31_5_phone2;

class TestPhone4 {
    public static void main(String[] args) {
        Phone4 p1 = new Phone4();
        p1.setNumber("987654321");
        System.out.println(p1.phoneNumber); // 123456789
    }
}

class Phone4 {
    String phoneNumber = "123456789";
    void setNumber(String phoneNumber) {
        phoneNumber = phoneNumber;  // zelf bevestiging. Je verandert hier NIET de instance variabele
    }
}
/*
123456789
 */