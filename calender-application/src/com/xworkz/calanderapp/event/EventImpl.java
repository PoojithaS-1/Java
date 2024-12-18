package com.xworkz.calanderapp.event;

import com.xworkz.calanderapp.calender.Calender;
import com.xworkz.calanderapp.constants.EventType;
import com.xworkz.calanderapp.exception.*;

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

            } else {
                System.out.println("No availability");
            }
        }

    }

    @Override
    public Event getEventById(int eventId) {
        System.out.println("getEventById method started");
        Event isIdFound = null;
        try {
            for (Event eventRef : event) {
                if (eventRef != null && eventRef.getEventId() == eventId) {
                    System.out.println(eventRef);
                }
            }
            if (isIdFound == null) {
                EventIdNotFoundException eventIdNotFoundException = new EventIdNotFoundException("Id Number " +eventId+" not found");
                throw eventIdNotFoundException;
            }
        }catch (EventIdNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("getEventById method ended");
//        System.out.println("****************************************");
        return isIdFound;
    }

    @Override
    public Event getEventByWho(String Who) {
        System.out.println("getEventByWho method started");
        Event isNameFound = null;
        try {

            for (Event eventRef : event) {
                if (eventRef != null && eventRef.getWho().equals(Who)) {
                    isNameFound = eventRef;
                    System.out.println("Event Found:");
                    System.out.println(eventRef);
                }

            }

            if (isNameFound == null) {
                EventByWhoNotFoundException eventByWhoNotFoundException=new EventByWhoNotFoundException("Name "+Who+ " Not Found......!");
                throw eventByWhoNotFoundException;
            }
        }catch (EventByWhoNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("getEventByWho method ended");
//        System.out.println("****************************************");
        return isNameFound;
    }

    @Override
    public Event getEventByType(EventType eventType) {
        System.out.println("getEventByType method started");
        Event isEventTypeFound=null;
        try {
            for (Event eventRef : event) {
                if (eventRef != null && eventRef.getEventType() == eventType) {
                    isEventTypeFound = eventRef;
                    System.out.println("Event Found:");
                    System.out.println(eventRef);
                }
            }
            if (isEventTypeFound == null) {
                EventByTypeNotFoundException eventByTypeNotFoundException=new EventByTypeNotFoundException("EventType "+eventType+" Not found...");
                throw eventByTypeNotFoundException;
            }
        }catch (EventByTypeNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("getEventByType method ended");
//        System.out.println("****************************************");
        return isEventTypeFound;
    }

    @Override
    public Event getByStartDate(String startDate) {
        System.out.println("getByStartDate method started");
        Event isStartDateFound=null;
        try {
            for (Event eventRef : event) {
                if (eventRef != null && eventRef.getStartDate().equals(startDate)) {
                    isStartDateFound = eventRef;
                    System.out.println("Event Found:");

                }
            }
            if (isStartDateFound == null) {
                EventByStartDateNotFoundException eventByStartDateNotFoundException=new EventByStartDateNotFoundException("Date "+startDate+" not found....");
                throw eventByStartDateNotFoundException;
            }
        }catch (EventByStartDateNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("getByStartDate method ended");
        return isStartDateFound;
    }

    @Override
    public Event getByEndDate(String endDate) {
        System.out.println("getByEndDate method started");
        Event isEndDateFound = null;
        try {
            for (Event eventRef:event){
                if (eventRef != null && eventRef.getEndDate() .equals(endDate) ){
                    isEndDateFound =eventRef;
                    System.out.println("Event Found:");

                }
            }
            if (isEndDateFound ==null){
                EventByEndDateNotFoundException eventByEndDateNotFoundException=new EventByEndDateNotFoundException("Date "+endDate+" not found....");
                throw eventByEndDateNotFoundException;
            }
        } catch (EventByEndDateNotFoundException e) {
           e.printStackTrace();
        }
        System.out.println("getByEndDate method ended");
        return isEndDateFound;
    }

    @Override
    public Event getByDescription(String description) {
        System.out.println("getByDescription method started");
        Event isDescriptionFound =null;
        try {
            for (Event eventRef:event){
                if (eventRef != null && eventRef.getDescription() .equals(description) ){
                    isDescriptionFound =eventRef;
                    System.out.println("Event Found:");

                }
            }
            if (isDescriptionFound ==null){
                EventByDescriptionNotFoundException eventByDescriptionNotFoundException=new EventByDescriptionNotFoundException("Description not found....");
                throw eventByDescriptionNotFoundException;
            }
        } catch (EventByDescriptionNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("getByDescription method ended");
        return isDescriptionFound;
    }

    @Override
    public String getWhoByStartDate(String startDate) {
        String Who =null;
        try {
            for (Event eventRef:event){
                if (startDate != null && eventRef.getStartDate().equals(startDate)){
                    Who =eventRef.getWho();
                    System.out.println("Who: "+eventRef.getWho());
                }
            }
            if (Who == null) {
                WhoByStartDateNotFoundException whoByStartDateNotFoundException = new WhoByStartDateNotFoundException("Start Date " + startDate + " Not found");
                throw whoByStartDateNotFoundException;
            }
        } catch (WhoByStartDateNotFoundException e) {
            e.printStackTrace();
        }
        return Who;
    }

    @Override
    public String getWhoByEndDate(String endDate) {
        String Who=null;
        try {
            for (Event eventRef : event) {
                if (endDate != null && eventRef.getEndDate().equals(endDate)) {
                    Who = eventRef.getWho();
                    System.out.println("Who: " + eventRef.getWho());
                    //                System.out.println("**************************************");
                }
            }
            if (Who == null) {
                WhoByEndDateNotFoundException whoByEndDateNotFoundException = new WhoByEndDateNotFoundException("EndDate " + endDate + " Not found");
                throw whoByEndDateNotFoundException;
            }
        }catch (WhoByEndDateNotFoundException e) {
            e.printStackTrace();
        }
        return Who;
    }

    @Override
    public String getDescriptionById(int eventId) {
        String description = null;
        try {
            for (Event eventRef : event) {
                if (eventId != 0 && eventRef.getEventId() == eventId) {
                    description = eventRef.getDescription();
                    System.out.println("Description: " + eventRef.getDescription());
                }
            }
            if (description == null){
                DescriptionByIdNotFoundException descriptionByIdNotFoundException=new DescriptionByIdNotFoundException("Id "+eventId+" Not found");
                throw descriptionByIdNotFoundException;
        }
    }catch (DescriptionByIdNotFoundException e){
            e.printStackTrace();
        }
        return description;
    }

    @Override
    public boolean getIsAllDayEventByEventType(EventType eventType) {
        boolean isAllDayEvent=false;
        try {
            for (Event eventRef:event){
                if(eventType != null && eventRef.getEventType()==eventType){
                    isAllDayEvent=eventRef.isAllDayEvent();
                    System.out.println("All Day event: "+eventRef.isAllDayEvent());
                }
            }
            if (isAllDayEvent == false) {
               IsAllDayEventByEventTypeNotFoundException isAllDayEventByEventTypeNotFoundException=new IsAllDayEventByEventTypeNotFoundException("EventType "+eventType+" Not found");
                throw isAllDayEventByEventTypeNotFoundException;
            }
        } catch (IsAllDayEventByEventTypeNotFoundException e) {
            e.printStackTrace();
        }
        return isAllDayEvent;
    }

    @Override
    public boolean updateStartDateByWho(String Who, String updatedStartDate) {
        boolean isUpdatedStartDate = false;
        try {
            for (Event eventRef : event) {
                if (eventRef.getWho() .equals(Who) ) {
                    eventRef.setStartDate(updatedStartDate);
                    isUpdatedStartDate = true;
                }
            }
            if (isUpdatedStartDate == false) {
                StartDateByWhoNotFoundException startDateByWhoNotFoundException=new StartDateByWhoNotFoundException(Who + "not found");
                throw startDateByWhoNotFoundException;
            }
        } catch (StartDateByWhoNotFoundException e) {
            e.printStackTrace();
        }
        return isUpdatedStartDate;
    }

    @Override
    public boolean updateStartDateAndEndDateByWho(String Who, String updatedStartDate, String updatedEndDate) {
        boolean isupdateStartDateAndEndDate = false;
        try {
            for (Event eventRef : event) {
                if (eventRef.getWho() .equals(Who)) {
                    eventRef.setStartDate(updatedStartDate);
                    eventRef.setEndDate(updatedEndDate);
                    isupdateStartDateAndEndDate= true;
                }
            }
            if (isupdateStartDateAndEndDate == false) {
                StartDateAndEndDateByWhoNotFoundException startDateAndEndDateByWhoNotFoundException=new StartDateAndEndDateByWhoNotFoundException(Who + "not found");
                throw startDateAndEndDateByWhoNotFoundException;
            }
        } catch (StartDateAndEndDateByWhoNotFoundException e) {
            e.printStackTrace();
        }
        return isupdateStartDateAndEndDate;
    }

    @Override
    public boolean deleteEventById(int eventId) {
        boolean isEventDeleted=false;
        int i=0;
        try {
            for (int start=0;start<event.length;start++){
                Event eventRef=event[start];
                if (eventRef.getEventId() != eventId){
                    event[i++]=event[start];
                }else {
                    isEventDeleted=true;
                }

            }if (isEventDeleted==false){
                IdToDeleteNotFoundException idToDeleteNotFoundException=new IdToDeleteNotFoundException("Id "+eventId+" not found");
                throw idToDeleteNotFoundException;
            }
        } catch (IdToDeleteNotFoundException e) {
            e.printStackTrace();
        }
        int size=i;
        event= Arrays.copyOf(event,i);
        return isEventDeleted;

    }
}
