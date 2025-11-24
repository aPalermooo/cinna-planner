
from calendar_mark.serializers import CMSerializer
from events.models import AllDayEvent, TimedEvent


class ADEventSerializer (CMSerializer):

    class Meta:
        model = AllDayEvent
        fields = CMSerializer.Meta.fields + ('date_start', 'date_end')

class TEventSerializer (CMSerializer):

    class Meta:
        model = TimedEvent
        fields = ADEventSerializer.Meta.fields + ('time_start','time_end')