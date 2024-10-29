import java.util.Random;
import java.util.Scanner;

class Personaje {
    String nombre;
    double fuerza;
    double velocidad;
    double vida_hp;
    double ataque_especial;
    double curar;
    Random random;
    int curacionLimite;
    boolean transformado;
    int segunda_fase;
    boolean defendiendo;

    public Personaje(
            String nombre,
            double fuerza,
            double velocidad,
            double vida_hp, double ataque_especial, double curar, boolean transformado, int segunda_fase) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
        this.curar = curar;
        this.ataque_especial = ataque_especial;
        this.random = new Random();
        this.curacionLimite = 0;
        this.transformado = transformado;
        this.segunda_fase = segunda_fase;

        }
        public void recibirDaño(double daño) {
            if (defendiendo) {
                daño *= 0.5;
                defendiendo = false;
            }
            vida_hp -= daño;
            System.out.println(nombre + " recibe daño de " + daño + " puntos.");
        }
        

public void atacar(Personaje npc) {
    System.out.println(nombre + " ataca con una fuerza de: " + fuerza);
    npc.recibirDaño(fuerza);
}
public void defender() {
    System.out.println(nombre + " se prepara para defenderse. Reduciendo el daño recibido.");
    defendiendo = true; 
}


    public void curar() {
        if (curacionLimite < 3) {
            int curacion = 90; 
            vida_hp += curacion;
            System.out.println(nombre + " se ha curado " + curacion + " puntos de vida. Vida actual: " + vida_hp);
            curacionLimite++; 
        } else {
            System.out.println("Ya has alcanzado el límite de curaciones.");
        }
    }
    
    public void ataqueEspecial(Personaje npc){
        System.out.println(nombre + " ha utilizado su ataque especial con un daño de: " + ataque_especial);
        npc.recibirDaño(ataque_especial);
        
        
    }

    public void transformar() {
        if (!transformado) {
            vida_hp += 150;
            fuerza += segunda_fase ; 
            transformado = true;
            System.out.println(nombre + " se ha transformado! Fuerza amuentada.");
        } else {
            System.out.println(nombre + " ya está transformado.");
        }
    }

    public void realizarAcciones(Personaje npc){
        int accion = random.nextInt(3);
        switch (accion) {
            case 0:
            atacar(npc);
            break;
            case 1:
            if (curacionLimite < 3) {
                curar();
            }else{
                realizarAcciones(npc);
            };
            break;
            case 2:
            ataqueEspecial(npc);
            break;
            case 3: 
            defender();
            break;
            default:
                break;
        }

    }
}



class Goku extends Personaje {
    public Goku(){

            super("Goku", 80, 350, 250,75,100, false, 20 );
    }
    @Override
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
    @override
    public void transformar() {
        super.transformar();
        if (transformado) {
            fuerza *= 1.25; 
            ataque_especial *= 1.25; 
            System.out.println(nombre + " ahora tiene una fuerza de: " + fuerza);
        }
    }
}

class Vegeta extends Personaje {
    // definir el constructor
    public Vegeta(){

            super("Vegeta", 75, 320, 220, 80,90, false, 18);
    }
    @override
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
    @override
    public void transformar() {
        super.transformar();
        if (transformado) {
            fuerza *= 1.20; 
            ataque_especial *= 1.20; 
            System.out.println(nombre + " ahora tiene una fuerza de: " + fuerza);
        }
    }
}


class Picoro extends Personaje {
    public Picoro (){

            super("Picoro", 55, 150, 200, 75,80, false, 13);
    }
    @override
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
    @override
    public void transformar() {
        super.transformar();
        if (transformado) {
            fuerza *= 1.13;
            ataque_especial *= 1.13;
            System.out.println(nombre + " ahora tiene una fuerza de: " + fuerza);
        }
    }
}

class Gohan extends Personaje {
    public Gohan() {
        super("Gohan", 60, 250, 390, 55, 70, false, 7);
    }
    @override
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
    @override
    public void transformar() {
        if (vida_hp > 0) {
            ataque_especial += 80;
            vida_hp += 200;
            fuerza += 30; 
            System.out.println(nombre + " se ha transformado en Super Saiyajin 2! Fuerza, ataque especial y vida aumentados!!");
        } else {
            System.out.println(nombre + " no puede transformarse en estado crítico.");
        }
    }
}

