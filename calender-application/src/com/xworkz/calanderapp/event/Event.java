package com.xworkz.calanderapp.event;

import com.xworkz.calanderapp.constants.EventType;
import lombok.*;

@Setter
@Getter
public class Event  {
    private int eventId;
    private String Who;
    private String startDate;
    private String endDate;
    private boolean allDayEvent;
    private EventType eventType;
    private String description;

}

