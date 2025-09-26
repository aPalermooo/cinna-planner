package com.cinnamon.cabinet.mapper.planner;

import com.cinnamon.cabinet.domain.planner.event.GenericEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface GenericEventRepository extends MongoRepository<GenericEvent, UUID> {

}