class Krillin extends Personaje {
    public Krillin (){

            super("Krillin", 45, 150, 180, 45,50, false, 6);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
    @override
    public void transformar() {
        super.transformar();
        if (transformado) {
            fuerza *= 1.06;
            ataque_especial *= 1.06;
            System.out.println(nombre + " ahora tiene una fuerza de: " + fuerza);
        }
    }
}

class Trunks extends Personaje {
    public Trunks (){

            super("Trunks", 65, 300, 200, 60,70, false, 20);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
    @override
    public void transformar() {
        super.transformar();
        if (transformado) {
            fuerza *= 1.20;
            ataque_especial *= 1.20;
            System.out.println(nombre + " ahora tiene una fuerza de: " + fuerza);
        }
    }
}

class Ten extends Personaje {

    public Ten (){

            super("Ten", 50, 150, 150, 35,40, false, 7);
    }
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
    @override
    public void transformar() {
        super.transformar();
        if (transformado) {
            fuerza *= 1.20;
            ataque_especial *= 1.20;
            System.out.println(nombre + " ahora tiene una fuerza de: " + fuerza);
        }
    }
}

class Cell extends Personaje {
    public Cell (){

            super("Cell", 80, 300, 800, 80,68, false, 0 );
    }
    @override
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
}
class Freezer extends Personaje {
    public Freezer (){

            super("Freezer", 65, 250, 750,70, 70, false, 0);
    }
    @Override
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
}
class Numero_17 extends Personaje {
    public Numero_17 (){

            super("Numero 17", 68, 295, 770, 75,60, false, 0);
    }
    @override
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
    }
}
class Numero_18 extends Personaje {

