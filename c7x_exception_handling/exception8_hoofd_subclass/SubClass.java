package c7x_exception_handling.exception8_hoofd_subclass;

class SubClass extends HoofdClass {

    //SubClass(String naam) throws GeenNaamException{         // exception (als we praten over checked exceptions) moet gelijk of hoger/breder/parent_class zijn van exception gedeclareerd on HoofdClass
    SubClass(String naam) throws Exception {
        // wat staat er impliciet altijd op de eerste regel in de constructor?
        //super(); // voegt feitelijk niks toe, maar staat er impliciet wel
        this.naam = naam.toUpperCase();
    }
}
