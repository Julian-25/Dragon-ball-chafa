import java.util.Scanner;

// Clase base del personaje
class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;

    // Definir constructor
    public Personaje(
            String nombre,
            int fuerza,
            int velocidad,
            int vida_hp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
    }
}

class SuperHero extends Personaje {
    // definir el constructor
    public SuperHero(
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp){
            super(nombre, fuerza, velocidad, vida_hp);
    }
}

class Villano extends Personaje {
    // definir el constructor
    public Villano(
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp){
            super(nombre, fuerza, velocidad, vida_hp);
    }
}


public class App {
    final static int semillasDelHermitaño = 3;
    public static void main(String[] args) throws Exception {
        System.out.println("Elija su personaje (1)Goku, (2)Vegeta, (3)Picoro, (4)Krillin, (5)Gohan, (6)Ten shin han, (7)Trunks del futuro");
        Scanner scanner = new Scanner(System.in);

        int personaje1 = scanner.nextInt();

        switch (personaje1) {
            case 1:
                System.out.println("El personaje elegido será Goku");
                System.out.println("Sus estadisticas y habilidades son: 250HP, 350 de velocidad, defender (dara un 40% de defensa al daño recibido durante ese turno), Super sayayin(Goku aumentará la fuerza de sus golpes base en un 25% durante 5 turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será kamehame ha(el daño será 75 dependiendo si el super sayayin está activo entoces era de 100)");
             break;

             case 2:
             System.out.println("El personaje elegido será Vegeta");
             System.out.println("Sus estadisticas y habilidades son: 220HP, 320 de velocidad, defender( dara un 37% de defensa al daño recibido durante ese turno) , Super sayayin(Vegeta aumentará la fuerza de sus golpes base en un 20% durante 5 turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será galick gun ha (el daño total 80 dependiendo si el super sayayin está activo entonces sera de 98)");
             break;

             case 3:
             System.out.println("El personaje elegido será Picoro");
             System.out.println("Sus estadisticas y habilidades son: 200HP, 150 de velocidad, defender( dara un 45% de defensa al daño recibido durante ese turno) , Livianez(Picoro se deshará de su capa y sombrero, esto  aumentará su rapidez y el poder de sus golpes de sus golpes base en un 13% durante dos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Makankosappo(el daño total 56 dependiendo si la livianez está activa entonces sera de 75)");
            break;
             case 4:
             System.out.println("El personaje elegido será Krillin");
             System.out.println("Sus estadisticas y habilidades son: 180HP, 150 de velocidad, defender( dara un 25% de defensa al daño recibido durante ese turno) , Artes marciales(Krillin  aumentará el poder de sus golpes de sus golpes base en un 13% durante dos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Kienzan(el daño total 45 dependiendo si las artes marciales están activas entonces sera de 60)");
            break;
            case 5:
            System.out.println("El personaje elegido será Gohan");
            System.out.println("Sus estadisticas y habilidades son: 190 HP, 250 de velocidad, defender( dara un 35% de defensa al daño recibido durante ese turno) , Super sayayin(gohan  aumentará el poder de sus golpes de sus golpes base en un 20% durante 5 turnos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Kame hame ha(el daño total 55 dependiendo si el super sayayin está activo están activas entonces sera de 70)");
            System.out.println("[FACTOR SECRETO] luego de 10 turnos gohan podrá activar el super sayayin 2 que el Kame hame ha (150)");
            case 6:
            System.out.println("El personaje elegido será Ten shin han");
            System.out.println("Sus estadisticas y habilidades son: 150HP, 150 de velocidad, defender( dara un 15% de defensa al daño recibido durante ese turno) , Tayioken(Ten shin han hará que el oponente pierda su turno y aumentará el poder de sus golpes de sus golpes base en un 14% durante 3 turnos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Kikoho(el daño total 35 dependiendo si el el tayioken se tiró entonces será 50)");
            break;
            case 7:
            System.out.println("El personaje elegido será Trunks del futuro");
            System.out.println("Sus estadisticas y habilidades son: 200 HP, 300 de velocidad, defender( dara un 35% de defensa al daño recibido durante ese turno) , Super sayayin(Trunks  aumentará el poder de sus golpes de sus golpes base en un 30% durante 5 turnos turnos) , semilla del hermitaño curará 25 o hasta 40% (La curacion dependerá de la vida del personaje) y su ataque especial será  Galick gun(el daño total 60 dependiendo si el super sayayin está activo están activas entonces sera de 75)");
            default:
                System.out.println("Personaje no encontrado");
                break;
        }

        


    }
}
