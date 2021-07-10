package com.arpit.examples.actuator.healthcheck;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SampleHealthCheck {

  @PersistenceContext
  private EntityManager em;

  @Bean
  public HealthIndicator sampleHealthIndicator() {
    return new HealthIndicator() {

      @Override
      @Transactional
      public Health health() {
        Session session = em.unwrap(Session.class);
        return Health.status(Status.UP).build();
      }
    };
  }
}
