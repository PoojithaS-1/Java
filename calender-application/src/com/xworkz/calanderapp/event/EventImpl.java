package com.xworkz.calanderapp.event;

import com.xworkz.calanderapp.calender.Calender;
import com.xworkz.calanderapp.constants.EventType;

import java.util.Arrays;

public class EventImpl implements Calender {
    Event event[] = null;
    public EventImpl(int size){
        event=new Event[size];
    }
    int index;

    @Override
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

    @Override
    public void getDetails() {
        System.out.println("Event Info:");
        for (Event eventRef : event) {
            if (eventRef != null) {
                System.out.println(eventRef);
//                System.out.println("EventId: " + eventRef.getEventId());
//                System.out.println("EventType: " + eventRef.getEventType());
//                System.out.println("Who: " + eventRef.getWho());
//                System.out.println("EventStartDate: " + eventRef.getStartDate());
//                System.out.println("EventEndDate: " + eventRef.getEndDate());
//                System.out.println("ALL Day event: " + eventRef.isAllDayEvent());
//                System.out.println("Description: " + eventRef.getDescription());
//                System.out.println("__________________________________________________");


            } else {
                System.out.println("No availability");
            }
        }

    }

    @Override
    public Event getEventById(int eventId) {
        System.out.println("getEventById method started");
        Event isIdFound = null;
        for (Event eventRef : event) {
            if (eventRef != null && eventRef.getEventId()== eventId) {
                System.out.println(eventRef);

//                System.out.println("Event Found:");
//                System.out.println("EventId: " + eventRef.getEventId());
//                System.out.println("EventType: " + eventRef.getEventType());
//                System.out.println("Who: " + eventRef.getWho());
//                System.out.println("EventStartDate: " + eventRef.getStartDate());
//                System.out.println("EventEndDate: " + eventRef.getEndDate());
//                System.out.println("All Day event: " + eventRef.isAllDayEvent());
//                System.out.println("Description: " + eventRef.getDescription());

            }
        }
        System.out.println("getEventById method ended");
//        System.out.println("****************************************");
        return isIdFound;
    }

    @Override
    public Event getEventByWho(String Who) {
        System.out.println("getEventByWho method started");
        Event isNameFound = null;
        for (Event eventRef : event) {
            if (eventRef != null && eventRef.getWho() .equals(Who)) {
                isNameFound=eventRef;
                System.out.println("Event Found:");
                System.out.println(eventRef);
//                System.out.println("EventId: " + eventRef.getEventId());
//                System.out.println("EventType: " + eventRef.getEventType());
//                System.out.println("Who: " + eventRef.getWho());
//                System.out.println("EventStartDate: " + eventRef.getStartDate());
//                System.out.println("EventEndDate: " + eventRef.getEndDate());
//                System.out.println("All Day event: " + eventRef.isAllDayEvent());
//                System.out.println("Description: " + eventRef.getDescription());

            }
        }
        if (isNameFound==null) {
            System.out.println("Name Not Found......!");
        }
        System.out.println("getEventByWho method ended");
//        System.out.println("****************************************");
        return isNameFound;
    }

    @Override
    public Event getEventByType(EventType eventType) {
        System.out.println("getEventByType method started");
        Event isEventTypeFound=null;
        for (Event eventRef :event) {
            if (eventRef != null && eventRef.getEventType() == eventType) {
                isEventTypeFound = eventRef;
                System.out.println("Event Found:");
                System.out.println(eventRef);
//                System.out.println("EventId: " + eventRef.getEventId());
//                System.out.println("EventType: " + eventRef.getEventType());
//                System.out.println("Who: " + eventRef.getWho());
//                System.out.println("EventStartDate: " + eventRef.getStartDate());
//                System.out.println("EventEndDate: " + eventRef.getEndDate());
//                System.out.println("All Day event: " + eventRef.isAllDayEvent());
//                System.out.println("Description: " + eventRef.getDescription());
//                System.out.println("__________________________________________________");

            }
        }
        if (isEventTypeFound==null){
            System.out.println("EventType Not found...");
        }
        System.out.println("getEventByType method ended");
//        System.out.println("****************************************");
        return isEventTypeFound;
    }

    @Override
    public Event getByStartDate(String startDate) {
        System.out.println("getByStartDate method started");
        Event isStartDateFound=null;
        for (Event eventRef:event){
            if (eventRef != null && eventRef.getStartDate() .equals(startDate) ){
                isStartDateFound=eventRef;
                System.out.println("Event Found:");
//                System.out.println("EventId: " + eventRef.getEventId());
//                System.out.println("EventType: " + eventRef.getEventType());
//                System.out.println("Who: " + eventRef.getWho());
//                System.out.println("EventStartDate: " + eventRef.getStartDate());
//                System.out.println("EventEndDate: " + eventRef.getEndDate());
//                System.out.println("All Day event: " + eventRef.isAllDayEvent());
//                System.out.println("Description: " + eventRef.getDescription());
//                System.out.println("__________________________________________________");
            }
        }
        if (isStartDateFound ==null){
            System.out.println("Date not found....");
        }
        System.out.println("getByStartDate method ended");
        return isStartDateFound;
    }

