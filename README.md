<h1 align="center"> Project Title </h1> <br>

<p align="center">
  GA4GH Data Repository Service for iRODS
</p>


## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Testing](#testing)
- [API](#requirements)



## Introduction

These libraries provide an implementation of the GA4GH Data Repository Service for iRODS (http://www.irods.org)

This release implements the 1.2.0 DRS specification (https://ga4gh.github.io/data-repository-service-schemas/preview/develop/docs/)



## Features


## Requirements

The application can be run locally or in a docker container, the requirements for each setup are listed below.


### Local


### Docker

* [Docker](https://www.docker.com/get-docker)

### Run Local

```bash
$ mvn spring-boot:run
```

Application will run by default on port `1234`

Configure the port by changing `server.port` in __application.yml__


### Run Docker

First build the image:
```bash
$ docker-compose build
```

When ready, run it:
```bash
$ docker-compose up
```

Application will run by default on port `1234`

Configure the port by changing `services.api.ports` in __docker-compose.yml__. Port 1234 was used by default so the value is easy to identify and change in the configuration file.


## Testing
