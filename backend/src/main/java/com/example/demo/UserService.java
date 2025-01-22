package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	// 임의로 wrapping 함수
	public User findByLongId(long id) {
		Optional<User> opt = this.userRepository.findById(id);
		if( opt.isPresent() )	return opt.get();
		return null;
	}
}
