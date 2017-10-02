# SRS


# Introduction

## Purposee

The following document shall serve to formally specify the requirements of an
application created as part of the 2017 ESE lecture at the university of Bern.

It is intended to be read by any atendees of said course, as well as by the
teaching assistants.

This product will hereafter by referred to by its name: TODO.

## Stakeholders

- 'Developers': ESE Team 5 (Pascal Gerig, Irvin Hofstetter, Michael Senn, Marcel Zauder)
- 'Customer': Teaching assistants

## Definitions

None

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

#### Creating new items and order

As a logistics manager, I want to register new orders, consisting of multiple items, in the system.

#### Modifying items and order

I want to be able to modify items, and the orders they're assigned to, after they're created.

#### Viewing pending orders

As a logistics manager, I want to be able to view all orders where there are
non-fulfilled items, so I can plan tours.

### Tours

#### Creating new tours

As a logistics manager, I want to create new delivery tours, consisting of
multiple items which to deliver.

When creating a new tour, I want to be able to select all items which were not
delivered yet, or for which delivery failed.

#### Starting & ending tour

As a driver, I want to update the system when I start and end the tour.

#### Tracking items during tour

As a driver I want to be able to update - for each item - whether I was able to
deliver the item or not.
If delivery failed, I want to be able to indicate exactly why it failed.

#### Tracking of fulfillment time

As a logistics manager I want the system to automatically track how long each
tour took. That is, the time between the driver starting, and ending, the tour.

### Reporting

As a logistics manager I want to be able to compare the estimated with the actual duration of a tour, in order to investigate outliers.

## User Characteristics

Users of this application will be non-technical personnel. Logistics managers
will have some familiarity with office software, whereas truck drivers will
not.

All users will be familiar with those parts of the company's logistics workflow
which they are involved with.

# Specific Requirements

## Functional Requirements

### Item

An Item is one ore more physical objects of the same type.

Tracking of states must happen on a per-item basis.

### Order

An order is a collection of items which were bought together.

#### Management

- Logistics manager have to be able to see all pending orders.

### Tour

A tour is an attempt to deliver multiple items to their recipients.

#### Attributes

Tours must have fields for:
- The date the tour is for
- A time estimate
- The time it actually took

#### Management

- Logistics managers must be able to create tours containing:
  - Not yet delivered items
  - Items for which delivery failed

- The system must be able to automatically assemble some tours.
  - CUSTOMER: How? Location? Time? Time estimate?

#### Execution

- Drivers must see their assigned tours of the next few days.

- During execution of a tour:
  - Drivers must be able to update the system when they start a tour
  - Drivers must be able to update the system whether they managed / failed to deliver an item.
  - Drivers must be able to update the system when the tour is finished.

#### Reporting

- The system must be able to compare the time estimate with the actual time it took.
  - It must be able to automatically report tours where the difference is more than a configurable value.

## Non-Functional Requirements
