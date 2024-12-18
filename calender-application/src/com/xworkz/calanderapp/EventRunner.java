package com.xworkz.calanderapp;

import com.xworkz.calanderapp.constants.EventType;
import com.xworkz.calanderapp.event.Event;
import com.xworkz.calanderapp.event.EventImpl;

import java.util.Scanner;

public class EventRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of events to be added: ");
        int size=scanner.nextInt();
        EventImpl event=new EventImpl(size);
        int i=0;
        while (i<size){
            Event event1 = new Event();
            System.out.println("Event id: ");
            event1.setEventId(scanner.nextInt());
            System.out.println("Event Type: ");
            event1.setEventType(EventType.valueOf(scanner.next().toUpperCase()));
            System.out.println("Who: ");
            event1.setWho(scanner.next());
            System.out.println("Is all day event: ");
            event1.setAllDayEvent(scanner.nextBoolean());
            System.out.println("Enter start date: ");
            event1.setStartDate(scanner.next());
            System.out.println("Enter end date: ");
            event1.setEndDate(scanner.next());
            System.out.println("Description: ");
            scanner.nextLine();
            event1.setDescription(scanner.nextLine());
            event.addEvent(event1);
            i++;
        }
        String input=null;
        do {
            System.out.println("Enter your choice");
            System.out.println("1. Display all events");
            System.out.println("2. Display events using id");
            System.out.println("3. Display events by Who");
            System.out.println("4. Display events using eventType");
            System.out.println("5. Display event using StartDate");
            System.out.println("6. Display event using EndDate");
            System.out.println("7. Display event using Description");
            System.out.println("8.Display Who using StartDate");
            System.out.println("9.Display Who using EndDate");
            System.out.println("10.Display Description using id");
            System.out.println("11.Display Is all day event using event type");
            System.out.println("12.update startDate using Who");
            System.out.println("13.update StartDate And EndDate using Who");
            System.out.println("14. delete Event using Id");

            int option=scanner.nextInt();
            switch (option){
                case 1:
                    event.getDetails();
                    break;

                case 2:
                    System.out.println("Enter id: ");
                   event.getEventById(scanner.nextInt());


                    break;

                case 3:
                    System.out.println("Enter who: ");
                    event.getEventByWho(scanner.next());
                    break;

                case 4:
                    System.out.println("Enter eventType:");
                    event.getEventByType(EventType.valueOf(scanner.next().toUpperCase()));
                    break;

                case 5:
                    System.out.println("Enter start date:");
                    Event startDate =event.getByStartDate(scanner.next());
                    System.out.println(startDate);
                    break;
                case 6:
                    System.out.println("Enter end date:");
                    Event endDate=event.getByEndDate(scanner.next());
                    System.out.println(endDate);
                    break;
                case 7:
                    System.out.println("Enter description:");
                    scanner.nextLine();
                    Event description=event.getByDescription(scanner.nextLine());
                    System.out.println(description);
                    break;

                case 8:
                    System.out.println("Enter start date to get info of who:");
                    event.getWhoByStartDate(scanner.next());
//                    System.out.println(whoByStartDate);
                    break;

                case 9:
                    System.out.println("Enter end date to get info of who:");
                    event.getWhoByEndDate(scanner.next());
//                    System.out.println(whoByEndDate);
                    break;

                case 10:
                    System.out.println("Enter id to get Description:");
                    event.getDescriptionById(scanner.nextInt());
                    break;

                case 11:
                    System.out.println("Enter event Type: ");
                    event.getIsAllDayEventByEventType(EventType.valueOf(scanner.next().toUpperCase()));
                    break;

                case 12:
                    System.out.println("Enter who: ");
                    String who=scanner.next();
                    System.out.println("Enter date you want to update: ");
                    String updatedDate=scanner.next();
                    event.getDetails();
                    event.updateStartDateByWho(who,updatedDate);
                    event.getDetails();
                    break;

                case 13:
                    System.out.println("Enter who: ");
                    String who1=scanner.next();
                    System.out.println("Enter start date you want to update: ");
                    String updatedStartDate =scanner.next();
                    System.out.println("Enter end date you want to update: ");
                    String updatedEndDate =scanner.next();
                    event.getDetails();
                    event.updateStartDateAndEndDateByWho(who1,updatedStartDate,updatedEndDate);
                    event.getDetails();
                    break;

                case 14:
                    System.out.println("Enter id which is to be deleted");
                    event.deleteEventById(scanner.nextInt());
                    System.out.println("Deleted successfully..!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Do you want to continue? (Y/N)");
            scanner.nextLine();
            input = scanner.next();
        } while (input.equalsIgnoreCase("Y"));
        System.out.println("Thank you for using the application!");

        System.out.println("Main Ended");

    }
}
