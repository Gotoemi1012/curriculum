package study;

class User {
	
	private String userName;
	private int id;
	private String password;
	
	public User(String userName, int id, String password) {
		this.userName = userName;
		this.id = id;
		this.password = password;
	}
	
	protected void printAccountInfo() {
		System.out.println("ユーザー名は、" + userName + "\nIDは、" + id + "\nパスワードは、" +password);
	}
	
}	
