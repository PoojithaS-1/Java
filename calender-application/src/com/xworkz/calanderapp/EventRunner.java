package com.xworkz.calanderapp;

import com.xworkz.calanderapp.constants.EventType;
import com.xworkz.calanderapp.event.Event;
import com.xworkz.calanderapp.event.EventImpl;

public class EventRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Event event1 = new Event();
        event1.setEventId(1);
        event1.setEventType(EventType.BIRTHDAY);
        event1.setWho("Poojitha");
        event1.setAllDayEvent(true);
        event1.setStartDate("20-11-2024");
        event1.setEndDate("20-11-2024");
        event1.setDescription("Leave for birthday");

        EventImpl event=new EventImpl();

        event.addEvent(event1);

        Event event2 = new Event();
        event2.setEventId(2);
        event2.setEventType(EventType.HOSPITAL);
        event2.setWho("Varshitha");
        event2.setAllDayEvent(true);
        event2.setStartDate("25-11-2024");
        event2.setEndDate("25-11-2024");
        event2.setDescription("Sick leave");

//        Calender calender2 = new Calender();
        event.addEvent(event2);
//        calender2.getDetails();

        Event event3 = new Event();
        event3.setEventId(3);
        event3.setEventType(EventType.TRAVEL);
        event3.setWho("Keerthi");
        event3.setAllDayEvent(true);
        event3.setStartDate("27-11-2024");
        event3.setEndDate("29-11-2024");
        event3.setDescription("2 days Leave for travelling");

//        Calender calender3 = new Calender();
        event.addEvent(event3);

        Event event4=new Event();
        event4.setEventId(4);
        event4.setEventType(EventType.HOLIDAY);
        event4.setWho("Kavana");
        event4.setAllDayEvent(true);
        event4.setStartDate("25-12-2024");
        event4.setEndDate("25-12-2024");
        event4.setDescription("Chrismas celebration");

       event.addEvent(event4);

        Event event5 =new Event();
        event5.setEventId(5);
        event5.setEventType(EventType.LEAVE);
        event5.setWho("Kavya");
        event5.setAllDayEvent(false);
        event5.setStartDate("25-11-2024");
        event5.setEndDate("25-11-2024");
        event5.setDescription("Half day leave for personal works");

        event.addEvent(event5);

        Event event6 =new Event();
        event6.setEventId(6);
        event6.setEventType(EventType.HOLIDAY);
        event6.setWho("Kusuma");
        event6.setAllDayEvent(true);
        event6.setStartDate("02-11-2024");
        event6.setEndDate("02-11-2024");
        event6.setDescription("Kannada Rayothsava");

        event.addEvent(event6);

        Event event7 =new Event();
        event7.setEventId(7);
        event7.setEventType(EventType.TRAVEL);
        event7.setWho("Bhoomika");
        event7.setAllDayEvent(true);
        event7.setStartDate("25-12-2024");
        event7.setEndDate("30-12-2024");
        event7.setDescription("Travelling To Dubai");

        event.addEvent(event7);

        Event event8 =new Event();
        event8.setEventId(8);
        event8.setEventType(EventType.BIRTHDAY);
        event8.setWho("Vani");
        event8.setAllDayEvent(true);
        event8.setStartDate("05-12-2024");
        event8.setEndDate("05-12-2024");
        event8.setDescription("Taking a day off to celebrate birthday");

        event.addEvent(event8);

        Event event9 =new Event();
        event9.setEventId(9);
        event9.setEventType(EventType.HOSPITAL);
        event9.setWho("Kavitha");
        event9.setAllDayEvent(true);
        event9.setStartDate("26-12-2024");
        event9.setEndDate("30-12-2024");
        event9.setDescription("Taking leave for my health recovery");

        event.addEvent(event9);

        Event event10 =new Event();
        event10.setEventId(10);
        event10.setEventType(EventType.HOLIDAY);
        event10.setWho("Manju");
        event10.setAllDayEvent(true);
        event10.setStartDate("26-01-2025");
        event10.setEndDate("26-01-2025");
        event10.setDescription("Republic day");

        event.addEvent(event10);

        Event event11 =new Event();
        event11.setEventId(11);
        event11.setEventType(EventType.LEAVE);
        event11.setWho("Shankar");
        event11.setAllDayEvent(true);
        event11.setStartDate("27-12-2024");
        event11.setEndDate("27-12-2024");
        event11.setDescription("Headache & Fever");

        event.addEvent(event11);
        event.getDetails();


        event.getEventById(5);

        event.getEventByWho("Poojitha");

       event.getEventByType(EventType.HOLIDAY);

       event.getByStartDate("26-01-2025");

       event.getByEndDate("02-11-2024");

       event.getByDescription("Republic day");

       event.getWhoByStartDate("26-01-2025");

        event.getWhoByEndDate("25-12-2024");

        event.getDescriptionById(1);

        event.getIsAllDayEventByEventType(EventType.HOLIDAY);

        event.updateStartDateByWho("Kavana","02-01-2025");
        event.getDetails();

        event.updateStartDateAndEndDateByWho("Kavana","01-01-2025","02-01-2025");
        event.getDetails();

        event.deleteEventById(4);
        event.getDetails();

        System.out.println("Main Ended");

    }
}
