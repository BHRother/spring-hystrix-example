package com.github.bhrother

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
/**
 * Created by brunohenriquerother on 19/07/2017.
 */
@Slf4j
@Service
class BookService {

  @Autowired
  RestTemplate restTemplate

  @Value('${bookstore.url}')
  String bookstoreUrl

  @HystrixCommand(fallbackMethod = "reliable")
  String readingList() {
    log.info("Trying reach external service")
    URI uri = URI.create(bookstoreUrl)

    return this.restTemplate.getForObject(uri, String.class)
  }

  String reliable() {
    log.error("Got reliable method")
    return "Cloud Native Java (O'Reilly)"
  }

}
