from rest_framework import serializers
from .models import CalendarMark, Tag

class CMSerializer(serializers.ModelSerializer):
    tags = serializers.SlugRelatedField(
        many=True,
        queryset=Tag.objects.all(),
        slug_field="name",
        allow_null=True
    )

    id = serializers.UUIDField(read_only=True)
    title = serializers.CharField()
    desc = serializers.CharField()
    address = serializers.JSONField(required=False)  # CACHE
    location = serializers.CharField(required=False)  # Google Place ID

    class Meta:
        fields = (
            'id',
            'title',
            'desc',
            'address',
            'location',
            'tags'
        )

class TagSerializer(serializers.ModelSerializer):

    class Meta:
        model = Tag
        fields = ('name',)