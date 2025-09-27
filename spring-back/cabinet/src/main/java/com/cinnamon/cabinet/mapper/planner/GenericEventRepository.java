package com.cinnamon.cabinet.mapper.planner;

import com.cinnamon.cabinet.domain.planner.CalendarMark;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface GenericEventRepository extends MongoRepository<CalendarMark, UUID> {

}