    @Override
    public Event getByEndDate(String endDate) {
        System.out.println("getByEndDate method started");
        Event isEndDateFound =null;
        for (Event eventRef:event){
            if (eventRef != null && eventRef.getEndDate() .equals(endDate) ){
                isEndDateFound =eventRef;
                System.out.println("Event Found:");
//                System.out.println("EventId: " + eventRef.getEventId());
//                System.out.println("EventType: " + eventRef.getEventType());
//                System.out.println("Who: " + eventRef.getWho());
//                System.out.println("EventStartDate: " + eventRef.getStartDate());
//                System.out.println("EventEndDate: " + eventRef.getEndDate());
//                System.out.println("All Day event: " + eventRef.isAllDayEvent());
//                System.out.println("Description: " + eventRef.getDescription());
//                System.out.println("__________________________________________________");
            }
        }
        if (isEndDateFound ==null){
            System.out.println("Date not found....");
        }
        System.out.println("getByEndDate method ended");
        return isEndDateFound;
    }

    @Override
    public Event getByDescription(String description) {
        System.out.println("getByDescription method started");
        Event isDescriptionFound =null;
        for (Event eventRef:event){
            if (eventRef != null && eventRef.getDescription() .equals(description) ){
                isDescriptionFound =eventRef;
                System.out.println("Event Found:");
//                System.out.println("EventId: " + eventRef.getEventId());
//                System.out.println("EventType: " + eventRef.getEventType());
//                System.out.println("Who: " + eventRef.getWho());
//                System.out.println("EventStartDate: " + eventRef.getStartDate());
//                System.out.println("EventEndDate: " + eventRef.getEndDate());
//                System.out.println("All Day event: " + eventRef.isAllDayEvent());
//                System.out.println("Description: " + eventRef.getDescription());
//                System.out.println("__________________________________________________");
            }
        }
        if (isDescriptionFound ==null){
            System.out.println("Date not found....");
        }
        System.out.println("getByDescription method ended");
        return isDescriptionFound;
    }

    @Override
    public String getWhoByStartDate(String startDate) {
        String Who =null;
        for (Event eventRef:event){
            if (startDate != null && eventRef.getStartDate().equals(startDate)){
                Who =eventRef.getWho();
                System.out.println("Who: "+eventRef.getWho());
//                System.out.println("**************************************");
            }
        }
        if (Who == null)
            System.out.println("Start Date Not found");
        return Who;
    }

    @Override
    public String getWhoByEndDate(String endDate) {
        String Who=null;
        for (Event eventRef:event){
            if(endDate != null && eventRef.getEndDate().equals(endDate)){
                Who=eventRef.getWho();
                System.out.println("Who: "+eventRef.getWho());
//                System.out.println("**************************************");
            }
        }
        if (Who == null)
            System.out.println("End Date Not found");
        return Who;
    }

    @Override
    public String getDescriptionById(int eventId) {
        String description=null;
        for (Event eventRef:event){
            if (eventId != 0 && eventRef.getEventId()==eventId ){
                description=eventRef.getDescription();
                System.out.println("Description: "+eventRef.getDescription());
            }
        }if (description == null)
            System.out.println("Id Not found");
        return description;
    }

    @Override
    public boolean getIsAllDayEventByEventType(EventType eventType) {
        boolean isAllDayEvent=false;
        for (Event eventRef:event){
            if(eventType != null && eventRef.getEventType()==eventType){
                isAllDayEvent=eventRef.isAllDayEvent();
                System.out.println("All Day event: "+eventRef.isAllDayEvent());
            }
        }
        if (isAllDayEvent == false)
            System.out.println("EventType Not found");
        return isAllDayEvent;
    }

    @Override
    public boolean updateStartDateByWho(String Who, String updatedStartDate) {
        boolean isUpdatedStartDate = false;
        for (Event eventRef : event) {
            if (eventRef.getWho() .equals(Who) ) {
                eventRef.setStartDate(updatedStartDate);
                isUpdatedStartDate = true;
            }
        }
        if (isUpdatedStartDate == false)
            System.out.println(Who + "not found");
        return isUpdatedStartDate;
    }

    @Override
    public boolean updateStartDateAndEndDateByWho(String Who, String updatedStartDate, String updatedEndDate) {
        boolean isupdateStartDateAndEndDate = false;
        for (Event eventRef : event) {
            if (eventRef.getWho() .equals(Who)) {
                eventRef.setStartDate(updatedStartDate);
                eventRef.setEndDate(updatedEndDate);
                isupdateStartDateAndEndDate= true;
            }
        }
        if (isupdateStartDateAndEndDate == false)
            System.out.println(Who + "not found");
        return isupdateStartDateAndEndDate;
    }

    @Override
    public boolean deleteEventById(int eventId) {
        boolean isEventDeleted=false;
        int i=0;
        for (int start=0;start<event.length;start++){
            Event eventRef=event[start];
            if (eventRef.getEventId() != eventId){
                event[i++]=event[start];
            }else {
                isEventDeleted=true;
            }
        }
        int size=i;
        event= Arrays.copyOf(event,i);
        return isEventDeleted;

    }
}
