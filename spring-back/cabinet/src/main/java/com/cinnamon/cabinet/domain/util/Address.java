package com.cinnamon.cabinet.domain.util;

public record Address (
        String street,
        String city,
        String state,
        String country,
        String zip
){}
