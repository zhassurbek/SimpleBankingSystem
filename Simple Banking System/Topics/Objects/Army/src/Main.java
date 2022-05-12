import javax.print.Doc;

class Army {

    public static void createArmy() {

        Unit u1 = new Unit("u1");
        Unit u2 = new Unit("u2");
        Unit u3 = new Unit("u3");
        Unit u4 = new Unit("u4");
        Unit u5 = new Unit("u5");

        Knight knight1 = new Knight("k1");
        Knight knight2 = new Knight("k2");
        Knight knight3 = new Knight("k3");

        General general = new General("g1");

        Doctor d1 = new Doctor("d1");

    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}