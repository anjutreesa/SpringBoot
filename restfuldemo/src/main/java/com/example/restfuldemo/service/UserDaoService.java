package com.example.restfuldemo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restfuldemo.model.Post;
import com.example.restfuldemo.model.User;
import com.example.restfuldemo.repository.UserRepository;
import com.example.restfuldemo.repository.PostRepository;

@Service
public class UserDaoService {
	private List<User> users = new ArrayList<>();

	private static int usersCount = 3;
	@Autowired
	UserRepository userRepository;
	@Autowired
	PostRepository postRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User user) {
		return userRepository.save(user);
	
	}

	public Optional<User> findById(int id) {
		return userRepository.findById(id);
	}

	public User deleteById(int id) {
		Optional<User> user = userRepository.findById(id);
		userRepository.deleteById(id);
		return user.get();
	}

	public Post save(Post post) {
		return postRepository.save(post);
		
	}

}
