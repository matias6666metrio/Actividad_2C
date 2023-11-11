public class Ejer52 extends base{

    public static void main(String[] args) {
        String resul = "";
        String NJ1 = "";
        String NJ2 = "";
        String NJ3 = "";
        String NJ4 = "";
        String NJ5 = "";
        String NJ6 = "";
        String NJ7 = "";
        String NJ8 = "";
        String GP1 = "";
        String GP2 = "";
        String GP3 = "";
        String GP4 = "";
        String GP5 = "";
        String GP6 = "";
        String GP7 = "";
        System.out.println("Ingrese el nombre de la primera jugadora de tennis: ");
        NJ1 = keyboard.nextLine();
        System.out.println("Ingrese el nombre de la segunda jugadora de tennis: ");
        NJ2 = keyboard.nextLine();
        System.out.println("Ingrese el nombre de la tercera jugadora de tennis: ");
        NJ3 = keyboard.nextLine();
        System.out.println("Ingrese el nombre de la cuarta jugadora de tennis: ");
        NJ4 = keyboard.nextLine();
        System.out.println("Ingrese el nombre de la quinta jugadora de tennis: ");
        NJ5 = keyboard.nextLine();
        System.out.println("Ingrese el nombre de la sexta jugadora de tennis: ");
        NJ6 = keyboard.nextLine();
        System.out.println("Ingrese el nombre de la séptima jugadora de tennis: ");
        NJ7 = keyboard.nextLine();
        System.out.println("Ingrese el nombre de la octava jugadora de tennis: ");
        NJ8 = keyboard.nextLine();
        System.out.println("Partido #1: jugadora: " + NJ1 + " VS " + NJ8);
        System.out.println("Ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();
        if (resul.equals("2-0") || resul.equals("2-1")) {
            GP1 = NJ1;
            System.out.println("La ganadora es: " + GP1);
        } else {
            GP1 = NJ8;
            System.out.println("La ganadora es: " + GP1);
        }
        System.out.println("Partido #2: jugadora: " + NJ4 + " VS " + NJ5);
        System.out.println("Ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();
        if (resul.equals("2-0") || resul.equals("2-1")) {
            GP2 = NJ4;
            System.out.println("La ganadora es: " + GP2);
        } else {
            GP2 = NJ5;
            System.out.println("La ganadora es: " + GP2);
        }
        System.out.println("Partido #3: jugadora: " + NJ6 + " VS " + NJ3);
        System.out.println("Ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();
        if (resul.equals("2-0") || resul.equals("2-1")) {
            GP3 = NJ6;
            System.out.println("La ganadora es: " + GP3);
        } else {
            GP3 = NJ3;
            System.out.println("La ganadora es: " + GP3);
        }
        System.out.println("Partido #4: jugadora: " + NJ7 + " VS " + NJ2);
        System.out.println("Ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();
        if (resul.equals("2-0") || resul.equals("2-1")) {
            GP4 = NJ7;
            System.out.println("La ganadora es: " + GP1);
        } else {
            GP4 = NJ2;
            System.out.println("La ganadora es: " + GP1);
        }
        System.out.println("la semifinal sera: jugadora: " + GP1 + " VS " + GP2);
        System.out.println("Ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();
        if (resul.equals("2-0") || resul.equals("2-1")) {
            GP5 = GP1;
            System.out.println("La ganadora es: " + GP5);
        } else {
            GP5 = GP2;
            System.out.println("La ganadora es: " + GP5);
        }
        System.out.println("la semifinal sera: jugadora: " + GP3 + " VS " + GP4);
        System.out.println("Ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();
        if (resul.equals("2-0") || resul.equals("2-1")) {
            GP6 = GP3;
            System.out.println("La ganadora es: " + GP6);
        } else {
            GP6 = GP4;
            System.out.println("La ganadora es: " + GP6);
        }
        System.out.println("la final sera: jugadora: " + GP5 + " VS " + GP6);
        System.out.println("Ingrese el resultado del partido (2-0, 2-1, 1-2, 0-2)");
        resul = keyboard.nextLine();
        if (resul.equals("2-0") || resul.equals("2-1")) {
            GP7 = GP5;
            System.out.println("La ganadora es: " + GP7+" y es la campeona");
        } else {
            GP7 = GP6;
            System.out.println("La ganadora es: " + GP7+" y es la campeona");
        }
    }
}
