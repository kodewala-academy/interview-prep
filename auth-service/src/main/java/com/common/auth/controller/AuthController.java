package com.common.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.auth.repository.UserRepository;
import com.common.auth.user.User;
import com.common.auth.util.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired UserRepository repo;
  @Autowired PasswordEncoder encoder;
  @Autowired JwtUtil jwt;

  @PostMapping("/register")
  public String register(@RequestBody User user) {
    user.setPassword(encoder.encode(user.getPassword()));
    repo.save(user);
    return "User registered";
  }

  @PostMapping("/generate-token")
  public String generateToken(@RequestBody User user) {
    User dbUser = repo.findByUsername(user.getUsername())
      .orElseThrow();

    if (!encoder.matches(user.getPassword(), dbUser.getPassword())) {
      throw new RuntimeException("Invalid credentials");
    }
    return jwt.generateToken(dbUser.getUsername(), dbUser.getRole());
  }
}
