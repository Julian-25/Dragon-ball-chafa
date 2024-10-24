import java.util.Random;
import java.util.Scanner;

// Clase base del personaje
class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;
    int ataque_especial;
    int curar;
    Random random;

    // Definir constructor
    public Personaje(
            String nombre,
            int fuerza,
            int velocidad,
            int vida_hp, int ataque_especial, int curar) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
        this.curar = curar;
        this.ataque_especial = ataque_especial;
        this.random = new Random();
        }
    public void recibirDaño(double daño){
        daño = fuerza;
        vida_hp -= daño;
        System.out.println(nombre +" ataca a ");
    }
    public void atacar (Personaje npc){
        npc.recibirDaño(fuerza);
        System.out.println(nombre +" recibe un ataque de " );
    }

    public void curar() {
        int curacion = 90; 
        vida_hp += curacion;
        System.out.println(nombre + " se ha curado " + curacion + " puntos de vida. Vida actual: " + vida_hp);
    }
    
    public void ataqueEspecial(Personaje npc){
        System.out.println(nombre +" ha utilizado un ataque especial " +ataque_especial);
        npc.recibirDaño(ataque_especial);
    }

    public void realizarAcciones(Personaje npc){
        int accion = random.nextInt(3);
        switch (accion) {
            case 1:
            atacar(npc);
            break;
            case 2:
            curar();;
            break;
            case 3:
            ataqueEspecial(npc);
            break;
            default:
                break;
        }

    }
}



class Goku extends Personaje {
    // definir el constructor
    public Goku(){

            super("Goku", 80, 350, 250,75,100);
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

            super("Vegeta", 75, 320, 220, 80,90);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}


class Picoro extends Personaje {
    // definir el constructor
    public Picoro (){

            super("Picoro", 55, 150, 200, 75,80);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Gohan extends Personaje {
    // definir el constructor
    public Gohan (){

            super("Gohan", 60, 250, 190, 55,70);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Krillin extends Personaje {
    // definir el constructor
    public Krillin (){

            super("Krillin", 45, 150, 180, 45,50);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Trunks extends Personaje {
    // definir el constructor
    public Trunks (){

            super("Trunks", 65, 300, 200, 60,70);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Ten extends Personaje {
    // definir el constructor
    public Ten (){

            super("Ten", 50, 150, 150, 35,40);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}

class Cell extends Personaje {
    // definir el constructor
    public Cell (){

            super("Cell", 80, 300, 800, 80,68);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}
class Freezer extends Personaje {
    // definir el constructor
    public Freezer (){

            super("Freezer", 65, 250, 750,70, 70);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}
class Numero_17 extends Personaje {
    // definir el constructor
    public Numero_17 (){

            super("Cell", 68, 295, 770, 75,60);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}
class Numero_18 extends Personaje {
    // definir el constructor
    public Numero_18 (){

            super("Cell", 70, 300, 770, 76,60);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " es un guerrero fuerte, reduce el daño recibido.");
        super.recibirDaño(daño / 2); 
    }
}


public class App {
    final static int semillasDelHermitaño = 3;
    final static int curacion = 90;
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
            System.out.println("[FACTOR SECRETO] luego de 10 turnos gohan podrá activar el super sayayin 2, esto hará que el Kame hame ha  baje un total de (150)");
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

        System.out.println("Contra que villano te quieres enfrentar: (1)Cell, (2)Freezer, (3)Androide 18, (4)Androide 17. ");

        int villano = scanner.nextInt();
        Personaje npc = null;

        switch (villano) {
            case 1:
             npc = new Cell();
            System.out.println("El villano elegido será Cell que tiene un total de 800 puntos de vida, su ataques es de 70 y su velocidad de de 300 (Su tecnica especial será Copia, este copiara tu tecnica especial lanzada pero con la leve diferencia que tendra un daño de un total de 80 puntos.)");
            break;
            case 2:
             npc = new Freezer();
            System.out.println("El villano elegido será Freezer que tiene un total de 750 puntos de vida, su ataques es de 65 y su velocidad de de 250 (Su tecnica especial será Death Beam, que tendra un daño de un total de 70 puntos.)");
            break;
            case 3:
             npc = new Numero_17();
            System.out.println("El villano elegido será Androide 17 que tiene un total de 770 puntos de vida, su ataques es de 68 y su velocidad de de 295 (Su tecnica especial será Bombardeo de luz, que tendra un daño de un total de 75 puntos.)");
            break;
            case 4:
             npc = new Numero_18();
            System.out.println("El villano elegido será Androide 18 que tiene un total de 770 puntos de vida, su ataques es de 70 y su velocidad de de 300 (Su tecnica especial será Bala infinita, que tendra un daño de un total de 76 puntos.)");
            break;
        
            default:
                System.out.println("Contricante no encontrado, por defecto se eligirá a Freezer.");
                npc = new Freezer();
                break;
        }

        while (jugador.vida_hp > 0 && npc.vida_hp > 0) {
            int curacionLimite = 0;
            System.out.println("\nTurno del jugador:");
            System.out.println("1. Atacar");
            System.out.println("2. Curarse");
            System.out.println("3. Ataque especial");
            System.out.print("Elija su acción (1-3): ");
            int accionJugador = scanner.nextInt();

            switch (accionJugador) {
                case 1:
                    jugador.atacar(npc);
                    break;
                case 2:
                if (curacionLimite < 3) {
                    jugador.curar();
                  
                     }

                curacionLimite++;

                    break;
                case 3:
                    jugador.ataqueEspecial(npc);
                    break;
                default:
                    System.out.println("Acción no válida.");
                    continue; // Volver a pedir acción
            }

            // Verifica si el NPC ha sido derrotado
            if (npc.vida_hp <= 0) {
                System.out.println(npc.nombre + " ha sido derrotado. ¡Has ganado!");
                break;
            }

            // Turno de la CPU
            System.out.println("\nTurno de " + npc.nombre + ":");
            npc.realizarAcciones(jugador);

            // Verifica si el jugador ha sido derrotado
            if (jugador.vida_hp <= 0) {
                System.out.println(jugador.nombre + " ha sido derrotado. ¡Game Over!");
                break;
            }
        }





    }
}
