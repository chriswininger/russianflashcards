#!/bin/bash

#source ./.env

docker run \
  --network host -it \
  --rm -p 8888:8888 \
  -v "${PWD}/notebooks":/home/jovyan/work \
  chriswininger/infinite-notebook