    public Numero_18 (){

            super("Numero 18", 70, 300, 770, 76,60, false, 0);
    }
    @override
    public void recibirDaño(double daño) {
        System.out.println(nombre + " ha recibido daño.");
        super.recibirDaño(daño); 
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
                System.out.println("Estadisticas:");
                System.out.println("Fuerza:80");
                System.out.println("Velocidad:350");
                System.out.println("HP:250");
                System.out.println("Ataque especial: Kame Hame ha(-75HP)");
                System.out.println("Transformacion: Super sayayin(Goku aumentará la fuerza de sus golpes base en un 25%)");
             break;

             case 2:
             jugador = new Vegeta();
             System.out.println("El personaje elegido será Vegeta");
             System.out.println("Estadisticas:");
             System.out.println("Fuerza:75");
             System.out.println("Velocidad:350");
             System.out.println("HP:250");
             System.out.println("Ataque especial: Galick gun (-80)");
             System.out.println("Transformacion: Super sayayin(Vegeta aumentará la fuerza de sus golpes base en un 20%)");
             break;

             case 3:
             jugador = new Picoro();
             System.out.println("El personaje elegido será Picoro");
             System.out.println("Estadisticas:");
             System.out.println("Fuerza:55");
             System.out.println("Velocidad:150");
             System.out.println("HP:200");
             System.out.println("Ataque especial: Makankosappo (-75)");
             System.out.println("Transformacion: Livianez(Picoro aumentará la fuerza de sus golpes base en un 13%)");
            break;
             case 4:
             jugador = new Krillin();
             System.out.println("El personaje elegido será Krillin");
             System.out.println("Estadisticas:");
             System.out.println("Fuerza:45");
             System.out.println("Velocidad:150");
             System.out.println("HP:180");
             System.out.println("Ataque especial: Kienzan (-45)");
             System.out.println("Transformacion: Artes marciales(Krillin aumentará la fuerza de sus golpes base en un 6%)");
            break;
            case 5:
            jugador = new Gohan();
            System.out.println("El personaje elegido será Gohan");
            System.out.println("Estadisticas:");
            System.out.println("Fuerza:45");
            System.out.println("Velocidad:250");
            System.out.println("HP:190");
            System.out.println("Ataque especial: Kame hame ha (-45)");
            System.out.println("Transformacion: Super sayayin(Gohan aumentará la fuerza de sus golpes base en un 20%)");
            System.out.println("[FACTOR SECRETO] luego de 7 turnos gohan podrá activar el super sayayin 2, esto hará que el Kame hame ha  baje un total de (150)");
            break;
            case 6:
            jugador = new Ten();
            System.out.println("El personaje elegido será Ten shin han");
            System.out.println("El personaje elegido será Gohan");
            System.out.println("Estadisticas:");
            System.out.println("Fuerza:50");
            System.out.println("Velocidad:150");
            System.out.println("HP:150");
            System.out.println("Ataque especial: Kiko ho (-35)");
            System.out.println("Transformacion: Tercer ojo(Ten shin han aumentará la fuerza de sus golpes base en un 7%)");
            break;
            case 7:
            jugador = new Trunks();
            System.out.println("El personaje elegido será Trunks del futuro");
            System.out.println("Estadisticas:");
            System.out.println("Fuerza:65");
            System.out.println("Velocidad:300");
            System.out.println("HP:200");
            System.out.println("Ataque especial: Galick gun (-60)");
            System.out.println("Transformacion: Super sayayin(Trunks aumentará la fuerza de sus golpes base en un 20%)");
            break;
            default:
                System.out.println("Personaje no encontrado, se seleccionará goku por defecto");
                System.out.println("Sus estadisticas y habilidades son: 250HP, 350 de velocidad, defender (dara un 40% de defensa al daño recibido durante ese turno), Super sayayin(Goku aumentará la fuerza de sus golpes base en un 25% durante 5 turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será kamehame ha(el daño será 75 dependiendo si el super sayayin está activo entoces era de 100)");
                jugador = new Goku();
                System.out.println("Estadisticas:");
                System.out.println("Fuerza:80");
                System.out.println("Velocidad:350");
                System.out.println("HP:250");
                System.out.println("Ataque especial: Kame Hame ha(-75HP)");
                System.out.println("Transformacion: Super sayayin(Goku aumentará la fuerza de sus golpes base en un 25%)");
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

        int ronda = 1;

        while (jugador.vida_hp > 0 && npc.vida_hp > 0) {
            System.out.println("\nTurno del jugador:");
            System.out.println("Ronda: " + ronda);
            System.out.println("1. Atacar");
            System.out.println("2. Curarse");
            System.out.println("3. Ataque especial");
            System.out.println("4. Defenderse");

            if (ronda >= 3 && (jugador instanceof Goku || jugador instanceof Vegeta || jugador instanceof Trunks)) {
                System.out.println("5. Transformar en super sayayin");
            } else if (ronda >= 7 && jugador instanceof Gohan) {
                System.out.println("5. [FACTOR SECRETO] Transformarse en ssj2");
            } else if (ronda >= 3 && (jugador instanceof Picoro || jugador instanceof Krillin || jugador instanceof Ten)) {
                System.out.println("5. Transformarse");
            }

            int accionJugador = scanner.nextInt();

            switch (accionJugador) {
                case 1:
                    jugador.atacar(npc);
                    break;
                case 2:
                    jugador.curar();
                    break;
                case 3:
                    jugador.ataqueEspecial(npc);
                    break;

                case 4:
                jugador.defender();
                break;

                case 5:
                    if (ronda >= 7 && jugador instanceof Gohan) {
                        ((Gohan) jugador).transformar();
                    } else if (ronda % 3 == 0) {
                        jugador.transformar();
                    } else {
                        System.out.println("No puedes transformarte en esta ronda.");
                    }
                    break;
                default:
                    System.out.println("Acción no válida.");
                    continue; 
            }

            if (npc.vida_hp <= 0) {
                System.out.println(npc.nombre + " ha sido derrotado. ¡Has ganado!");
                break;
            }

            System.out.println("\nTurno de " + npc.nombre + ":");
            npc.realizarAcciones(jugador);
            if (jugador.vida_hp <= 0) {
                System.out.println(jugador.nombre + " ha sido derrotado. ¡Game Over!");
                break;
            }
            System.out.println(jugador.nombre + " HP: " + jugador.vida_hp );
            System.out.println(npc.nombre + " HP: " + npc.vida_hp);

            
            ronda++;
        }

        scanner.close();
    }
    }
