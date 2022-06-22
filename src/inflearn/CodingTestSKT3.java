package inflearn;

import java.util.Arrays;

public class CodingTestSKT3 {
    public static void main(String[] args) {
        int n = 5;
        String[] plans = {"100 1 3", "500 4", "2000 5"};
        String[] clients = {"300 3 5", "1500 1", "100 1 3", "50 1 2"};
        int[] plansBills = new int[plans.length];
        String[] plansContents = new String[plans.length];
        int[] clientsBills = new int[clients.length];
        String[] clientsContents = new String[clients.length];
        for (int i = 0; i < plans.length; i++) {
            for (int j = 0; j < plans[i].split(" ").length; j++) {
                if (j == 0) {
                    plansBills[i] = Integer.parseInt(plans[i].split(" ")[j]);
                } else if (j == 1) {
                    plansContents[i] = plans[i].split(" ")[j];
                } else {
                    plansContents[i] += plans[i].split(" ")[j];
                }
            }
        }
        for (int i = 1; i < plansContents.length; i++) {
            plansContents[i] += plansContents[0];
        }
        for (int i = 2; i < plansContents.length; i++) {
            plansContents[i] += plansContents[1];
        }

        for (int i = 0; i < clients.length; i++) {
            for (int j = 0; j < clients[i].split(" ").length; j++) {
                if (j == 0) {
                    clientsBills[i] = Integer.parseInt(clients[i].split(" ")[j]);
                } else if (j == 1) {
                    clientsContents[i] = clients[i].split(" ")[j];
                } else {
                    clientsContents[i] += clients[i].split(" ")[j];
                }
            }
        }
        System.out.println(Arrays.toString(plansBills));
        System.out.println(Arrays.toString(plansContents));
        System.out.println(Arrays.toString(clientsBills));
        System.out.println(Arrays.toString(clientsContents));
        int tmp = 0;
        Outer:
        for (int i = 0; i < clients.length; i++) {
            for (int j = 0; j < plans.length; j++) {
                if (clientsBills[i] < plansBills[j] && plansContents[j].contains(clientsContents[i].charAt(0) + "")) {
                    tmp = j;
                    break Outer;
                }
            }
        }

    }
}
