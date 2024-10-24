import java.util.Scanner;

// Clase base del personaje
class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;
    int ataque_especial;

    // Definir constructor
    public Personaje(
            String nombre,
            int fuerza,
            int velocidad,
            int vida_hp, int ataque_especial) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
        this.ataque_especial = ataque_especial;
    }
    public void recibirDaño(double daño){
        System.out.println(nombre +"ataca a ");
    }
    public void atacar (Personaje fuerza){
        System.out.println(nombre +"recibe un ataque de " );
    }

    public void curar(Personaje vida_hp){
        System.out.println(nombre +"se ha curado: ");
    }
    public void ataqueEspecial(Personaje fuerza){
        System.out.println(nombre +" ha utilizado un ataque especial " +ataque_especial);
    }
}



class Goku extends Personaje {
    // definir el constructor
    public Goku(){

            super("Goku", 80, 350, 250, 75);
    }
    @Override
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Vegeta extends Personaje {
    // definir el constructor
    public Vegeta(){

            super("Vegeta", 75, 320, 220, );
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}


class Picoro extends Personaje {
    // definir el constructor
    public Picoro (){

            super("Picoro", 55, 150, 200);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Gohan extends Personaje {
    // definir el constructor
    public Gohan (){

            super("Gohan", 60, 250, 190);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Krillin extends Personaje {
    // definir el constructor
    public Krillin (){

            super("Krillin", 45, 150, 180);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Trunks extends Personaje {
    // definir el constructor
    public Trunks (){

            super("Trunks", 65, 300, 200);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Ten extends Personaje {
    // definir el constructor
    public Ten (){

            super("Ten", 50, 150, 150);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Freezer extends Personaje {
    // definir el constructor
    public Freezer(String nombre,int fuerza,int velocidad,int vida_hp){
            super("Freezer", fuerza, velocidad, vida_hp);
    }
}


public class App {
    final static double daño = 50.5;
    final static int semillasDelHermitaño = 3;
    public static void main(String[] args) throws Exception {
        System.out.println("Elija su personaje (1)Goku, (2)Vegeta, (3)Picoro, (4)Krillin, (5)Gohan, (6)Ten shin han, (7)Trunks del futuro");
        Scanner scanner = new Scanner(System.in);

        int personaje1 = scanner.nextInt();
        Personaje jugador = null;

        switch (personaje1) {
            case 1:
                jugador = new Goku();
                System.out.println("El personaje elegido será Goku");
                System.out.println("Sus estadisticas y habilidades son: 250HP, 350 de velocidad, defender (dara un 40% de defensa al daño recibido durante ese turno), Super sayayin(Goku aumentará la fuerza de sus golpes base en un 25% durante 5 turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será kamehame ha(el daño será 75 dependiendo si el super sayayin está activo entoces era de 100)");
             break;

             case 2:
             jugador = new Vegeta();
             System.out.println("El personaje elegido será Vegeta");
             System.out.println("Sus estadisticas y habilidades son: 220HP, 320 de velocidad, defender( dara un 37% de defensa al daño recibido durante ese turno) , Super sayayin(Vegeta aumentará la fuerza de sus golpes base en un 20% durante 5 turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será galick gun ha (el daño total 80 dependiendo si el super sayayin está activo entonces sera de 98)");
             break;

             case 3:
             jugador = new Picoro();
             System.out.println("El personaje elegido será Picoro");
             System.out.println("Sus estadisticas y habilidades son: 200HP, 150 de velocidad, defender( dara un 45% de defensa al daño recibido durante ese turno) , Livianez(Picoro se deshará de su capa y sombrero, esto  aumentará su rapidez y el poder de sus golpes de sus golpes base en un 13% durante dos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Makankosappo(el daño total 56 dependiendo si la livianez está activa entonces sera de 75)");
            break;
             case 4:
             jugador = new Krillin();
             System.out.println("El personaje elegido será Krillin");
             System.out.println("Sus estadisticas y habilidades son: 180HP, 150 de velocidad, defender( dara un 25% de defensa al daño recibido durante ese turno) , Artes marciales(Krillin  aumentará el poder de sus golpes de sus golpes base en un 13% durante dos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Kienzan(el daño total 45 dependiendo si las artes marciales están activas entonces sera de 60)");
            break;
            case 5:
            jugador = new Gohan();
            System.out.println("El personaje elegido será Gohan");
            System.out.println("Sus estadisticas y habilidades son: 190 HP, 250 de velocidad, defender( dara un 35% de defensa al daño recibido durante ese turno) , Super sayayin(gohan  aumentará el poder de sus golpes de sus golpes base en un 20% durante 5 turnos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Kame hame ha(el daño total 55 dependiendo si el super sayayin está activo están activas entonces sera de 70)");
            System.out.println("[FACTOR SECRETO] luego de 10 turnos gohan podrá activar el super sayayin 2 que el Kame hame ha (150)");
            case 6:
            jugador = new Ten();
            System.out.println("El personaje elegido será Ten shin han");
            System.out.println("Sus estadisticas y habilidades son: 150HP, 150 de velocidad, defender( dara un 15% de defensa al daño recibido durante ese turno) , Tayioken(Ten shin han hará que el oponente pierda su turno y aumentará el poder de sus golpes de sus golpes base en un 14% durante 3 turnos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Kikoho(el daño total 35 dependiendo si el el tayioken se tiró entonces será 50)");
            break;
            case 7:
            jugador = new Trunks();
            System.out.println("El personaje elegido será Trunks del futuro");
            System.out.println("Sus estadisticas y habilidades son: 200 HP, 300 de velocidad, defender( dara un 35% de defensa al daño recibido durante ese turno) , Super sayayin(Trunks  aumentará el poder de sus golpes de sus golpes base en un 30% durante 5 turnos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Galick gun(el daño total 60 dependiendo si el super sayayin está activo están activas entonces sera de 75)");
            default:
                System.out.println("Personaje no encontrado, se seleccionará goku por defecto");
                System.out.println("Sus estadisticas y habilidades son: 250HP, 350 de velocidad, defender (dara un 40% de defensa al daño recibido durante ese turno), Super sayayin(Goku aumentará la fuerza de sus golpes base en un 25% durante 5 turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será kamehame ha(el daño será 75 dependiendo si el super sayayin está activo entoces era de 100)");
                jugador = new Goku();
                break;
        }






    }
}
