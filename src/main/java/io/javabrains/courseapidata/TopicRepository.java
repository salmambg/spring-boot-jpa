package io.javabrains.courseapidata;

import io.javabrains.courseapidata.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

}
