// Superclass HillStations
class HillStationsTour {
    void location() {
        System.out.println("Location: Himalayas");
    }
    void famousFor() {
        System.out.println("Famous for: Natural Beauty");
    }
}

// Subclass Manali
class Manali extends HillStationsTour {
    @Override
    void location() {
        System.out.println("Location: Himachal Pradesh, India");
    }
    @Override
    void famousFor() {
        System.out.println("Famous for: Adventure Sports");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStationsTour {
    @Override
    void location() {
        System.out.println("Location: Uttarakhand, India");
    }
    @Override
    void famousFor() {
        System.out.println("Famous for: Lake and Waterfalls");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStationsTour {
    @Override
    void location() {
        System.out.println("Location: Jammu and Kashmir, India");
    }
    @Override
    void famousFor() {
        System.out.println("Famous for: Skiing and Snowfall");
    }
}

public class HillStation {
    public static void main(String[] args) {
        // Calling methods using superclass reference
        HillStationsTour hs = new HillStationsTour();
        hs.location();
        hs.famousFor();

        // Calling methods using subclass references
        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}
