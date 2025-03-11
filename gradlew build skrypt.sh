#!/usr/bin/env bash

rm build/libs/*.jar
./gradlew build

found_jar=false
for file in build/libs/*.jar; do
    if [ -f "$file" ]; then
        cp "$file" ~/project/
        found_jar=true
    fi
done

if [ "$found_jar" = false ]; then
    echo "Compilation Error" >&2
fi