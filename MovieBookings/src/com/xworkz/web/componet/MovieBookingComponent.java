package com.xworkz.web.componet;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.web.dto.MovieTicketDTO;

@Component
@RequestMapping("/")
public class MovieBookingComponent {

	@Resource
	@Qualifier("moviemap")
	private HashMap<String, Double> moviemap;

	public MovieBookingComponent() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value="/onclicking",method=RequestMethod.POST)
	public String OnDisplaying(MovieTicketDTO dto, ModelMap model) {

		if (moviemap.containsKey(dto.getTheatreName())) {
			//dto.setPrice(moviemap.get(dto.getTheatreName()));
			dto.setPrice(((dto.getNoOfTickets() * moviemap.get(dto.getTheatreName())) * 1.12));
			 model.addAttribute("dto", dto);
		}

		return "Display.jsp";

	}

	/*
	 * @RequestMapping(value="/onclicking",method=RequestMethod.POST) public String
	 * OnDisplaying(MovieTicketDTO dto, ModelMap model) { System.out.println(dto);
	 * dto.setPrice(((dto.getNoOfTickets() * dto.getTheatreName()) * 1.12));
	 * System.out.println(dto.getPrice()); model.addAttribute("dto", dto); return
	 * "Display.jsp"; }
	 */

	@InitBinder
	public void init(WebDataBinder dataBinder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		format.setLenient(true);
		dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(format, false));

	}

}