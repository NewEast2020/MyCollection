package plant;

public class SpelenMetPlanten {
    public static void main(String[] args) {
        Plant fuchsia = new Fuchsia(20);
        Plant klimop = new Klimop(50);

        fuchsia.toonHoogtePlant();
        klimop.toonHoogtePlant();

        fuchsia.waterGeven();
        klimop.waterGeven();

        fuchsia.toonHoogtePlant();
        klimop.toonHoogtePlant();

        fuchsia.praatTegenPlant();
        klimop.praatTegenPlant();

        fuchsia.toonHoogtePlant();
        klimop.toonHoogtePlant();
    }
}

