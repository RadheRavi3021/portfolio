package com.poc.portfolio.enums;

public enum DatabaseTech {
  POSTGRESQL("PostgreSQL"), MONGODB("Mongo"), MYSQL("MySQL");

  private final String value;

  DatabaseTech(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
