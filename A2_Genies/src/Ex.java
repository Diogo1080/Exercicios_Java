import typesofgenies.DemonGenie;
import typesofgenies.Genie;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Lamp[] lamps = new Lamp[0];
        Lamp currentLamp = null;

        Genie genie = null;

        int currentLampPossition = 0;
        int choice = 10;

        while (choice != 0) {
            //Menu
            if (currentLampPossition == 0) {
                System.out.println("Lamp");
            } else {
                System.out.println("Lamp(" + currentLampPossition + " of " + lamps.length + ")");
            }

            System.out.println(" 1- Create lamp ");
            System.out.println(" 2- Select lamp ");
            System.out.println(" 3- Compare with other lamp");

            if (genie != null) {
                System.out.println("Genie(" + genie.toString() + ")");
            } else {
                System.out.println("Genie");
            }

            System.out.println(" 4- Rub lamp ");
            System.out.println(" 5- Make Wish ");
            if (genie instanceof DemonGenie) {
                System.out.println(" 6- Reset lamp ");
            }
            System.out.println(" 0- Exit ");
            System.out.println("_________________________");


            choice = scan.nextInt();  // Read user input
            switch (choice) {
                case 1:
                    lamps = addLampToArray(lamps);
                    System.out.println("Lamp created");
                    break;
                case 2:
                    if (lamps.length < 1) {
                        System.out.println("You haven't created lamps yet!");
                        break;
                    }
                    if (lamps.length == 1) {
                        currentLampPossition = 1;
                        currentLamp = lamps[0];
                        break;
                    }

                    int lampChosen;

                    do {
                        System.out.println("Select 0 to cancel");
                        System.out.println("Select Lamp (1 - " + lamps.length + "): ");

                        lampChosen = scan.nextInt();

                    } while (lampChosen > lamps.length);

                    if (lampChosen == 0) {
                        break;
                    }

                    currentLampPossition = lampChosen;
                    currentLamp = lamps[lampChosen - 1];
                    break;

                case 4:
                    if (currentLamp == null) {
                        System.out.println("You haven't created or selected any lamp.");
                        break;
                    }
                    genie = currentLamp.rub();
                    break;

                case 3:
                    if (lamps.length < 2) {
                        System.out.println("You need at least 2 lamps to compare");
                        break;
                    }
                    if (currentLamp == null) {
                        System.out.println("You haven't created or selected any lamp.");
                        break;
                    }


                    if (lamps.length == 2) {
                        if (currentLampPossition == 1) {
                            lampChosen = 2;
                        } else {
                            lampChosen = 1;
                        }
                    } else {
                        do {
                            System.out.println("Selected lamp: " + (currentLampPossition - 1));
                            System.out.println("Select 0 to cancel");
                            System.out.println("Select Lamp (1 - " + lamps.length + "): ");

                            lampChosen = scan.nextInt();

                        } while (lampChosen > lamps.length || lampChosen == currentLampPossition);
                        if (lampChosen == 0) {
                            break;
                        }
                    }
                    System.out.println("\n");
                    System.out.println("Stats of Lamp(" + currentLampPossition + " of " + lamps.length + ") compared to Lamp(" + lampChosen + " of " + lamps.length + ")");
                    System.out.println("Max number of genies: " + lamps[currentLampPossition - 1].numberOfGenies + " -- " + lamps[lampChosen - 1].numberOfGenies);
                    System.out.println("Number of times reseted: " + lamps[currentLampPossition - 1].numberOfTimesRecycled + " -- " + lamps[lampChosen - 1].numberOfTimesRecycled);
                    System.out.println("Number of remaining genies: " + (lamps[currentLampPossition - 1].numberOfGenies - lamps[currentLampPossition - 1].geniesInitiated) + " -- " + (lamps[lampChosen - 1].numberOfGenies - lamps[lampChosen - 1].geniesInitiated));
                    break;

                case 5:
                    if (currentLamp == null) {
                        System.out.println("You haven't created or selected any lamp.");
                        break;
                    }

                    if (genie == null) {
                        System.out.println("You haven't summoned a genie yet.");
                        break;
                    }

                    genie.makeWish();
                    break;

                case 6:
                    if (!(genie instanceof DemonGenie)) {
                        if (currentLamp == null) {
                            System.out.println("You haven't created or selected any lamp.");
                            break;
                        }
                        System.out.println("Choice doesn't exists.");
                    } else {
                        currentLamp.reset(genie);
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Choice doesn't exists.");
                    break;
            }
        }

    }

    public static Lamp[] addLampToArray(Lamp[] lamps) {
        Lamp[] newLamps = new Lamp[lamps.length + 1];

        System.arraycopy(lamps, 0, newLamps, 0, lamps.length);

        newLamps[newLamps.length - 1] = new Lamp();
        return newLamps;
    }
}
