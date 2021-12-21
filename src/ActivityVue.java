import java.util.Scanner;

public class ActivityVue {

    public String getName() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir nom : ");
        name = sc.nextLine();
        return name;
    }

    public String isValide() {
        String ok;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inscription ? o/n");
        ok = sc.nextLine();
        return ok;
    }

    public static void affichageActivityTypeCree() {
        System.out.println("Activité créé !");
    }

    public static void affichageActivityTypeError() {
        System.out.println("Activité déja existante !");
    }

}
