package c7x_exception_handling;

import java.io.FileNotFoundException;

class DemoSubClass extends DemoOverriding {

    public int delen(int getal1, int getal2) throws FileNotFoundException {
        return 10 * getal1 / getal2;
    }

//   * overriding regels:
//   * /0 er moet een child <=> parent relatie zijn
//   * /1 zelfde signature (methodeNaam + aantal/type/volgorde parameters zelfde)
//   * /2 access child >= access parent
//   * /3 primitive: return type gelijk zijn; object: child moet covariant zijn van de parent
//   * /4a exception child moet "smaller"/subclass zijn dan/van checked exception in parent; overriding methode kan niet een checked exception introduceren als die niet in the oorspronkelijke methode aanwezig was
}
