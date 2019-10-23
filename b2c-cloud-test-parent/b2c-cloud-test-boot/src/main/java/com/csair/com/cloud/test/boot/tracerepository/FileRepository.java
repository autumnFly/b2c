// package com.csair.com.cloud.test.boot.tracerepository;
//
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.RandomAccessFile;
// import java.util.ArrayList;
// import java.util.Date;
// import java.util.List;
// import java.util.Map;
// import java.util.Scanner;
//
// import javax.annotation.PostConstruct;
//
// import org.springframework.boot.actuate.trace.Trace;
// import org.springframework.boot.actuate.trace.TraceRepository;
// import org.springframework.stereotype.Service;
//
// import com.alibaba.fastjson.JSONObject;
//
// @Service
// public class FileRepository implements TraceRepository {
//
// 	private RandomAccessFile traceFile;
//
// 	@Override
// 	public void add(Map<String, Object> arg0) {
// 		try {
// 			traceFile.writeChars(JSONObject.toJSONString(arg0, true));
// 			traceFile.writeChars("@");
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
//
// 	}
//
// 	@Override
// 	public List<Trace> findAll() {
// 		List<Trace> traces = new ArrayList<>();
// 		Scanner scanner;
// 		try {
// 			scanner = new Scanner(new File(System.getProperty("java.io.tmpdir") + "\\trace.log"));
// 			scanner.useDelimiter("@");
// 			while (scanner.hasNextLine()) {
// 				System.out.println(scanner.next());
// 				System.out.println();
// 				traces.add(new Trace(new Date(), JSONObject.parseObject(scanner.next(), Map.class)));
// 			}
// 			scanner.close();
// 		} catch (FileNotFoundException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		}
// 		return traces;
// 	}
//
// 	public FileRepository() {
// 		System.out.println("constract");
// 	}
//
// 	public void init() {
// 		System.out.println("init");
// 	}
//
// 	@PostConstruct
// 	public void cons() throws Exception{
// 		traceFile=new RandomAccessFile(new File(System.getProperty("java.io.tmpdir") + "\\trace.log"), "rw");
// 		System.out.println("post");
// 	}
//
//
// }
