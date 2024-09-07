package com.dev.csrf.controllers;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CsrfController
{
  @GetMapping("/token")
  public CsrfToken getToken(CsrfToken token){
    return token;
  }
}
