package com.facebook.controller;

import java.util.Scanner;

import com.facebook.entity.FacebookUser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;
import com.facebook.view.FacebookView;

public class FacebookController implements FacebookControllerInterface {

	@Override
	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter Password");
		String password=sc.next();
		
		System.out.println("Enter email");
		String email=sc.next();
		
		System.out.println("Enter Address");
		String address=sc.next();
		
		FacebookUser fc=new FacebookUser();
		fc.setName(name);
		fc.setPassword(password);
		fc.setEmail(email);
		fc.setAddress(address);
		
		FacebookServiceInterface fi=new FacebookService();
		int i=fi.createProfileService(fc);
	
		
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
	public void deleteProfileController() {
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
	public void viewAllProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub

	}

}
