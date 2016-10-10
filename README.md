# LAPP/Galaxy Docker Appliance

**WIP (Work In Progress)**

## Contents

1. [Introduction](#introduction)
1. [Pre-requisites](#pre-requisites)
1. [Usage](#usage)
1. [Service Containers](#service_containers)
1. [Galaxy Configuration](#galaxy-configuration)
1. [Docker Compose](#docker-compose)

## Introduction

A **LAPPS/Galaxy Docker Appliance**, or simply an *appliance*, is a network of Docker containers running [Galaxy](https://galaxyproject.org) configured with a selected set of LAPPS Grid web services. Where web services are organized into one or more other Docker containers.  Typically services are organized into Docker images by family, that is one container for StanfordNLP service, another container for Lingpipe, one for a MASC Datasource and Solr instance etc.  Assembling an appliance requires three things.

1. The Docker images.  The specifications for several services are included here for reference and more will be added.  However, images can be pulled from any repository, they do not need to be defined here.
1. The Galaxy customizations.  Galaxy's tool_conf.xml file will need to be updated and the tool XML wrappers and scripts need to be copied to Galaxy's `tool` directory.  **Note:** tools are not installed from Galaxy's Tool Shed since the tools used in an appliance do not make sense outside the context of the appliance.  That is, other users would not be able to install the tools and use them so it does not make sense to deploy them to a tool shed.
1. The `docker-compose.yml` file needed to wire everything together.

Some scripts and tools are provided to automate as much of the task as possible, but it is not too difficult to do everything by hand.

## Pre-requisites

The `make-appliance` script expects the [Tool Config Editor](https://github.com/oanc/tool-conf-editor) to be available and the `tce` script used to launch the editor is available on the system `$PATH`.  A pre-built binary distribution of the Tool Conf Editory is available [here](http://www.anc.org/downloads/ToolConfEditor-latest.tgz).

## Usage

```bash
$> ./make-appliance module [module ...]
```

where a `module` is the name of the Docker containers to include in the appliance.

**EXAMPLE**

```bash
```

## Service Containers

The web services running the Docker service containers should support the [LAPP Grid API](http://wiki.lappsgrid.org/org.lappsgrid.api/apidocs/index.html). While not a hard requirement, it does make it easier to compose workflows in Galaxy if all service speak the same APIs and data formats.

## Galaxy Configuration

## Docker Compose





