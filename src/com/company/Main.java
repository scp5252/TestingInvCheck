package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int cCount = 1;

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char CUST_PRNT = 'P';
        final char INV_PRNT = 'I';
        final char SALES_CODE = 'T';
        final char HELP_CODE = '?';
        char userAction;
        System.out.println("Team 4 Car Dealership");
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'I'nventory, Add 'O'rder, List 'S'ales Leads or 'E'xit: ";
       ArrayList<Inventory> invList = new ArrayList<>();


        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case INV_PRNT:
                    Inventory.printParts(invList);
                    break;
                case SALES_CODE:
                    //SalesLead.listSalesLead);
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }
}

