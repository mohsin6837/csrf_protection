package com.dev.csrf.controllers.services;

import com.dev.csrf.controllers.dtos.ContentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService
{
  private final List<ContentDto> messages=new ArrayList<>();
  public List<ContentDto> getMessages()
  {
    return messages;
  }

  public ContentDto createMessage(ContentDto contentDto)
  {
    messages.add(contentDto);
    return contentDto;
  }
}
