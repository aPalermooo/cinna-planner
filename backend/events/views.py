from django.shortcuts import render
from rest_framework import viewsets

from events.models import AllDayEvent, TimedEvent
from events.serializers import ADEventSerializer, TEventSerializer

# Create your views here.

class ADEventView (viewsets.ModelViewSet):
    serializer_class = ADEventSerializer
    queryset = AllDayEvent.objects.all()

class TEventView (viewsets.ModelViewSet):
    serializer_class = TEventSerializer
    queryset = TimedEvent.objects.all()