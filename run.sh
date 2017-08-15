#! /bin/bash

aws lambda invoke --function-name SimpleLambda results.json
cat results.json
rm results.json
