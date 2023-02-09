package javahomework6;
import Notebook;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Asus", 2, 128, "Win10"));
        notebooks.add(new Notebook("Lenovo", 2, 128, "Win10"));
        notebooks.add(new Notebook("Irbis", 2, 256, "Win10"));
        notebooks.add(new Notebook("Dexp", 4, 256, "Win10"));
        notebooks.add(new Notebook("Echips", 4, 512, "Win11"));
        notebooks.add(new Notebook("HP1", 4, 512, "Win11"));
        notebooks.add(new Notebook("HP2",4, 512, "Win11"));
        notebooks.add(new Notebook("HP3", 8, 512, "MacOS"));
        notebooks.add(new Notebook("HP4", 8,1024, "MacOS"));
        notebooks.add(new Notebook("HP5", 8, 1024, "MacOS"));
        filter(notebooks);
    }
    static void filter(Set<Notebook> notebooks){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the laptop shop! ");
        System.out.println("Enter minimal ram: ");
        int minRam = sc.nextInt();
        System.out.println("Enter minimal hdd capacity: ");
        int minHdd = sc.nextInt();
        Set<String> operatingSystems = new HashSet<>();
        for (Notebook nb : notebooks) {
            operatingSystems.add(nb.getOperatingSystem());
        }
        Set<String> desiredOpSystems = new HashSet<>();
        sc.nextLine(); 
        for (String opSystem : operatingSystems){
            System.out.printf("Do you want to include %s operating system in the selection (y/n) ?\n",
            opSystem);       
            if(sc.nextLine().equalsIgnoreCase("y")){
                desiredOpSystems.add(opSystem);
            }
        }
        System.out.println("The list of laptops, satisfying entered conditions:");
        for (Notebook nb : notebooks) {
            if(nb.getRam() >= minRam && nb.getHdd() >= minHdd &&
            desiredOpSystems.contains(nb.operatingSystem) ){
                System.out.printf("%s\n",nb);
            }
        }
        sc.close();
    }
}