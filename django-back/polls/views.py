from django.http import HttpRequest, HttpResponse
from django.shortcuts import render

from polls.models import Question


# Create your views here.

def index(request):
    latest_question_list = Question.objects.order_by("-pub_date")[:5]
    output = ", ".join([q.question_text for q in latest_question_list])
    return HttpResponse(output)

