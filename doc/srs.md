# SRS


# Introduction

## Purposee

The following document shall serve to formally specify the requirements of an
application created as part of the 2017 ESE lecture at the university of Bern.

It is intended to be read by any atendees of said course, as well as by the
teaching assistants.

This product will hereafter by referred to by its name: FIXME.

## Stakeholders

- 'Developers': ESE Team 5 (Pascal Gerig, Irvin Hofstetter, Michael Senn, Marcel Zauder)
- 'Customer': Teaching assistants

## Definitions

## System Overview

## References


# Overall Description

## Product Perspective

The software shall be self-contained, providing a full suite of tools to
schedule, update, track and create reports of item deliveries.

It will not interface with external APIs, or control hardware devices.

### Software Interfacecs

#### Java

The software *must* be written in Java 8.

#### MySQL / MariaDB

The software *must* use MySQL 5.5 - or the compatible MariaDB version - as a
database backend.

## Use Cases

The following section shall provide a high-level business-orientied listing
of all functionality the application must fulfill.

### Items & Orders

- Creating new orders, consisting of multiple items each.
- Modifying existing orders and items.

### Tours

- Creating new delivery tours, consisting of multiple undelivered items each.
- Confirming delivery per-item.
- Specifying failure of delivvery per-item.

### Reporting


## User Characteristics


# Specific Requirements

## Functional Requirements

## Non-Functional Requirements
