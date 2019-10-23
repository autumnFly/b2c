// package com.csair.b2c.cloud.test.admin.command;
//
// import com.csair.b2c.cloud.test.admin.service.TranslationService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.shell.standard.ShellComponent;
// import org.springframework.shell.standard.ShellMethod;
// import org.springframework.shell.standard.ShellOption;
//
// import java.util.Locale;
//
// /**
//  * Created on 2019/4/24.
//  *
//  * @author yudong
//  */
// @ShellComponent
// public class TranslationCommands {
//
//     @Autowired
//     private TranslationService service;
//
//     @ShellMethod("Translate text from one language to another.")
//     public String translate(
//             @ShellOption String text,
//             @ShellOption(defaultValue = "en_US") Locale from,
//             @ShellOption(defaultValue = "zh_CN") Locale to
//     ) {
//         try {
//             return service.translate(text, from, to);
//         } catch (Exception e) {
//             e.printStackTrace();
//             return "";
//         }
//     }
// }
