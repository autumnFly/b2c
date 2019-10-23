package com.csair.b2c.cloud.test.feign;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.csair.b2c.cloud.test.feign.model.Book;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FeignApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@WebAppConfiguration
public class MockMvcWebTests {
	@Autowired
	private WebApplicationContext webContext;
	private MockMvc mockMvc;
	@Value("${local.server.port}")
	private int port;

	@Before
	public void setupMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
	}

	@Test(expected = Exception.class)
	public void homePage() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/readingList")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.view().name("readingList"))
				.andExpect(MockMvcResultMatchers.model().attributeExists("books"))
				.andExpect(MockMvcResultMatchers.model().attribute("books", Matchers.is(Matchers.empty())));
	}

	@Test
	public void postBook() throws Exception {
		mockMvc.perform(
				post("/readingList").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("title", "BOOK TITLE")
						.param("author", "BOOK AUTHOR").param("isbn", "1234567890").param("description", "DESCRIPTION"))
				.andExpect(status().is3xxRedirection()).andExpect(header().string("Location", "/readingList"));

		Book expectedBook = new Book();
		expectedBook.setId(1L);
		expectedBook.setReader("craig");
		expectedBook.setTitle("BOOK TITLE");
		expectedBook.setAuthor("BOOK AUTHOR");
		expectedBook.setIsbn("1234567890");
		expectedBook.setDescription("DESCRIPTION");
		mockMvc.perform(get("/readingList")).andExpect(status().isOk()).andExpect(view().name("readingList"))
				.andExpect(model().attributeExists("books")).andExpect(model().attribute("books", hasSize(1)))
				.andExpect(model().attribute("books", contains(samePropertyValuesAs(expectedBook))));
	}

}
