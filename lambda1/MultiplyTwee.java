package lambda1;

class MultiplyTwee implements MyFunctionalInterface {
    @Override
    public void verwerk(int getal) {
        System.out.println(" === MultiplyMetTwee implements MyFunctionalInterface === ");
        System.out.println("     === verwerk getal = " + getal);
        System.out.println("     " + getal + " * 2 = " + (getal * 2));
    }
}
