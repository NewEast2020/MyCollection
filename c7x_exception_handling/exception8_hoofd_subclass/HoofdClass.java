package c7x_exception_handling.exception8_hoofd_subclass;

class HoofdClass {
    String naam;

    HoofdClass() throws GeenNaamException {
        try {
            naam.length();
        } catch (NullPointerException npe) {
            throw new GeenNaamException();
        }
    }

    HoofdClass(String naam) {
        this.naam = naam;
    }
}
/* uitput
(geen uitvoer)
*/
