package com.csair.b2c.cloud.test.feign.controller;

import com.csair.b2c.cloud.test.feign.dao.ReadingListRepository;
import com.csair.b2c.cloud.test.feign.model.Book;
import com.csair.b2c.cloud.test.feign.props.PersonProperties;
import com.csair.b2c.cloud.test.feign.theme.Encoreable;
import com.csair.b2c.cloud.test.feign.theme.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
@RequestMapping("/")
public class ReadingListController {
	private ReadingListRepository readingListRepository;
	@Value("${feign.my.amazonID}")
	private String amazonId;
	@Value("${feign.secret.url}")
	private String environment;

	@Autowired
	public ReadingListController(ReadingListRepository readingListRepository) {
		this.readingListRepository = readingListRepository;
	}

	@Autowired
	private PersonProperties PersonProperties;

	@Autowired
	Environment env;

	@Autowired
	RedisTemplate<String, Serializable> redisTemplate;

	@Autowired
	Performance performance;

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	@ResponseBody
	public PersonProperties show(HttpServletRequest request, int a) {
		HttpSession session = request.getSession();
		String id = session.getId();
		System.out.println(id);

		session.setAttribute("why", "hello world");

		redisTemplate.opsForHash().put("12345678", "kkk", "why is not");
		System.out.println(session.getAttribute("why"));

		System.out.println(Arrays.toString(env.getDefaultProfiles()));
		System.out.println(env.getProperty("environment"));
		System.out.println(PersonProperties.getList().size());

		System.out.println(performance.perform(a));

		return PersonProperties;
	}

	@RequestMapping(value = "/{reader}", method = RequestMethod.GET)
	public String readersBooks(@PathVariable("reader") String reader, Model model) {
		List<Book> readingList = readingListRepository.findByReader(reader);
		if (readingList != null) {
			model.addAttribute("books", readingList);
			model.addAttribute("amazonID", amazonId);
			model.addAttribute("environment", environment);
		}
		return "readingList";
	}

	@RequestMapping(value = "/{reader}", method = RequestMethod.POST)
	public String addToReadingList(@PathVariable("reader") String reader, Book book) {
		book.setReader(reader);
		readingListRepository.save(book);
		return "redirect:/{reader}";
	}

	@GetMapping("/test/{day}")
	@ResponseBody
	public String getForDay(@PathVariable @DateTimeFormat(iso = ISO.DATE) Date day) {
		System.out.println(day);
		return day.toString();
	}

	@RequestMapping("/regular/{version:\\d\\.\\d\\.\\d}{extension:\\.[a-z]+}")
	@ResponseBody
	public String handle(@PathVariable String version, @PathVariable String extension) {
		System.out.println(version + " " + extension);
		return version + " " + extension;
	}

	@ModelAttribute
	public void populateModel(String number, Model model) {
		model.addAttribute("a", "hello world");
		model.addAttribute("date", new Date());
	}

	@RequestMapping("/something")
	public ResponseEntity<String> handle(HttpEntity<byte[]> requestEntity, Model model)
			throws UnsupportedEncodingException {
		System.out.println(model.asMap().get("date"));
		HttpHeaders requestHeader = requestEntity.getHeaders();
		byte[] requestBody = requestEntity.getBody();

		// do something with request header and body
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
	}

	@PostMapping
	public Callable<String> processUpload(final MultipartFile file) {

		return new Callable<String>() {
			public String call() throws Exception {
				return "someView";
			}
		};

	}

	@PostMapping({ "testList", "testNewMethod" })
	public void testList(@RequestBody List<String> memberNoList) {
		System.out.println(memberNoList.size());
		Encoreable encoreable = (Encoreable) performance;
		encoreable.performEncore();
		System.out.println(restTemplate.getForObject("http://127.0.0.1:8100/portal/spring/test/1", String.class));
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

}
