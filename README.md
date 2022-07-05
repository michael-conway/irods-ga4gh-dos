<h1 align="center"> iDRS - GA4GH Data Repository Service for iRODS </h1> <br>

<p align="center">
 iDR - GA4GH Data Repository Service for iRODS
</p>


## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Building](#building)
- [Testing](#testing)
- [API](#requirements)



## Introduction

This is a partial implementation of a new REST API for iRODS based on the Jargon libraries, whose primary function is to provide tokens (JWTs) and provide file transfer for iRODS files.


## Features


## Requirements

The application can be run locally or in a docker container, the requirements for each setup are listed below.


### Local


### Docker


### Run Local



### Run Docker Compose

## Building

This is a Spring Boot application written in the Java language. iDRS utilizes the Jargon libraries (https://github.com/DICE-UNC/jargon) as a 'zero install' client. Maven is used as the build environment.


## Testing


JUnit testing of the components of the DRS iRODS implementation follow the approach of the underlying Jargon libraries. See this general guide: https://github.com/DICE-UNC/jargon/blob/master/docker-test-framework/DOCKERTEST.md





