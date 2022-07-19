#!/bin/sh

if [ -f /tmp/cert/server.crt ];
then
   echo "Cert will be imported"
   keytool -delete -noprompt -alias mycert -keystore /usr/lib/jvm/default-jvm/jre/lib/security/cacerts -storepass changeit
   keytool -import -trustcacerts -keystore /usr/lib/jvm/default-jvm/jre/lib/security/cacerts -storepass changeit -noprompt -alias mycert -file /tmp/cert/server.crt
else
   echo "No cert to import"
fi

echo "running app"
java -jar /ga4gh-drs-service-0.0.2-SNAPSHOT.jar

