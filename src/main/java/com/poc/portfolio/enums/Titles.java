package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Titles {
  SOFTWARE_DEVELOPER("Software Developer"), POETRY_WRITER("Poetry Writer"), MUSIC_LOVER(
      "Music Lover");

  private final String value;

  Titles(String value) {
    this.value = value;
  }

}
