package c31_5_phone2;

class TestPhone3 {
    public static void main(String[] args) {
        Phone3 p1 = new Phone3();
        p1.setNumber();
        System.out.println(p1.phoneNumber); // 987654321
    }
}

class Phone3 {
    String phoneNumber = "123456789";
    void setNumber() {
        String phoneNumber;
        this.phoneNumber = "987654321"; // setten van de instance variabele // this MOET nu om de instance variabele te kunnen benaderen (shadowing)
    }
}
/*
987654321
 */