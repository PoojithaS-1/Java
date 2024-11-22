package com.xworkz.calanderapp.calender;

import com.xworkz.calanderapp.constants.EventType;
import com.xworkz.calanderapp.event.Event;

public class Calender {
    Event event[] = new Event[10];
    int index;

    public boolean addEvent(Event event) {
        if (index < this.event.length) {
            if (event.getEventId() > 0 && event.getEventType() != null && event.getWho() != null) {
                this.event[index++] = event;
                System.out.println("Event added successfully");
                return true;

            } else {
                System.out.println("Invalid event details.");
                return false;
            }
        } else {
            System.out.println("ArrayIndexOutOfBoundsException: Event array is full.");
            return false;
        }
    }

    public void getDetails() {
        System.out.println("Event Info:");
        for (Event eventRef : event) {
            if (eventRef != null) {
                System.out.println("EventId: " + eventRef.getEventId());
                System.out.println("EventType: " + eventRef.getEventType());
                System.out.println("Who: " + eventRef.getWho());
                System.out.println("EventStartDate: " + eventRef.getStartDate());
                System.out.println("EventEndDate: " + eventRef.getEndDate());
                System.out.println("ALL Day event: " + eventRef.isAllDayEvent());
                System.out.println("Description: " + eventRef.getDescription());
                System.out.println("__________________________________________________");


            } else {
                System.out.println("No availability");
            }
        }
    }

    public Event getEventById(int eventId) {
        System.out.println("getEventById method started");
        Event isIdFound = null;
        for (Event eventRef : event) {
            if (eventRef != null && eventRef.getEventId() == eventId) {
                System.out.println("Event Found:");
                System.out.println("EventId: " + eventRef.getEventId());
                System.out.println("EventType: " + eventRef.getEventType());
                System.out.println("Who: " + eventRef.getWho());
                System.out.println("EventStartDate: " + eventRef.getStartDate());
                System.out.println("EventEndDate: " + eventRef.getEndDate());
                System.out.println("All Day event: " + eventRef.isAllDayEvent());
                System.out.println("Description: " + eventRef.getDescription());

            }
        }
        System.out.println("getEventById method ended");
        System.out.println("****************************************");
        return isIdFound;

    }

    public Event getEventByWho(String Who) {
        System.out.println("getEventByWho method started");
        Event isNameFound = null;
        for (Event eventRef : event) {
            if (eventRef != null && eventRef.getWho() == Who) {
                isNameFound=eventRef;
                System.out.println("Event Found:");
                System.out.println("EventId: " + eventRef.getEventId());
                System.out.println("EventType: " + eventRef.getEventType());
                System.out.println("Who: " + eventRef.getWho());
                System.out.println("EventStartDate: " + eventRef.getStartDate());
                System.out.println("EventEndDate: " + eventRef.getEndDate());
                System.out.println("All Day event: " + eventRef.isAllDayEvent());
                System.out.println("Description: " + eventRef.getDescription());

            }
        }
        if (isNameFound==null) {
            System.out.println("Name Not Found......!");
        }
            System.out.println("getEventByWho method ended");
        System.out.println("****************************************");
            return isNameFound;
    }
    public Event getEventByType(EventType eventType ){
        System.out.println("getEventByType method started");
        Event isEventTypeFound=null;
        for (Event eventRef :event) {
            if (eventRef != null && eventRef.getEventType() == eventType) {
                isEventTypeFound = eventRef;
                System.out.println("Event Found:");
                System.out.println("EventId: " + eventRef.getEventId());
                System.out.println("EventType: " + eventRef.getEventType());
                System.out.println("Who: " + eventRef.getWho());
                System.out.println("EventStartDate: " + eventRef.getStartDate());
                System.out.println("EventEndDate: " + eventRef.getEndDate());
                System.out.println("All Day event: " + eventRef.isAllDayEvent());
                System.out.println("Description: " + eventRef.getDescription());
                System.out.println("__________________________________________________");

            }
        }
            if (isEventTypeFound==null){
                System.out.println("EventType Not found...");
                }
                System.out.println("getEventByType method ended");
                System.out.println("****************************************");
                return isEventTypeFound;
    }
    public Event getByStartDate(String startDate){
        System.out.println("getByStartDate method started");
        Event isStartDateFound=null;
        for (Event eventRef:event){
            if (eventRef != null && eventRef.getStartDate() == startDate ){
                isStartDateFound=eventRef;
                System.out.println("Event Found:");
                System.out.println("EventId: " + eventRef.getEventId());
                System.out.println("EventType: " + eventRef.getEventType());
                System.out.println("Who: " + eventRef.getWho());
                System.out.println("EventStartDate: " + eventRef.getStartDate());
                System.out.println("EventEndDate: " + eventRef.getEndDate());
                System.out.println("All Day event: " + eventRef.isAllDayEvent());
                System.out.println("Description: " + eventRef.getDescription());
                System.out.println("__________________________________________________");
            }
        }
        if (isStartDateFound ==null){
            System.out.println("Date not found....");
        }
        System.out.println("getByStartDate method ended");
        return isStartDateFound;
    }

