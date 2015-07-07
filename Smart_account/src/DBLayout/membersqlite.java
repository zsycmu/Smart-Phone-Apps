package DBLayout;

import java.util.List;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class membersqlite extends SQLiteOpenHelper{

	public membersqlite(Context context, String name, CursorFactory factory,
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
	
	// Adding new contact
	public void addContact(Contact contact) {}
	 
	// Getting single contact
	public Contact getContact(int id) {
		return null;
	}
	 
	// Getting All Contacts
	public List<Contact> getAllContacts() {
		return null;
	}
	 
	// Getting contacts Count
	public int getContactsCount() {
		return 0;
	}
	// Updating single contact
	public int updateContact(Contact contact) {
		return 0;
	}
	 
	// Deleting single contact
	public void deleteContact(Contact contact) {
		
	}
}
