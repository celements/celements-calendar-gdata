package com.celements.calendar.gdata;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalendarServiceTest {

  private CalendarService calendarService;

  @Before
  public void setUp() throws Exception {
    calendarService = new CalendarService();
  }

  @Test
  public void testCalendarService() {
    assertNotNull(calendarService);
  }

}
