#!/bin/bash

curl -H "Authorization: Bearer ${DB_ACCESS_TOKEN}" -n -X POST https://demo.cloud.databricks.com/api/2.0/workspace/import \
     -F path="/Users/lorenz.verzosa@databricks.com/CICD/Staging/WordCount" -F format=SOURCE -F language=SCALA -F overwrite=true -F content=@WordCount.scala

