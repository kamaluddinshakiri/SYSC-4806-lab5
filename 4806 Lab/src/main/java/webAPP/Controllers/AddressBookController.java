package webAPP.Controllers;

import webAPP.Models.AddressBook;
import webAPP.Models.repo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import webAPP.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressBookController {

	@Autowired
	private repo book;

	@GetMapping("/")
	public String getBook(Model model)
	{
		AddressBook bb = book.findAll().get(0);
		model.addAttribute("buds", bb.getBuddies());
		return "addressBookWeb";
	}

}
