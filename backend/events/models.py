from django.db import models

from calendar_mark.models import CalendarMark

#         AllDayEvent - An event that has no correlation with time but rather date. These events start at midnight and end at 11:59pm
#             EXTENDS CALENDAR MARK:
#                 protected UUID id;
#                 protected String title;
#                 protected String description;
#                 protected Set<String> tags;
#             Unique Attributes:
#                 private LocalDate dateStart;
#                 private LocalDate dateEnd;
#                 private Address location; (see utils)
#
#
#         TimedEvent - An event that will start at a specific time and date, and end on a different time and date.
#             EXTENDS ALL DAY EVENT:
#                 EXTENDS CALENDAR MARK:
#                     protected UUID id;
#                     protected String title;
#                     protected String description;
#                     protected Set<String> tags;
#                 ALL DAY EVENT Attributes:
#                     private LocalDate dateStart;
#                     private LocalDate dateEnd;
#                     private Address location; (see utils)
#             Unique Attributes:
#                 private LocalTime  startTime;
#                 private LocalTime endTime;


class AllDayEvent (CalendarMark):
    date_start = models.DateField("Start Date")
    date_end = models.DateField("End Date")

    class Meta:
        verbose_name = "All Day Event"
        verbose_name_plural = "All Day Events"

class TimedEvent (AllDayEvent):
    time_start = models.TimeField("Start Time")
    time_end = models.TimeField("End Time")

    class Meta:
        verbose_name = "Timed Event"
        verbose_name_plural = "Timed Events"