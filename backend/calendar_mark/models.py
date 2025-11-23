import uuid

from django.db import models

#     CalendarMark - (Super Class) A reminder to put on a calendar. Contains all elements shared by items to be placed on calendar.
#             protected UUID id;
#             protected String title;
#             protected String description;
#             protected Set<String> tags;

class Tag(models.Model):
    name = models.CharField(max_length=200, primary_key=True)

class CalendarMark(models.Model):
    id = models.UUIDField(primary_key=True, default=uuid.uuid4, editable=False)
    title = models.CharField(max_length=200)
    desc = models.CharField("description",max_length=350)
    address = models.JSONField(null=True, blank=True) #CACHE
    location = models.CharField(max_length=200, null=True, blank=True) #Google Place ID
    tags = models.ManyToManyField(Tag, blank=True)

    class Meta:
        abstract = True