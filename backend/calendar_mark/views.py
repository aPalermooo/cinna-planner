from django.shortcuts import render
from rest_framework import viewsets

from calendar_mark.models import Tag
from calendar_mark.serializers import TagSerializer


# Create your views here.

class TagView (viewsets.ModelViewSet):
    serializer_class = TagSerializer
    queryset = Tag.objects.all()