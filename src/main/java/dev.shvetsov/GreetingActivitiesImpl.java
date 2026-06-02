package dev.shvetsov;

public class GreetingActivitiesImpl implements GreetingActivities {

  @Override
  public String composeGreeting(String name) {
    return "Hi " + name + "!";
  }
}
