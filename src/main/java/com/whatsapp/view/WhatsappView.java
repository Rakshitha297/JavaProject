package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;
import com.whatsapp.controller.WhatsappControllerInterface;

public class WhatsappView {

	public static void main(String[] args) {
		System.out.println("*******************MAIN MENU********************");
		System.out.println("Press 1 for create profile");
		System.out.println("Press 2 for view profile");
		System.out.println("Press 3 for edit profile");
		System.out.println("Press 4 for search profile");
		System.out.println("Press 5 for delete profile");
		System.out.println("Press 6 for viewAll profile");
		System.out.println("Press 7 for login profile");
		
		Scanner scan = new Scanner(System.in);
		int c=scan.nextInt();
		
		WhatsappControllerInterface wc = new WhatsappController();
		
		switch(c) {
		case 1: wc.createProfileController();
			break;
		case 2: wc.viewProfileController();
			break;
		case 3: wc.editProfileController();
			break;
		case 4: wc.searchProfileController();
			break;
		case 5: wc.deleteProfileController();
			break;
		case 6: wc.viewAllProfileController();
			break;
		case 7: wc.loginProfileController();
			break;
		default:
		
		}
				
		

	}

}
