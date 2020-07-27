package c31_5_phone2;

class TestPhone6 {
    public static void main(String[] args) {
        Phone6 p1 = new Phone6();
        p1.setNumber("987654321");
        System.out.println(p1.phoneNumber); // 987654321
    }
}

class Phone6 {
    String phoneNumber = "123456789";
    void setNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;  // Dit is de manier waarop het hoort
    }
}
/*
987654321
 */