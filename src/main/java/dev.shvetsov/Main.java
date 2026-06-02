package dev.shvetsov;

import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowOptions;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.serviceclient.WorkflowServiceStubsOptions;

public class Main {

  static void main() throws InterruptedException {
    Thread workerThread = new Thread(new WorkerStarter());
    workerThread.start();
    Thread.sleep(2000);

//    WorkflowServiceStubs service = WorkflowServiceStubs.newServiceStubs(
//        WorkflowServiceStubsOptions.getDefaultInstance()
//    );
//    WorkflowClient client = WorkflowClient.newInstance(service);
//    GreetingWorkflow workflow = client.newWorkflowStub(
//        GreetingWorkflow.class,
//        WorkflowOptions.newBuilder()
//            .setTaskQueue("GREETING_TASK_QUEUE")
//            .build()
//    );
//    String greeting = workflow.getGreeting("Evgeniy");
//    System.out.println("Result: " + greeting);
  }
}
