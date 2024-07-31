package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.WhatsappServiceInterface;

public class WhatsappController implements WhatsappControllerInterface {

	@Override
	public void createProfileController() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name=scan.next();
		
		System.out.println("Enter the password:");
		String password=scan.next();
		
		System.out.println("Enter the email:");
		String email=scan.next();
		
		System.out.println("Enter the address:");
		String address=scan.next();
		
		WhatsappUser wu=new WhatsappUser();
		
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		WhatsappServiceInterface wi = new WhatsappService();
		int i=wi.createProfileService(wu);
		
		if(i>0) {
			System.out.println("Profile created");
		}
		else {
			System.out.println("Profile rejected");
		}

	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub

	}

}
