# spring-hello

This is a sample Maven project with a "hello world" SpringBoot application.

To build: ``mvn clean package``

To run: ``java -jar target/hello-0.0.1-SNAPSHOT.jar``

SpringBoot is configured to run on port 8081. You can change this by editing ``src/main/resources/application.properties``

## Creating inoculated JAR

- Copy ``target/hello-0.0.1-SNAPSHOT.jar`` (e.g. to ``hello.jar``)
- Use the CLT with the --inoculate option to create the inoculated jar file:

    java -jar mergebase.jar --inoculate --name="SpringBoot HelloWorld" hello.jar

You can now run hello.jar and it will report to the dashboard associated with the CLT
