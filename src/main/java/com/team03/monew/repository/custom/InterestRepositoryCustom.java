package com.team03.monew.repository.custom;

import com.team03.monew.dto.interest.CursorPageResponseInterestDto;
import java.time.LocalDateTime;
import java.util.UUID;

// InterestRepositoryCustom.java
public interface InterestRepositoryCustom {
  public CursorPageResponseInterestDto searchInterests(
      UUID userId,
      String keyword,
      String orderBy,
      String direction,
      String cursor,
      LocalDateTime after,
      int limit
  );
}
