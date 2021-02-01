//package com.example.demo.domain;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.assertTrue;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//import org.junit.After;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class PostsRepositoryTest {
//	
//	@Autowired
//	PostsRepository postsRepository;
//	
//	@After
//	public void cleanup() {
//		postsRepository.deleteAll();
//	}
//	
//	@Test
//	public void contentSaveRead() {
//		
//		//given
//		postsRepository.save(Posts.builder().
//				title("test title")
//				.content("test content")
//				.author("test author")
//				.build());
//		
//		//when
//		List<Posts> postsList = postsRepository.findAll();
//		
//		//then
//		Posts posts = postsList.get(0);
//		assertThat(posts.getTitle(), is("test title"));
//		assertThat(posts.getContent(), is("test content"));
//	}
//	
//	@Test
//	public void BaseTimeEntityTest() {
//		//given
//		LocalDateTime now = LocalDateTime.now();
//		postsRepository.save(Posts.builder()
//				.title("test title")
//				.content("test content")
//				.author("author test")
//				.build());
//		
//		//when
//		List<Posts> postsList = postsRepository.findAll();
//		
//		//then
//		Posts posts = postsList.get(0);
//		assertTrue(posts.getCreatedDate().isAfter(now));
//		assertTrue(posts.getModifiedDate().isAfter(now));
//		
//	}
//}
