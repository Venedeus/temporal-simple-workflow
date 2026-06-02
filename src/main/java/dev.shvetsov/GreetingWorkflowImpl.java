package dev.shvetsov;

import io.temporal.activity.ActivityOptions;
import io.temporal.workflow.Workflow;
import java.time.Duration;
import org.slf4j.Logger;

public class GreetingWorkflowImpl implements GreetingWorkflow {
  private static final Logger logger = Workflow.getLogger(GreetingWorkflowImpl.class);
  private final GreetingActivities activities = Workflow.newActivityStub(
      GreetingActivities.class,
      ActivityOptions.newBuilder().setStartToCloseTimeout(Duration.ofSeconds(5)).build()
  );

  @Override
  public String getGreeting(String name) {
    logger.info("Before activity");
    String greet = activities.composeGreeting(name);
    logger.info("Greet from workflow: {}", greet);
    return greet;
  }
}
