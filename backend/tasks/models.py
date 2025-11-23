from django.db import models

from calendar_mark.models import CalendarMark


# Create your models here.

#         GenericTask - Implements description of Task package
#             EXTENDS CALENDAR MARK:
#                    protected UUID id;
#                     protected String title;
#                     protected String description;
#                     protected Set<String> tags;
#             Unique Attributes:
#                 private LocalDate dueDate;


class GenericTask(CalendarMark):
    dueDate = models.DateTimeField()

    class Meta:
        verbose_name = "Generic Task"
        verbose_name_plural = "Generic Tasks"