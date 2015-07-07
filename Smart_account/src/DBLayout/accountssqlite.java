package DBLayout;

import java.util.List;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class accountssqlite extends SQLiteOpenHelper{

	public accountssqlite(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	// Adding new Account
	public void addAccount(Account Account) {}
	 
	// Getting single Account
	public Account getAccount(int id) {
		return null;
	}
	 
	// Getting All Accounts
	public List<Account> getAllAccounts() {
		return null;
	}
	 
	// Getting Accounts Count
	public int getAccountsCount() {
		return 0;
	}
	// Updating single Account
	public int updateAccount(Account Account) {
		return 0;
	}
	 
	// Deleting single Account
	public void deleteAccount(Account Account) {
		
	}
}
