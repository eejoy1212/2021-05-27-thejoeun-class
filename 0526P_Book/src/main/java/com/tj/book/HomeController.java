package com.tj.book;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
///////////////////////////////////////////////////////////
	
	@RequestMapping("/form")
	public String call_input_form()
	{
		return "input_form";
	}
	
	@RequestMapping(value="/savdprocess", method = RequestMethod.POST)//DB저장
	public String call_save(BookDTO bookDTO)
	{
		
		String book = bookDTO.getBook();
		String author = bookDTO.getAuthor();
		String booknum = bookDTO.getBooknum();
		int price = bookDTO.getPrice();
		
		Book_Inter bi = sqlSession.getMapper(Book_Inter.class);
		bi.input_save(book, author, booknum, price);
		
		return "redirect:list";
	}
	
	
	@RequestMapping("/list")	//전체 자료 출력
	public String call_list(Model model)
	{
		Book_Inter bi = sqlSession.getMapper(Book_Inter.class);
		ArrayList<BookDTO> booklist = bi.list_out();
		model.addAttribute("list", booklist);		
		
		return "list_out";
	}
	
	@RequestMapping("/modify_view")
	public String call_modify_view(HttpServletRequest hs, Model model)
	{
		String booknum = hs.getParameter("booknum");
		Book_Inter bi = sqlSession.getMapper(Book_Inter.class);
		BookDTO mlist = bi.modifyView_out(booknum);
		model.addAttribute("mm", mlist);
		return "modify_view";
	}
	
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String call_modify(BookDTO bookDTO)
	{
		
		Book_Inter bi = sqlSession.getMapper(Book_Inter.class);
		bi.modify(bookDTO.getBook(), bookDTO.getAuthor(), bookDTO.getPrice(), bookDTO.getBooknum());
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete_pro")
	public String call_delete(HttpServletRequest hs)
	{
		String booknum = hs.getParameter("booknum");
		
		Book_Inter bi = sqlSession.getMapper(Book_Inter.class);
		bi.delete(booknum);	
		
		return "redirect:list";
	}
	
	
	
	
	
	
	
	
	
	
}
