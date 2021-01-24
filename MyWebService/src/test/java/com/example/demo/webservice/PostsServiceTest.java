package com.example.demo.webservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Posts;
import com.example.demo.domain.PostsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsServiceTest {
	@Autowired
	private PostsService postsService;
	
	@Autowired
	private PostsRepository postsRepository;
	
	@After
	public void cleanup() {
		postsRepository.deleteAll();
	}
	
	@Test
	public void dtoDateSaveToPostsTable() {
		//given
		PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
				.author("test author")
				.content("test content")
				.title("test title")
				.build();
		
		//when
		postsService.save(dto);
		
		//then
		Posts posts = postsRepository.findAll().get(0);
		assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
		assertThat(posts.getContent()).isEqualTo(dto.getContent());
		assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
		
	}
}
