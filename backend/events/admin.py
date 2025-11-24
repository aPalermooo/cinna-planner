from django.contrib import admin

from events.models import AllDayEvent, TimedEvent


class ADEventAdmin(admin.ModelAdmin):
    list_display = ('title', 'desc')

class TEventAdmin(admin.ModelAdmin):
    list_display = ('title', 'desc')

admin.site.register(AllDayEvent, ADEventAdmin)
admin.site.register(TimedEvent, TEventAdmin)
