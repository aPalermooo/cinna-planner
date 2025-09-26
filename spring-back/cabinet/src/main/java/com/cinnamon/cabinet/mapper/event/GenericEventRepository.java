package com.cinnamon.cabinet.mapper.event;

import com.cinnamon.cabinet.domain.event.GenericEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface GenericEventRepository extends MongoRepository<GenericEvent, UUID> {

}
