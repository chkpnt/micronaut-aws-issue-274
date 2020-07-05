#!/bin/sh
docker build . -t micronaut-aws-issue-274
mkdir -p build
docker run --rm --entrypoint cat micronaut-aws-issue-274  /home/application/function.zip > build/function.zip

sam local start-api -t sam.yaml -p 3000

