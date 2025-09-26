package com.cinnamon.cabinet.mapper.event;

import com.cinnamon.cabinet.domain.event.GenericEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenericEventRepository extends MongoRepository<GenericEvent, String> {

}
