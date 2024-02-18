FROM eclipse-temurin:17.0.9_9-jre-ubi9-minimal

ENV JAVA_TOOL_OPTIONS='-agentlib:jdwp=transport=dt_socket,address=*:7001,server=y,suspend=n'

ARG JAR="app/target/app-1.0-SNAPSHOT.jar"

# ARG JAR="/tmp/buildkit-mount3322149743/app/target/app-1.0-SNAPSHOT.jar"
# ARG JAR=".github/workspace/tariffCalculator.jar"

RUN pwd

# COPY $JAR /tariffCalculator.jar

COPY . .

ENTRYPOINT ["java","-jar"]
CMD ["tariffCalculator.jar"]
