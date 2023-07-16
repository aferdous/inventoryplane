# inventoryplane

## How to run the application?
1. Please see the wmssimulator README.doc for apache kafka installation. wmssimulator
is the producer of events and inventoryplane is the consumer of events. 

2. Open the project on IntelliJIdea (I am using the free community edition).
    - As an alternate you can just use maven to build the project.
3. Run com.sunpower.scale.inventoryplane.InventoryPlane application.
    - check console.
    - There should be logs showing that messages being consumed and being processed. 
   
## Notes to help with navigating code

1. Key entry point classes
    - InventoryPlane - the springboot application
    - service.InventoryMovementListener - listening for Inventory movement events and storing in an RDBMS. 
    - service.ProcessInventoryMovementRecords - A scheduler to process unprocessed records and send updates to ERP. 
    - In general, the application follows a typical Springboot application structure with dto, entity, service, repository.
   
2. resources/application.properties - contains configuration for Apacke Kafka consumer.
3. Lombok is used to avoid boilerplate codes. 
4. To keep it simple for development, the application uses an in-memory datastore H2 to store and process the incoming events. It can be easily replaced 
with MySQL or Postgress later. 
5. 

   