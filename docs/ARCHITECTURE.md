# Architecture

## Overview

Kosmos is a web-application focused on groups of knowledge organized in trees.

## Structure

The project is organized using package by feature, so each feature will have its own package, making it easier to find
files that are of the same feature. i.e.: The main feature of Kosmos is Group. Its package can contain GroupService,
GroupDAO, GroupTO, GroupRepository, GroupBean, GroupController... all in the same package, and not mixing with other
features, just because it's the same pattern.

## Decisions

### Backend: Java Spring Boot

Its strong typing and mature ecosystem is robust and fits well with the author and the project's domain.

### Frontend: React

Chosen for its simplicity, large community, and wide adoption in the market.

### Database: Neo4j

Chosen because the project is about nodes in trees, and Neo4j is good with graph like structures,
perfect for the project.

### Container: Docker

With Docker anyone can simply clone the repository, run docker and the app is ready to run. No need for
manual and annoying installations.

### ADR-001: Group as the central domain entity

#### Context

Kosmos organizes knowledge in hierarchical trees. The system needs a universal entity to represent any node in those
trees.

#### Decision

It was decided 'Group' entity is the central domain concept. A Group can have a parent Group and multiple children
Groups,
forming the tree.

#### Consequences

- All knowledge domains (biology, linguistics, mineralogy) are represented as Group hierarchies
- The model is flexible and domain-agnostic