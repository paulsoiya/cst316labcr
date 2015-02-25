package banking.primitive.core;

/*
File: AccountServerFactory.java	
Author:	kevinagary
Date:	25 February 2015

Description: Set up factory for creating accounts.
*/

public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