    public Event getByEndDate(String endDate){
        System.out.println("getByEndDate method started");
        Event isEndDateFound =null;
        for (Event eventRef:event){
            if (eventRef != null && eventRef.getEndDate() == endDate ){
                isEndDateFound =eventRef;
                System.out.println("Event Found:");
                System.out.println("EventId: " + eventRef.getEventId());
                System.out.println("EventType: " + eventRef.getEventType());
                System.out.println("Who: " + eventRef.getWho());
                System.out.println("EventStartDate: " + eventRef.getStartDate());
                System.out.println("EventEndDate: " + eventRef.getEndDate());
                System.out.println("All Day event: " + eventRef.isAllDayEvent());
                System.out.println("Description: " + eventRef.getDescription());
                System.out.println("__________________________________________________");
            }
        }
        if (isEndDateFound ==null){
            System.out.println("Date not found....");
        }
        System.out.println("getByEndDate method ended");
        return isEndDateFound;
    }

    public Event getByDescription(String description){
        System.out.println("getByDescription method started");
        Event isDescriptionFound =null;
        for (Event eventRef:event){
            if (eventRef != null && eventRef.getDescription() == description ){
                isDescriptionFound =eventRef;
                System.out.println("Event Found:");
                System.out.println("EventId: " + eventRef.getEventId());
                System.out.println("EventType: " + eventRef.getEventType());
                System.out.println("Who: " + eventRef.getWho());
                System.out.println("EventStartDate: " + eventRef.getStartDate());
                System.out.println("EventEndDate: " + eventRef.getEndDate());
                System.out.println("All Day event: " + eventRef.isAllDayEvent());
                System.out.println("Description: " + eventRef.getDescription());
                System.out.println("__________________________________________________");
            }
        }
        if (isDescriptionFound ==null){
            System.out.println("Date not found....");
        }
        System.out.println("getByDescription method ended");
        return isDescriptionFound;
    }

//    public Event isAllDayEvent(boolean allDayEvent){
//        System.out.println("isAllDayEvent method started");
//        Event isAllDayEventFound =null;
//        for (Event eventRef:event){
//            if (eventRef != null && eventRef.isAllDayEvent() == allDayEvent ){
//
//                System.out.println("Event Found:");
//                System.out.println("EventId: " + eventRef.getEventId());
//                System.out.println("EventType: " + eventRef.getEventType());
//                System.out.println("Who: " + eventRef.getWho());
//                System.out.println("EventStartDate: " + eventRef.getStartDate());
//                System.out.println("EventEndDate: " + eventRef.getEndDate());
//                System.out.println("All Day event: " + eventRef.isAllDayEvent());
//                System.out.println("Description: " + eventRef.getDescription());
//                System.out.println("__________________________________________________");
//            }
//        }
//        System.out.println("isAllDayEvent method ended");
//        return isAllDayEventFound;
//    }
}


