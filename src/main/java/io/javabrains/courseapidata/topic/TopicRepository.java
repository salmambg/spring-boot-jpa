package io.javabrains.courseapidata.topic;

import io.javabrains.courseapidata.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

}
