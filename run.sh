#!/bin/bash

# Run script for MD5 Service

export MAVEN_OPTS="--add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED"

echo "Starting MD5 Service..."
echo "Application will be available at http://localhost:8080"
echo ""

mvn spring-boot:run

if [ $? -ne 0 ]; then
    echo "❌ Failed to start the application!"
    exit 1
fi
