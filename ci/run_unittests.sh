#!/bin/sh

mvn -version

cd repo-releasetest
mvn test
