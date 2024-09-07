package com.dev.csrf.controllers;

import com.dev.csrf.controllers.dtos.ContentDto;
import com.dev.csrf.controllers.services.ContentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ContentController
{
  private final ContentService contentService;

  public ContentController(ContentService contentService)
  {
    this.contentService = contentService;
  }

  @GetMapping("/messages")
  public ResponseEntity<?> message()
  {
    return ResponseEntity.ok(contentService.getMessages());
  }

  @PostMapping("/messages")
  public ResponseEntity<ContentDto> createMessage(@RequestBody ContentDto contentDto){
    return ResponseEntity.ok(contentDto);
  }
}
