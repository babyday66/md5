#!/bin/bash

# Build script for MD5 Service with Java 21 module access flags

export MAVEN_OPTS="--add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED"

echo "Building MD5 Service with Maven..."
mvn clean package -DskipTests

if [ $? -eq 0 ]; then
    echo "✅ Build completed successfully!"
    echo "To run the application, execute: ./run.sh"
else
    echo "❌ Build failed!"
    exit 1
fi
