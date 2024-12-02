package com.xworkz.calanderapp.calender;

import com.xworkz.calanderapp.constants.EventType;
import com.xworkz.calanderapp.event.Event;

public interface Calender {

    public boolean addEvent(Event event);

    public void getDetails();

    public Event getEventById(int eventId);

    public Event getEventByWho(String Who);

    public Event getEventByType(EventType eventType);

    public Event getByStartDate(String startDate);

    public Event getByEndDate(String endDate);

    public Event getByDescription(String description);

    public String getWhoByStartDate(String startDate);

    public String getWhoByEndDate(String endDate);

    public String getDescriptionById(int eventId);

    public boolean getIsAllDayEventByEventType(EventType eventType);

    public boolean updateStartDateByWho(String Who, String updatedStartDate);

    public boolean updateStartDateAndEndDateByWho(String Who, String updatedStartDate, String updatedEndDate);

    public boolean deleteEventById(int eventId);
}