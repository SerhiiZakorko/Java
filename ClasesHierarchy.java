package HW;

public class ClasesHierarchy {
    public static void main(String[] args) {
        Ukraine u = new Ukraine();
        System.out.println(u);
        System.out.println("Столица " + u.capital);
        System.out.println("Образована в " + u.since + " году");
        System.out.println("Площадь территории " + u.square + " кв. км.");
        u.helloR();
        u.helloU();
        System.out.println();

        Kharkiv kh = new Kharkiv();
        System.out.println(kh);
        System.out.println("Город " + kh.name);
        System.out.println("Основан в " + kh.since + " году");
        System.out.println("Площадь территории " + kh.square + " кв. км.");
        kh.helloR();
        System.out.println();

        Uzhgorod uzh = new Uzhgorod();
        System.out.println(uzh);
        System.out.println("Город " + uzh.name);
        System.out.println("Основан в " + uzh.since + " году");
        System.out.println("Площадь территории " + uzh.square + " кв. км.");
        uzh.helloU();
        System.out.println();
    }
}

class Ukraine {
    String capital = "Kyiv";
    int since = 1991;
    int square = 603549;

    public void helloR() {
        System.out.println("Здравствуйте, добрый день");
    }

    public void helloU() {
        System.out.println("Вiтаю, доброго дня!");
    }
}

class KharkivRegion extends Ukraine {
    String capital = "Kharkiv";
    int since = 1932;
    int square = 31418;

    public void helloR() {
        System.out.println("Здравствуйте, добрый день");
    }
}

class LuhanskyRegion extends Ukraine {
    String capital = "Luhansk";
    int since = 1938;
    int square = 26683;

    public void helloR() {
        System.out.println("Здравствуйте, добрый день");
    }
}

class ZakarpatskyRegion extends Ukraine {
    String capital = "Uzhgorod";
    int since = 1946;
    int square = 12753;

    public void helloU() {
        System.out.println("Вiтаю, доброго дня!");
    }
}

class Kharkiv extends KharkivRegion {
    String name = "Kharkiv";
    int since = 1654;
    int square = 350;

    public void helloR() {
        System.out.println("Добро пожаловать в Харьков!");
    }
}

class Izium extends KharkivRegion {
    String name = "Izium";
    int since = 1681;
    int square = 41;

    public void helloR() {
        System.out.println("Добро пожаловать в Изюм!");
    }
}

class Luhansk extends LuhanskyRegion {
    String name = "Luhansk";
    int since = 1795;
    int square = 269;

    public void helloR() {
        System.out.println("Добро пожаловать в Луганск!");
    }
}

class Kreminna extends LuhanskyRegion {
    String name = "Kreminna";
    int since = 1733;
    int square = 16;

    public void helloR() {
        System.out.println("Добро пожаловать в Кременную!");
    }
}

class Uzhgorod extends ZakarpatskyRegion {
    String name = "Uzhgorod";
    int since = 872;
    int square = 60;

    public void helloU() {
        System.out.println("Вiтаю в Ужгородi!");
    }
}

class Chop extends ZakarpatskyRegion {
    String name = "Chop";
    int since = 1281;
    int square = 6;

    public void helloU() {
        System.out.println("Вiтаю в Чопi!");
    }
}

interface RussianSpeaking {
    void helloR();
}

interface UkrainianSpeaking {
    void helloU();
}